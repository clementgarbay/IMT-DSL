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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

// NOTE : generated from test1.sn

@RunWith(BlockJUnit4ClassRunner.class)
public class TestSelenium extends TestCase {

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

    
    @Test
    public void test() throws Exception {
    	
    	driver.get("http://www.imt-atlantique.fr/fr");
    	
    	By thea = By.xpath("//a[(normalize-space(.) = 'Toutes les actualités')]");
    	
    	Assertions.assertThatCode(() -> {
    		driver.findElement(By.xpath("//body")).findElement(thea);
    	}).doesNotThrowAnyException();
    }

}
