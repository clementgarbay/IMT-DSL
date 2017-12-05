package fr.imta.clementdamien.dsl.selenium.generator.statement

import com.google.inject.Inject
import fr.imta.clementdamien.dsl.selenium.generator.SelectorGenerator
import fr.imta.clementdamien.dsl.selenium.generator.VariableGenerator
import fr.imta.clementdamien.dsl.selenium.mySelenium.Action
import fr.imta.clementdamien.dsl.selenium.mySelenium.ActionParameterString
import fr.imta.clementdamien.dsl.selenium.mySelenium.FunctionCall
import fr.imta.clementdamien.dsl.selenium.mySelenium.Selector
import fr.imta.clementdamien.dsl.selenium.mySelenium.VariableRef
import java.util.Random

class ActionStatementGenerator {
	
	@Inject extension VariableGenerator;
	@Inject extension SelectorGenerator;
	@Inject extension FunctionCallStatementGenerator;
	
	def compile(Action action) {
		val parameter = if (action.param !== null) action.param.compileActionParameter else ''''''
		delegateCompile(action, action.target, parameter.toString)
    }
    
    def dispatch delegateCompile(Action action, Selector selector, String parameter) {
    		
    		if (action.action == "click" || action.action == "choose") {
    			if (selector.isAll()) {
    				return 
				'''
				driver.findElements(«action.target.compileActionTarget»).forEach(element -> {
					Actions actions = new Actions(driver);
					actions.moveToElement(element).click().perform();
				});
				'''
    			} else {
    				val random = new Random().nextInt(5000000)
    				val actionName = '''action«random»'''
    				return 
				'''
				Actions «actionName» = new Actions(driver);
				«actionName».moveToElement(driver.findElement(«action.target.compileActionTarget»)).click().perform();
				'''
    			}
    		}
    		
    		val function = if (selector.isAll()) 'findElements' else 'findElement'
        
    		'''driver.«function»(«action.target.compileActionTarget»)«action.target.handleIterable(action, parameter.toString)»;'''
    }
    
    def dispatch delegateCompile(Action action, VariableRef varRef, String parameter) {
    		if (action.action == "click" || action.action == "choose") {
    			val actionName = '''action«varRef.getRef().getName()»'''
    			return 
				'''
				Actions «actionName» = new Actions(driver);
				«actionName».moveToElement(driver.findElement(«action.target.compileActionTarget»)).click().perform();
				'''
    		}
    		
    		'''driver.findElement(«action.target.compileActionTarget»)«action.target.handleIterable(action, parameter.toString)»;'''
    }
    
    def dispatch handleIterable(Selector selector, Action action, String parameter) {
    		if (action.action == "count") return '''.size()'''
    		
    		val actionName = 
    			if (action.action == "choose") // TODO: refactor because code not reached
    				"click" 
    			else if (action.action == "fill")
    				"sendKeys"
    			else action.action
    		val element = '''.«actionName»(«parameter»)'''
    		
    		if (selector.isAll())
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
    
	def dispatch compileActionParameter(Selector selector) { selector.compile }
	def dispatch compileActionParameter(VariableRef vr) { vr.compile }
	def dispatch compileActionParameter(ActionParameterString aps) { aps.compile }
    
    def compile(ActionParameterString aps) { '''"«aps.value»"''' }
}
