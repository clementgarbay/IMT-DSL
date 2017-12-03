package fr.imta.clementdamien.dsl.selenium.generator.statement



import fr.imta.clementdamien.dsl.selenium.generator.*;
import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import com.google.inject.Inject

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
    def dispatch compileAssertableElement(Projection projection) { projection.compile }
    def dispatch compileAssertableElement(FunctionCall fc) { fc.compile }
	
}