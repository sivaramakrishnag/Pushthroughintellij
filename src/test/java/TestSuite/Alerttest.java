package TestSuite;

import Base.TestBase;
import Pages.Guru99DeleteCustomer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alerttest {



    @Test()
        public  void Alerttest() throws NoAlertPresentException,InterruptedException  {
           // WebDriverManager.firefoxdriver().driverVersion("0.33.0").setup();
            FirefoxDriver driver = new FirefoxDriver();

            Guru99DeleteCustomer guru99DeleteCustomer = new Guru99DeleteCustomer(driver);
            guru99DeleteCustomer.DeleteCustomer();


            // Alert Message handling

            //driver.get("https://demo.guru99.com/test/delete_customer.php");

            //customerid.sendKeys("53920");
            //submitbutton.submit();

            //driver.findElement(By.name("cusid")).sendKeys("53920");
            //driver.findElement(By.name("submit")).submit();

            // Switching to Alert
            //Alert alert = driver.switchTo().alert();

            // Capturing alert message.
            //String alertMessage= driver.switchTo().alert().getText();

            // Displaying alert message
            //System.out.println(alertMessage);
            //Thread.sleep(5000);

            // Accepting alert
            //alert.accept();
        }

    }


