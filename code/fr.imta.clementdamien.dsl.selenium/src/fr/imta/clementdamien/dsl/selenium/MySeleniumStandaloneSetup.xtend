/*
 * generated by Xtext 2.12.0
 */
package fr.imta.clementdamien.dsl.selenium


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MySeleniumStandaloneSetup extends MySeleniumStandaloneSetupGenerated {

	def static void doSetup() {
		new MySeleniumStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
