package fr.imta.clementdamien.dsl.selenium.generator;

import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import com.google.inject.Inject
import fr.imta.clementdamien.dsl.selenium.generator.statement.StatementGenerator

class FunctionGenerator {

	@Inject extension VariableGenerator;
	@Inject extension StatementGenerator;

    def compileAuxiliaryFunction(Function function) {
    		val params = 
    			if(function.params !== null)
    				function.params.compile
    			else ''''''
    	
	    '''
		    private Object «function.name.name»(«params») throws Exception {
		        «function.statements.compileStatements(true)»
		    }
	    '''
    }

    def compileMainFunction(MainFunction mainFunction) {
        '''
		@Test
		public void test() throws Exception {
			«mainFunction.statements.compileStatements(false)»
		}
    		'''
    }

    def buildMainFunctionFromStatements(Statements statements) {
       '''
		@Test
		public void test() throws Exception {
			«statements.compileStatements(false)»
		}
    		'''
    }
    
    
    def compile(FunctionName functionName) '''«functionName.name»'''


    private def compile(FunctionParameters functionParameters) {
        functionParameters.variables
            .map(variable | '''Object «variable.compile»''')
            .join(", ")
    }

}