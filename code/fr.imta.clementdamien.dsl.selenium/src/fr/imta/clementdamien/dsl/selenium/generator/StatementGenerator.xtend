package fr.imta.clementdamien.dsl.selenium.generator

import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import java.util.List
import com.google.inject.Inject

class StatementGenerator {
	
	@Inject extension FunctionGenerator;
	@Inject extension VariableGenerator;
	
	def compileStatements(Statements statements) {
		statements.statements
			.map(statement | statement.compileStatement)
			.join("\n\n");
	}
	
	def dispatch compileStatement(Action action) '''// gen action'''
	
	def dispatch compileStatement(AssignAction assignAction) '''// gen assignAction'''
	
	def dispatch compileStatement(FunctionCall functionCall) {
    		val params = functionCall.params.variables
    			.map(param | '''«param.compileVariableCall»''')
    			.join(", ")
    			
	    '''«functionCall.ref.compile»(«params»);'''
    } 
	
	def dispatch compileStatement(AssertEquals assertEquals) '''// gen assertEquals'''
	
	def dispatch compileStatement(AssertContains assertContains) '''// gen assertContains'''
	
	
	
	def dispatch compileStatement(NavigationAction navigationAction) {
		if (navigationAction.action == "openBrowser")
			navigationAction.compileNavigationOpenBrowser
		else if(navigationAction.action == "go")
			navigationAction.compileNavigationGo
		else
			'''// Unknown navigation action `«navigationAction.action»`. Do you mean `openBrowser` or `go` ?'''
	}
	
	private def compileNavigationOpenBrowser(NavigationAction navigationAction) {
		if(navigationAction.param == "chrome"){
			'''
			service = new ChromeDriverService.Builder()
				                            .usingDriverExecutable(new File(CHROMEDRIVER_PATH))
				                            .usingAnyFreePort()
				                            .build();
			service.start();
            '''
		} else if(navigationAction.param == "firefox"){
			'''// todo openBrowser firefox'''
		} else {
			'''// Unknown browser `«navigationAction.param»` :/. Do you mean `firefox` or `chrome` ?'''
		}
	}
	private def compileNavigationGo(NavigationAction navigationAction) '''driver.get("«navigationAction.param»");'''
	
}