package fr.imta.clementdamien.dsl.selenium.generator.statement

import com.google.inject.Inject
import fr.imta.clementdamien.dsl.selenium.generator.ProjectionGenerator
import fr.imta.clementdamien.dsl.selenium.generator.VariableGenerator
import fr.imta.clementdamien.dsl.selenium.mySelenium.AssertContains
import fr.imta.clementdamien.dsl.selenium.mySelenium.AssertEquals
import fr.imta.clementdamien.dsl.selenium.mySelenium.FunctionCall
import fr.imta.clementdamien.dsl.selenium.mySelenium.Projection
import fr.imta.clementdamien.dsl.selenium.mySelenium.StringParameter
import fr.imta.clementdamien.dsl.selenium.mySelenium.Variable

class AssertStatementGenerator {
	
	@Inject extension VariableGenerator;
	@Inject extension FunctionCallStatementGenerator;
	@Inject extension ProjectionGenerator;
	
	def compile(AssertEquals assertEquals) '''
	assertEquals(«assertEquals.getAssertableElement().get(0).compileAssertableElement», «assertEquals.getAssertableElement().get(1).compileAssertableElement»);
    '''
	
	def compile(AssertContains assertContains) '''
	    	Assertions.assertThatCode(() -> {
	        «assertContains.container.compileAssertableElement».findElement(«assertContains.element.compileAssertableElement»);
	    	}).doesNotThrowAnyException();
    '''
	
	def dispatch compileAssertableElement(Variable variable) { variable.compile }
    def dispatch compileAssertableElement(StringParameter sp) '''"«sp.value»"'''
    def dispatch compileAssertableElement(Projection projection) { '''driver.findElement(«projection.compile»)''' }
    def dispatch compileAssertableElement(FunctionCall fc) { fc.compile }
	
}
