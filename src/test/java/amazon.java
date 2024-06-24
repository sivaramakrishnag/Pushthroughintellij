import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class amazon {

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");

        //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shirts");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//div/span[1]/div[1]/div[5]")).click();
        String currentwindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for(String handle:handles){
           if(!(handle.equals(currentwindow)))
           {
               driver.switchTo().window(currentwindow);
           }

        }
        String title = driver.getTitle();
        System.out.println(title);



    }
}
