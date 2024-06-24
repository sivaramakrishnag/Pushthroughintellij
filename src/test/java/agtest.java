import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;

public class agtest {

  //  1. Go to website http://website.multiformis.com/
   //         2. From main menu click on "Sort and Tables"
  //          3. Check if total table row count is more than 25 records
//4. Enter the search query "John" to the search field
//5. Sort the data by Age descending
//6. Print the aria-label attribute of the age cell.
 //   Check if the 1st person in the table is older than 65

    public static void main(String[] args){

        EdgeOptions options = new EdgeOptions();
        //options.setCapability("profile.default_content_setting_values.notifications", 2); // Disable notifications
       // options.setCapability("profile.default_content_settings.popups", 0); // Block pop-ups
        //
        options.addArguments("--disable-notifications"); // Disable notifications
        options.addArguments("--disable-popup-blocking"); // Disable popup blocking
        WebDriver driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://website.multiformis.com/");
        //driver.manage().window().maximize();

       // Alert alert = driver.switchTo().alert();
       // alert.accept();


        //close the popup
        driver.findElement(By.xpath("//*[@id=\"popmake-57\"]/button")).click();

        driver.findElement(By.linkText("Sort and Tables")).click();

       // WebElement table = driver.findElement(By.xpath("//*[@id=\"tablepress-2\"]/tbody"));
       // WebElement rows = table.findElement(By.xpath("//*[@id=\"tablepress-2\"]/tbody/tr"));
        String totalrowsstring = driver.findElement(By.xpath("//*[@id=\"tablepress-2_info\"]")).getText();
        //substring to be used to get the total count of rows
        String count = totalrowsstring.substring(19,21);
        System.out.println(count);
        driver.findElement(By.xpath("//*[@id=\"tablepress-2_filter\"]/label/input")).sendKeys("John");

        Actions act = new Actions(driver);

        WebElement agesort = driver.findElement(By.xpath("//*[@id=\"tablepress-2\"]/thead/tr/th[8]"));

       // act.doubleClick(agesort).build().perform();
        agesort.click();
        agesort.click();

        System.out.println(agesort.getAttribute("aria-label"));
        String s = driver.findElement(By.xpath("//*[@id=\"tablepress-2\"]/tbody/tr[1]/td[8]")).getText();

        //convert the string obtained from the web element into a numerical value using Integer.ParseInt
        //Now you can use it in assertion
        int x = Integer.parseInt(s);
        Assert.assertTrue(x >43);
        driver.quit();

    }


}
