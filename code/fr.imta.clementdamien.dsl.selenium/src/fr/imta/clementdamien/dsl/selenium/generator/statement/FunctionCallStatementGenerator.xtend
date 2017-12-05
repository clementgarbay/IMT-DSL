package fr.imta.clementdamien.dsl.selenium.generator.statement

import com.google.inject.Inject
import fr.imta.clementdamien.dsl.selenium.generator.FunctionGenerator
import fr.imta.clementdamien.dsl.selenium.generator.VariableGenerator
import fr.imta.clementdamien.dsl.selenium.mySelenium.FunctionCall

class FunctionCallStatementGenerator {
	
	@Inject extension FunctionGenerator;
	@Inject extension VariableGenerator;
	
	def compile(FunctionCall functionCall) {
    		val params = 
    			if (functionCall.params !== null)
	    			functionCall.params.variables
		    			.filter(param | param !== null)
		    			.map(param | '''«param.compileVariableCall»''')
		    			.join(", ")
    			else ''''''
    			
	    '''«functionCall.ref.compile»(«params»);'''
    } 
}
