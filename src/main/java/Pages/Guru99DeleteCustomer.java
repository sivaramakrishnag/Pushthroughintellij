package Pages;

import Base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99DeleteCustomer  {

    @FindBy(name = "cusid")
    private WebElement customerid;

    @FindBy(name = "submit")
    private WebElement submitbutton;

    protected WebDriver driver;
    public Guru99DeleteCustomer(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }

public void DeleteCustomer(){

    customerid.sendKeys();
    submitbutton.click();
    Alert alert = driver.switchTo().alert();
    alert.accept();

}




}
