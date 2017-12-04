package fr.imta.clementdamien.dsl.selenium.generator

import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import com.google.inject.Inject

class SelectorGenerator {

	@Inject extension VariableGenerator;

    def compile(Selector selector) {
    		val function = if (selector.isAll()) 'findElements' else 'findElement'
    		
    		val parent = if(selector.parent !== null) selector.parent.compile else ''''''
    		
	    '''
	    driver.«function»(By.xpath("//«selector.element»[«selector.compileSelectorAttributes»]«parent»"))
	    '''
    }
    
    def compile(Parent parent)'''//«parent.element»[«parent.compileSelectorAttributes»]'''


    def compileSelectorAttributes(Parent parent){
        if (parent.attrs !== null && parent.attrs.attrs !== null){
            return parent.attrs.attrs.map[attribute | {
            		val value = {
            			if (attribute.value !== null)
            				attribute.value
            			else 
            				'''" + «attribute.variable.compile» + "'''
            		}
            		
                '''(@«attribute.name» = '«value»')'''
            }].join(" AND ")
        }
        ''''''
    }


    def compileSelectorAttributes(Selector selector){
        if (selector.attrs !== null && selector.attrs.attrs !== null){
            return selector.attrs.attrs.map[attribute | {
            		val value = {
            			if (attribute.value !== null)
            				attribute.value
            			else 
            				'''" + «attribute.variable.compile» + "'''
            		}
            		
                '''(@«attribute.name» = '«value»')'''
            }].join(" AND ")
        }
        ''''''
    }
    

}