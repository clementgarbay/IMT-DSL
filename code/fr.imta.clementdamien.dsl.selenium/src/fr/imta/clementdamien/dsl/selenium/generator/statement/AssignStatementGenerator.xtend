package fr.imta.clementdamien.dsl.selenium.generator.statement

import com.google.inject.Inject
import fr.imta.clementdamien.dsl.selenium.generator.VariableGenerator
import fr.imta.clementdamien.dsl.selenium.mySelenium.AssignAction

class AssignStatementGenerator {
	
	@Inject extension VariableGenerator;
	@Inject extension ActionStatementGenerator;
	
	def compile(AssignAction assignAction)
	'''By «assignAction.variable.compile» = «assignAction.target.compileActionTarget»;'''
}
