import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class numberoflinks {
    public static void main(String[] args){

        WebDriver driver = new EdgeDriver();
        driver.get("");
        driver.findElement(By.linkText("")).getAttribute("href");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        int count = links.size();
        for(WebElement link:links)
        {
            System.out.println(link.getAttribute("href"));
            System.out.println(link.getText());

        }



    }
}
