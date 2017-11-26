package fr.imta.clementdamien.dsl.selenium.generator;

import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import com.google.inject.Inject

class FunctionGenerator {

	@Inject extension VariableGenerator;
	@Inject extension StatementGenerator;

    def compileAuxiliaryFunction(Function function) '''
	    private Object «function.name.name»(«function.params.compile»){
	        «function.statements.compileStatements»
	    }
    '''

    def compileMainFunction(MainFunction mainFunction) {
        '''
		@Test
		public void test() {
			«mainFunction.statements.compileStatements»
		}
    		'''
    }

    def buildMainFunctionFromStatements(Statements statements) {
       '''
		@Test
		public void test() {
			«statements.compileStatements»
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