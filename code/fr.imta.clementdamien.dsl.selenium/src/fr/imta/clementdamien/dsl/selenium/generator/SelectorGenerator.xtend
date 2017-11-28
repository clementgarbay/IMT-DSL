package fr.imta.clementdamien.dsl.selenium.generator

import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import com.google.inject.Inject

class SelectorGenerator {

	@Inject extension VariableGenerator;

    def compile(Selector selector) {
    		val function = if (selector.isAll()) 'findElements' else 'findElement'
	    '''
	    driver.«function»(By.xpath("//«selector.element»[«selector.compileSelectorAttributes»]"))
	    '''
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