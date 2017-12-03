package fr.imta.clementdamien.dsl.selenium.generator.statement;

import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import java.util.List
import com.google.inject.Inject
import fr.imta.clementdamien.dsl.selenium.generator.*;

class StatementGenerator {
	
	@Inject extension ActionStatementGenerator;
	@Inject extension AssertStatementGenerator;
	@Inject extension AssignStatementGenerator;
	@Inject extension FunctionCallStatementGenerator;
	@Inject extension NavigationStatementGenerator;
	
	def compileStatements(Statements statements, Boolean isReturnNeeded) {
		
		val lastStatement = statements.statements.last
		
		statements.statements
			.map(statement | {
				val statementCompiled = statement.compileStatement
				
				val isLast = lastStatement == statement
				
				val statementCompiledPrefix = 
					if(isReturnNeeded && isLast && statement.shouldAddAReturn)
						"return "
					else ""
				
				statementCompiledPrefix + statementCompiled
			})
			.join("\n\n");
	}
	
	def dispatch compileStatement(Action action) { action.compile }
	
	def dispatch compileStatement(AssertEquals assert) { assert.compile }
	
	def dispatch compileStatement(AssertContains assert) { assert.compile }
	
	def dispatch compileStatement(AssignAction assign) { assign.compile }
	
	def dispatch compileStatement(FunctionCall fc) { fc.compile }
	
	def dispatch compileStatement(NavigationAction na) { na.compile }
	
	
	
	
	def dispatch shouldAddAReturn(Action action) {
		val actionName = action.action
		// 'click' | 'fill' | 'choose' | 'count' 
		if(actionName == "count")
			true
		else
			false
	}
	
	
	
	def dispatch shouldAddAReturn(AssertEquals assert) { false }
	
	def dispatch shouldAddAReturn(AssertContains assert) { false }
	
	def dispatch shouldAddAReturn(AssignAction assign) { false }
	
	def dispatch shouldAddAReturn(FunctionCall fc) { true }
	
	def dispatch shouldAddAReturn(NavigationAction na) { false }
	
}