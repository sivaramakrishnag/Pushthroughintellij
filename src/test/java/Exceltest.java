
import Utilities.ReadExcelFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Exceltest {

    //FirefoxDriver driver;
    WebDriver driver;
    WebDriver driver1;
    @Test(dataProvider="testdata")
    public void demoClass(String username, String password) throws InterruptedException {
        //WebDriverManager.firefoxdriver().driverVersion("0.30.0").setup();
        //WebDriverManager.firefoxdriver().setup();
        //FirefoxDriver driver = new FirefoxDriver();
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.findElement(By.name("user[login]")).sendKeys(username);
        driver.findElement(By.name("user[password]")).sendKeys(password);
        driver.findElement(By.id("accept-cookie-notification-cross-icon")).click();
        //driver.findElement(By.id("tnc_checkbox")).click();
        driver.findElement(By.name("commit")).click();
        Thread.sleep(5000);
        driver.getTitle();
        Assert.assertTrue(driver.getTitle().matches("BrowserStack Login | Sign Into The Best Mobile & Browser Testing Tool"), "Invalid credentials");
        System.out.println("Login successful");
    }

    @AfterMethod
    void ProgramTermination() {
        driver.quit();
    }

    @DataProvider(name="testdata")
    public Object[][] testDataExample(){


        ReadExcelFile config = new ReadExcelFile("C:\\Users\\ramkr\\IdeaProjects\\TestNGParameterization\\src\\test\\resources\\testexceldata.xlsx");
        int rows = config.getRowCount(0);
        Object[][] signin_credentials = new Object[rows][2];

        for(int i=0;i<rows;i++)
        {
            signin_credentials[i][0] = config.getData(0, i, 0);
            signin_credentials[i][1] = config.getData(0, i, 1);
        }
        return signin_credentials;
    }
}


