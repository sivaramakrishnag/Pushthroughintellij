import java.util.concurrent.TimeUnit;

import Utilities.DatabaseConnection;
import Utilities.ReadExcelFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop  {

    public static void main(String[] args) throws InterruptedException {

        //specify the driver location
        WebDriverManager.firefoxdriver().driverVersion("0.30.0").setup();
        //instantiate the driver
        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        Actions action = new Actions(driver);

        //WebElement source = driver.findElement(By.xpath("//div[@id='div1' and @xpath=1]"));
        WebElement source = driver.findElement(By.xpath("//img[@id='div1'][@alt='W3Schools']"));
        Thread.sleep(2000);
        //WebElement destination = driver.findElement(By.xpath("//div[@id='div2' and @xpath=1]"));
        //WebElement destination = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[4]"));
        WebElement destination = driver.findElement(By.xpath("//div[1]/div[4][@id='div2']"));

        Thread.sleep(2000);

        action.clickAndHold(source).moveToElement(destination).release().build().perform();

        driver.quit();
    }

}