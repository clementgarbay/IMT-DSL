package fr.imta.clementdamien.dsl.selenium.generator.statement


import fr.imta.clementdamien.dsl.selenium.generator.*;
import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import com.google.inject.Inject

class ActionStatementGenerator {
	
	@Inject extension VariableGenerator;
	@Inject extension SelectorGenerator;
	
	
	def compile(Action action) {
    		
		val stringParameter = action.stringParameter
		val selectorParameter = action.selectorParameter
		
		val parameter = 
			if(stringParameter !== null){
				'''"stringParameter"'''
			} else if (selectorParameter !== null) {
				selectorParameter.compile
			} else {
				''''''
			}
		
		'''
		«action.target.compileActionTarget»«action.target.handleIterable(action, parameter as String)»;
		'''
    		
    }
    
    def dispatch handleIterable(Selector selector, Action action, String parameter) {
    		val element = '''.«action.action»(«parameter»)'''
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
    

    
}