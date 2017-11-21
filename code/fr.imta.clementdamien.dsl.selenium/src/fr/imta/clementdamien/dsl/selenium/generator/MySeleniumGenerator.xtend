/*
 * generated by Xtext 2.12.0
 */
package fr.imta.clementdamien.dsl.selenium.generator

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext


import com.google.inject.Inject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import fr.imta.clementdamien.dsl.selenium.mySelenium.*;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MySeleniumGenerator extends AbstractGenerator {
	
	 @Inject extension IQualifiedNameProvider;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(Program)) {
            fsa.generateFile(
                        "Test.java",
                        e.compile
                )
        }
	}
	
	
	def compile(Program program) '''
       import junit.framework.TestCase;
       import org.assertj.core.api.Assertions;
       import org.junit.*;
       import org.junit.runner.RunWith;
       import org.junit.runners.BlockJUnit4ClassRunner;
       import org.openqa.selenium.By;
       import org.openqa.selenium.NoSuchElementException;
       import org.openqa.selenium.WebDriver;
       import org.openqa.selenium.chrome.ChromeDriverService;
       import org.openqa.selenium.remote.DesiredCapabilities;
       import org.openqa.selenium.remote.RemoteWebDriver;
       
       import java.io.File;
       import java.io.IOException;
       
       @RunWith(BlockJUnit4ClassRunner.class)
       public class Test extends TestCase {
       
           private static ChromeDriverService service;
           private WebDriver driver;
           private static final String CHROMEDRIVER_PATH = "/usr/local/Cellar/chromedriver/2.33/bin/chromedriver";
           private static final String IMT_BASE_URL = "http://imt-atlantique.fr/fr";
       

           @AfterClass
           public static void createAndStopService() {
               service.stop();
           }
       
           @After
           public void quitDriver() {
               driver.quit();
           }
           
           «FOR function:program.functions.functions»
               «function.compile»
           «ENDFOR»
       
       }
    '''
    
    
    def compile(Function function) '''
    @Test
    private void «function.name.name»() {
    		«FOR statement:function.statements»
    			«statement.compileStatement»
       	«ENDFOR»
    }
    
    '''
    
    
    def dispatch compileStatement(OneParameterAction oneParameterAction) '''
    «oneParameterAction.selector.compile».«oneParameterAction.action»();
    
    '''
    
    def dispatch compileStatement(TwoParametersAction twoParametersAction) '''
    // todo TwoParametersAction
    
    '''
    
    
    def dispatch compileStatement(FunctionCall functionCall) '''
    «functionCall.ref»(
    		«FOR param:functionCall.params.variables»
    		param
            «IF functionCall.params.variables.indexOf(param) !== functionCall.params.variables.length() - 1»
            ,
			«ENDIF»            
        «ENDFOR»
    )
    '''
    
    def dispatch compileStatement(AssertContains assertContains) {
    		val element = {
    			if (assertContains.element !== null) 
    				'''.findElement(«assertContains.element.compileAssertableElement»)'''
			else ''''''
    		}
    	
	    '''
	    	Assertions.assertThatCode(() -> {
	        «assertContains.container.compileAssertableElement»«element»;
	    }).doesNotThrowAnyException();
	    '''
    }
    
    def dispatch compileStatement(AssertEquals assertEquals) '''
	assertEquals(«assertEquals.getAssertableElement().get(0)», «assertEquals.getAssertableElement().get(1)»);
    '''
    
    def dispatch compileStatement(NavigationAction navigationAction) '''
    // «navigationAction.action» «navigationAction.param»
    «IF navigationAction.action == "openBrowser"»
    		«IF navigationAction.param == "chrome"»
         service = new ChromeDriverService.Builder()
                            .usingDriverExecutable(new File(CHROMEDRIVER_PATH))
                            .usingAnyFreePort()
                            .build();
         service.start();
         driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
        «ENDIF»
    		«IF navigationAction.param == "firefox"»
         // todo openBrowser firefox
        «ENDIF»
    «ENDIF»
    «IF navigationAction.action == "go"»
    	driver.get("«navigationAction.param»");
 	«ENDIF»
 	
    '''
    
    
    def dispatch compileAssertableElement(Variable variable) '''«variable.compile»'''
    def dispatch compileAssertableElement(String string) '''«string»'''
    def dispatch compileAssertableElement(Projection projection) '''«projection.compile»'''
    def dispatch compileAssertableElement(FunctionCall fc) '''«fc.compile»'''
    
    def compile(Variable variable) '''«variable.name»'''
    
    def compile(Projection projection) '''«projection.selector.compile».getAttribute("«projection.projectionAction»")'''
    
    def compile(FunctionCall fc) '''«fc.ref»(«fc.params.variables.map[variable |
    		'''«variable.name»'''
    ].join(", ")»)'''
  
  
  	def compileSelectorAttributes(Selector selector){
  		if (selector.attrs !== null && selector.attrs.attrs != null){
  			return selector.attrs.attrs.map[attribute | 
				'''(@«attribute.name» = '«attribute.value»')'''
			].join(" AND ")
  		}
  		''''''
  	}
  
    def compile(Selector selector) '''
    // selector
    // TODO manage attribute.val
    driver.findElement(By.xpath("//«selector.element»[«selector.compileSelectorAttributes»]"));
    '''
    
}
