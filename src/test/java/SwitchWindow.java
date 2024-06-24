import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class SwitchWindow {


        public static void main(String[] args) throws InterruptedException
        {

            //System.setProperty("webdriver.chrome.driver", "D:chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/browser-windows");
            String parentWindowHandle = driver.getWindowHandle();
            System.out.println("Parent window's handle -> " + parentWindowHandle);
            Thread.sleep(5000);
            WebElement clickElement = driver.findElement(By.id("windowButton"));
            Actions actions = new Actions(driver);

            for(int i = 0; i < 3; i++)
            {
                actions.moveToElement(clickElement).build().perform();

                clickElement.click();
                Thread.sleep(3000);
            }

            Set<String> allWindowHandles = driver.getWindowHandles();
            String lastWindowHandle = "";
            for(String handle : allWindowHandles)
            {
                System.out.println("Switching to window - > " + handle);
                System.out.println("Navigating to google.com");
                driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
                driver.get("http://google.com");
                lastWindowHandle = handle;
            }

//Switch to the parent window
            driver.switchTo().window(parentWindowHandle);
//close the parent window
            driver.close();
//at this point there is no focused window, we have to explicitly switch back to some window.
            driver.switchTo().window(lastWindowHandle);
            driver.get("http://toolsqa.com");
        }
    }



