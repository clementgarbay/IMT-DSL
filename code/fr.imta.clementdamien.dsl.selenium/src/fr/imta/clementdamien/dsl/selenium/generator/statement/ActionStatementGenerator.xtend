package fr.imta.clementdamien.dsl.selenium.generator.statement


import fr.imta.clementdamien.dsl.selenium.generator.*;
import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import com.google.inject.Inject

class ActionStatementGenerator {
	
	@Inject extension VariableGenerator;
	@Inject extension SelectorGenerator;
	@Inject extension FunctionCallStatementGenerator;
	
	
	def compile(Action action) {
    		
		val parameter = if(action.param !== null) action.param.compileActionParameter else ''''''
		
		'''
		«action.target.compileActionTarget»«action.target.handleIterable(action, parameter.toString)»;
		'''
    		
    }
    
    def dispatch handleIterable(Selector selector, Action action, String parameter) {
    		
    		if(action.action == "count") return '''.size()'''
    		
    		val actionName = if(action.action == "choose") "click" else action.action
    	
    		val element = '''.«actionName»(«parameter»)'''
    		if(selector.isAll)
    			'''.forEach(element -> element«element»)''' 
		else
			element
			
    }
    
    def dispatch handleIterable(VariableRef varRef, Action action, String parameter) {
    		'''.«action.action»(«parameter»)'''
    }
    
    def dispatch compileActionTarget(Selector selector) { selector.compile }
    def dispatch compileActionTarget(VariableRef varRef) { varRef.compile }
    def dispatch compileActionTarget(FunctionCall fc) { fc.compile }
    

	def dispatch compileActionParameter(Selector selector){ selector.compile }
	def dispatch compileActionParameter(ActionParameterString aps){ aps.compile }
    
    def compile(ActionParameterString aps){ '''"«aps.value»"''' }
    
}