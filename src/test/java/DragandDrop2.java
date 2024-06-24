import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {


        public static void main(String[] args) throws InterruptedException {

            //Note: Following statement is required since Selenium 3.0,
            //optional till Selenium 2.0
            //Set system properties for geckodriver
            //specify the driver location
            //WebDriverManager.firefoxdriver().setup();
            //instantiate the driver
           // FirefoxOptions firefoxOptions = new FirefoxOptions();
            //firefoxOptions.addArguments("--remote-allow-origins=*");

           // FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
            //FirefoxDriver driver = new FirefoxDriver();
            EdgeDriver driver = new EdgeDriver();
            String URL = "https://seleniumbase.io/other/drag_and_drop";
            //String URL = "https://demoqa.com/droppable/";

            driver.get(URL);

            // It is always advisable to Maximize the window before performing DragNDrop action
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

            //Actions class method to drag and drop
            Actions actions = new Actions(driver);

            WebElement from = driver.findElement(By.id("div2"));

            WebElement to = driver.findElement(By.id("div1"));
            //Perform drag and drop
            actions.dragAndDrop(from, to).build().perform();

            //verify text changed in to 'Drop here' box
           // String textTo = to.getText();

           // if(textTo.equals("Dropped!")) {
          //      System.out.println("PASS: Source is dropped to target as expected");
         //   }else {
          //      System.out.println("FAIL: Source couldn't be dropped to target as expected");
         //   }
            driver.close();

        }

    }

