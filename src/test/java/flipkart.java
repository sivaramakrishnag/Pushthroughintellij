import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class flipkart {
    public static void main(String[] args) {
        // launch driver
        WebDriver driver = new ChromeDriver();
        //Navigate to website
        //enter laptop in search

        //click on filter low to high

        //capture entire list of prices into a list
        List<WebElement> priceList = driver.findElements(By.xpath(""));
        WebElement x=priceList.get(0);
        String y = x.getAttribute("Value");
        //sort it from low to high
        for (WebElement price : priceList) {
            String z =price.getAttribute("value");

         //   if () {
                y =z;
                System.out.println(y);
                WebElement productElement = price.findElement(By.xpath("./preceding-sibling::a"));
         //       productName = productElement.getText();
            }


        }
    }

//}