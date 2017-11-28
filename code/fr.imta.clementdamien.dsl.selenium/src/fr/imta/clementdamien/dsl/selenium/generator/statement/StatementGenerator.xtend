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
	
	def compileStatements(Statements statements) {
		statements.statements
			.map(statement | statement.compileStatement)
			.join("\n\n");
	}
	
	def dispatch compileStatement(Action action) { action.compile }
	
	def dispatch compileStatement(AssertEquals assert) { assert.compile }
	
	def dispatch compileStatement(AssertContains assert) { assert.compile }
	
	def dispatch compileStatement(AssignAction assign) { assign.compile }
	
	def dispatch compileStatement(FunctionCall fc) { fc.compile }
	
	def dispatch compileStatement(NavigationAction na) { na.compile }
	
}