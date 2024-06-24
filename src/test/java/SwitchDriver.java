import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchDriver {

    public static void main(String[] args) {

        //child method cannot be implemented inside the method. It should be outside. Now call that here as shown below.
        initialize("chrome");

    }

    public static WebDriver initialize(String browser)
    {
        switch(browser) {
            case "chrome":
                return new ChromeDriver();


            default:
                return null;
        }
    }
}













