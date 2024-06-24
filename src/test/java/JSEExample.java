import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JSEExample {

public static void main(String[] args) {
    WebDriver driver;
    //chrome 124 version driver issue as the driver is not released yet. changed to edgedriver for now
    //driver = new ChromeDriver()
    driver = new EdgeDriver();
    driver.get("https://toolsqa.com");
    driver.manage().window().maximize();
    WebElement element = driver.findElement(By.xpath("//a[text()='+ Subscribe']"));
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    jse.executeScript("document.getElementById('subscriber-email').scrollIntoView(true);");
    jse.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 10000);");
    jse.executeScript("arguments[0].scrollIntoView(true);",element);
    jse.executeScript("arguments[0].click();",element);



}


}

