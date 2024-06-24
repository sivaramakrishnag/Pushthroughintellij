import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.AppiumOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumSetup {

    private AppiumDriver driver;

    public void setUp(String platform) throws MalformedURLException {
        if (driver == null) {
           // AppiumOptions options = new AppiumOptions();

            if (platform.equalsIgnoreCase("Android")) {
                String appPath = "C:\\Users\\ramkr\\Downloads\\Arla_VS_DEV_V1_10012024.apk";

          //      options.setPlatformName("Android");
          //      options.setCapability("deviceName", "ce081718d43308080c");
          //      options.setCapability("app", appPath);
          //      options.setCapability("automationName", "UiAutomator2");
          //      options.setCapability("appPackage", "com.winit.arlafoodsfa");
          //      options.setCapability("appActivity", ".LoginActivity");
          //      options.setCapability("autoGrantPermissions", true);
          //      options.setCapability("newCommandTimeout", 3000);
          //      options.setCapability("chromedriverExecutable", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

          //      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
            } else if (platform.equalsIgnoreCase("iOS")) {
                String appPath = "path/to/your/ios/app.ipa"; // Replace with your iOS app path

          //      options.setPlatformName("iOS");
          //      options.setCapability("deviceName", "iPhone 12"); // Replace with your iOS device name
          //      options.setCapability("platformVersion", "14.4"); // Replace with your iOS platform version
          //      options.setCapability("app", appPath);
          //      options.setCapability("automationName", "XCUITest");
          //      options.setCapability("autoAcceptAlerts", true);
          //      options.setCapability("newCommandTimeout", 3000);

          //      driver = new IOSDriver(new URL("http://127.0.0.1:4723/"), options);
            } else {
                throw new IllegalArgumentException("Invalid platform specified");
            }

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static void main(String[] args) {
        AppiumSetup appiumSetup = new AppiumSetup();
        try {
            appiumSetup.setUp("Android"); // For Android setup
            // appiumSetup.setUp("iOS");  // For iOS setup
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // Now you can use appiumSetup.getDriver() to get the initialized driver
        WebDriver driver = appiumSetup.getDriver();
        // Add your test code here
    }
}
