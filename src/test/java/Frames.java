import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class Frames {

        public static void main(String[] args) {

            WebDriverManager.firefoxdriver().driverVersion("0.33.0").setup();
            FirefoxDriver driver = new FirefoxDriver(); //navigates to the Browser
            driver.get("https://demo.guru99.com/test/guru99home/");
            // navigates to the page consisting an iframe

            driver.manage().window().maximize();
            WebElement iframeelement = driver.findElement(By.xpath(""));
            driver.switchTo().frame(iframeelement);//switching the frame by ID
            Set window = driver.getWindowHandles();
            driver.switchTo().window(String.valueOf(window));

            System.out.println("********We are switch to the iframe*******");
            driver.findElement(By.xpath("html/body/a/img")).click();
            //Clicks the iframe

            System.out.println("*********We are done***************");
        }
    }

