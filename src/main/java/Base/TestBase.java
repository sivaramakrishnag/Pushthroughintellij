package Base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;


public  class TestBase {
    public  WebDriver driver;
    public Logger log = Logger.getLogger(TestBase.class);

    public TestBase(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    //setup

    public void setUp(String browser) throws IOException {
        //Load properties file data prop.load(fis)
        browser = "chrome";
        PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
        Properties prop = new Properties();
        prop.load(fis);

        //WebDriverManager.firefoxdriver().driverVersion("0.33.0").setup();
        //FirefoxDriver driver = new FirefoxDriver();

        //browser selection
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
            log.info("chromedriver launched");
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
            log.info("firefoxdriver launched");
        }
    }

//    public TestBase() throws FileNotFoundException {
//    }
//
//
//    //common methods used
//    //click
//    public void click(String element)
//
//    {
//        //driver.findelement(element).click();
//        //print the element that is clicked
//        //log.info("Clicking on an Element : " + locatorKey);
//        //ExtentListeners.test.info("Clicking on an Element : " + locatorKey);
//
//    }

    //type
    //select
    //isElementPresent

    //teardown
//    public void tearDown(){
//        if (driver!= null)
//        driver.quit();
//        log.info("");
//    }

}
