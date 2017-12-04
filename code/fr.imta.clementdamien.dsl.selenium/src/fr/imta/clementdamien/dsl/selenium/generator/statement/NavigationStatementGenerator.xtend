package fr.imta.clementdamien.dsl.selenium.generator.statement

import fr.imta.clementdamien.dsl.selenium.mySelenium.NavigationAction

class NavigationStatementGenerator {
	
	def compile(NavigationAction navigationAction) {
		if (navigationAction.action == "openBrowser")
			navigationAction.compileNavigationOpenBrowser
		else if (navigationAction.action == "go")
			navigationAction.compileNavigationGo
		else
			'''// Unknown navigation action `«navigationAction.action»`. Do you mean `openBrowser` or `go` ?'''
	}
	
	private def compileNavigationOpenBrowser(NavigationAction navigationAction) {
		if (navigationAction.param == "chrome") {
			'''
			service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File(CHROMEDRIVER_PATH))
				.usingAnyFreePort()
				.build();
			service.start();
            '''
		} else if (navigationAction.param == "firefox") {
			'''
			// TODO: Firefox driver not implemented 
			// Using chrome instead
			service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File(CHROMEDRIVER_PATH))
				.usingAnyFreePort()
				.build();
			service.start();
			'''
		} else {
			'''// Unknown browser `«navigationAction.param»` :/. Do you mean `firefox` or `chrome` ?'''
		}
	}
	
	private def compileNavigationGo(NavigationAction navigationAction) '''driver.get("«navigationAction.param»");'''
	
}