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
       
           @BeforeClass
           public static void createAndStartService() throws IOException {
               service = new ChromeDriverService.Builder()
                       .usingDriverExecutable(new File(CHROMEDRIVER_PATH))
                       .usingAnyFreePort()
                       .build();
               service.start();
           }
       
           @AfterClass
           public static void createAndStopService() {
               service.stop();
           }
       
           @Before
           public void createDriver() {
               driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
           }
       
           @After
           public void quitDriver() {
               driver.quit();
           }
           
           «FOR function:program.functions.functions»
               «function.compile»
           «ENDFOR»
       
           @Test
           public void testIMTContains() {
               driver.get(IMT_BASE_URL);
       
               Assertions.assertThatCode(() -> {
                   driver.findElement(By.tagName("body")).findElement(By.className("actu_home_cell2_lnk"));
               }).doesNotThrowAnyException();
           }
       
           @Test
           public void testIMTNotContains() {
               driver.get(IMT_BASE_URL);
       
               Assertions.assertThatThrownBy(() -> {
                   driver.findElement(By.tagName("body")).findElement(By.className("actu_home_cell2_ln"));
               }).isInstanceOf(NoSuchElementException.class);
           }
       }
    '''
    
    
    def compile(Function function) '''
    private void «function.name.name»() {
    		«FOR statement:function.statements»
           «statement.compileStatement»
       «ENDFOR»
    }
    '''
    
    
    def dispatch compileStatement(OneParameterAction oneParameterAction) '''
    «oneParameterAction.selector».«oneParameterAction.action»();
    '''
    
    def dispatch compileStatement(TwoParametersAction twoParametersAction) '''
    «twoParametersAction.selector».«twoParametersAction.action»();
    '''
    
    
    def compile(Selector selector) '''
    driver.findElement(By.xpath("//«selector.element»[
    		«FOR attribute:selector.attrs.attrs»
    		(@«attribute.name» = "«attribute.value»") // TODO manage attribute.val
            «IF selector.attrs.attrs.indexOf(attribute) !== selector.attrs.attrs.length() - 1»
            AND
			«ENDIF»            
        «ENDFOR»
    "));;
    '''
    
}
