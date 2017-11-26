package fr.imta.clementdamien.dsl.selenium.generator


import fr.imta.clementdamien.dsl.selenium.mySelenium.*;

class VariableGenerator {
	
	
	def compile(Variable variable) { variable.name }
	
	def compile(VariableRef variableRef) { variableRef.ref.name }
	
	def compile(StringParameter stringParameter) '''"«stringParameter.value»"'''
	
	def dispatch compileVariableCall(VariableRef variableRef) {
		variableRef.compile
	}
	
	def dispatch compileVariableCall(StringParameter stringParameter) {
		stringParameter.compile
	}
	
}