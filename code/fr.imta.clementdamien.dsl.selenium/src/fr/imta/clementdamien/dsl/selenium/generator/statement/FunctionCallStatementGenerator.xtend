package fr.imta.clementdamien.dsl.selenium.generator.statement


import fr.imta.clementdamien.dsl.selenium.generator.*;
import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import com.google.inject.Inject

class FunctionCallStatementGenerator {
	
	@Inject extension FunctionGenerator;
	@Inject extension VariableGenerator;
	
	def compile(FunctionCall functionCall) {
    		val params = functionCall.params.variables
    			.map(param | '''«param.compileVariableCall»''')
    			.join(", ")
    			
	    '''«functionCall.ref.compile»(«params»);'''
    } 
}