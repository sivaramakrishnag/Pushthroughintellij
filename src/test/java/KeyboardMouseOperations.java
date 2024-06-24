import static org.testng.Assert.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyboardMouseOperations {


        public static void main(String[] args) {

            //specify the driver location
            //WebDriverManager.firefoxdriver().driverVersion("0.30.0").setup();


            //instantiate the driver
            //FirefoxDriver driver = new FirefoxDriver();

            EdgeDriver driver = new EdgeDriver();

            //specify the URL of the webpage
            driver.get("https://www.amazon.in/");

            //maximise the window
            driver.manage().window().maximize();

            //create an object for the Actions class and pass the driver argument
            Actions action = new Actions(driver);

            //specify the locator of the search box in which the product has to be typed
            WebElement elementToType = driver.findElement(By.id("twotabsearchtextbox"));

            //pass the value of the product
            action.sendKeys(elementToType, "iphone").build().perform();

            //specify the locator of the search button
            WebElement elementToClick = driver.findElement(By.id("nav-search-submit-button"));

            //perform a mouse click on the search button
            action.click(elementToClick).build().perform();

            String Title = driver.getTitle();
            System.out.println(Title);
            //verify the title of the website after searching the product
            assertEquals(driver.getTitle(), "Amazon.in : iphone");

            driver.quit();
        }

    }

