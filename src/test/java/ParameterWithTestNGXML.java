//import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
//import org.testng.AssertJUnit;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterWithTestNGXML {

    String driverPath = "C:\\Users\\ramkr\\IdeaProjects\\TestNGParameterization\\geckodriver.exe";
    //WebDriver driver;
    @Test
    @Parameters({"author","searchKey"})
    public void testParameterWithXML(@Optional("Abc") String author,@Optional("text") String searchKey) throws InterruptedException{

        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\ramkr\\IdeaProjects\\TestNGParameterization\\geckodriver.exe");
        //System.setProperty("webdriver.firefox.marionette", "C:\\Users\\ramkr\\IdeaProjects\\TestNGParameterization\\geckodriver.exe");
        //WebDriverManager.firefoxdriver().setup();
        WebDriverManager.firefoxdriver().driverVersion("0.33.0").setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

        WebElement searchText = driver.findElement(By.name("q"));
        //Searching text in google text box
        searchText.sendKeys(searchKey);

        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
        System.out.println("Thread will sleep now");
        Thread.sleep(3000);
        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
        //verifying the value in google search box
        Assert.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));

    }
}


