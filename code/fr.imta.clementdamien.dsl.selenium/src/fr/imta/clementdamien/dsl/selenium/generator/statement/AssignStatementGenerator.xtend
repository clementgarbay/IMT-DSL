package fr.imta.clementdamien.dsl.selenium.generator.statement


import fr.imta.clementdamien.dsl.selenium.generator.*;
import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import com.google.inject.Inject

class AssignStatementGenerator {
	
	@Inject extension VariableGenerator;
	@Inject extension SelectorGenerator;
	
	
	def compile(AssignAction assignAction) '''
	WebElement «assignAction.variable.compile» = «assignAction.selector.compile»;
	'''

}