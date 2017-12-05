package fr.imta.clementdamien.dsl.selenium.generator

import com.google.inject.Inject
import fr.imta.clementdamien.dsl.selenium.mySelenium.Parent
import fr.imta.clementdamien.dsl.selenium.mySelenium.Selector

class SelectorGenerator {

	@Inject extension VariableGenerator;

    def compile(Selector selector) {
    		val parent = if (selector.parent !== null) selector.parent.compile else ''''''
    		
	    '''By.xpath("//«selector.element»«selector.compileSelectorAttributes»«parent»")'''
    }
    
    def compile(Parent parent)'''//«parent.element»«parent.compileSelectorAttributes»'''

    def compileSelectorAttributes(Parent parent){
        if (parent.attrs !== null && parent.attrs.attrs !== null && !parent.attrs.attrs.isEmpty){
        		val restiction = 
        			parent.attrs.attrs.map[attribute | {
	            		val value = {
	            			if (attribute.value !== null)
	            				attribute.value
	            			else 
	            				'''" + «attribute.variable.compile» + "'''
	            		}
	            		
	            		val attributeName = if(attribute.name == "text") '''.''' else '''@«attribute.name»'''
	            		
	                '''(«attributeName» = '«value»')'''
	            }].join(" AND ")
        	
            return '''[«restiction»]'''
        }
        ''''''
    }

    def compileSelectorAttributes(Selector selector){
        if (selector.attrs !== null && selector.attrs.attrs !== null && !selector.attrs.attrs.isEmpty){
        		val restiction = 
        			selector.attrs.attrs.map[attribute | {
	            		val value = {
	            			if (attribute.value !== null)
	            				attribute.value
	            			else 
	            				'''" + «attribute.variable.compile» + "'''
	            		}
	            		
	                val attributeName = if(attribute.name == "text") '''.''' else '''@«attribute.name»'''
	            		
	                '''(«attributeName» = '«value»')'''
	            }].join(" AND ")
        	
            return '''[«restiction»]'''
        }
        ''''''
    } 

}
