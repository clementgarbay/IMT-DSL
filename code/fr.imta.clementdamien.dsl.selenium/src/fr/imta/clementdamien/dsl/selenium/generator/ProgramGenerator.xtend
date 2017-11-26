package fr.imta.clementdamien.dsl.selenium.generator

import fr.imta.clementdamien.dsl.selenium.mySelenium.*;
import java.util.List
import com.google.inject.Inject
import java.util.LinkedList

class ProgramGenerator {

	
    @Inject extension FunctionGenerator
	
	
	def dispatch compileProgram(Functions functions) {

        val compiledFunctions =
            functions.functions
                .map(function | function.compileAuxiliaryFunction.toString)

        val compiledMainFunction = functions.mainFunction.compileMainFunction.toString


        programFactory(compiledFunctions, compiledMainFunction)
    }

    def dispatch compileProgram(Statements statements) {
        programFactory(new LinkedList(), statements.buildMainFunctionFromStatements.toString)
    }


    def programFactory(List<String> functions, String mainFunction) '''
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

           «functions.join("\n\n")»
           
           «mainFunction»

       }
    '''


}