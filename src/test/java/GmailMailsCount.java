import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GmailMailsCount {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.gmail.com");
        driver.findElement(By.id("")).sendKeys("");
        driver.findElement(By.id("")).sendKeys("");
        driver.findElement(By.id("")).click();
        if (!(driver.findElement(By.id("")).isEnabled())) {

        driver.findElement(By.id("")).click();

        }
        WebElement ele = driver.findElement(By.xpath(""));
        ele.getSize();
        //capture the nth web element
        //WebElement email = emails.get(N - 1);
        //email.findElement(By.id()).getAttribute("name")
        //getText
    }
}
