import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.util.Properties;

public class propertiesfiletest {

    public static void main(String[] args) throws IOException {

//        FileInputStream fis = new FileInputStream("C:\\Users\\ramkr\\IdeaProjects\\TestNGParameterization\\config.properties");
//        Properties prop = new Properties();

//        prop.load(fis);
//        //driver.get(prop.getProperty("URL"));

                // create file output stream object for the properties file
               FileOutputStream fis = new FileOutputStream("C:\\Users\\ramkr\\IdeaProjects\\TestNGParameterization\\config.properties");
                // create Properties class object to access properties file
                Properties prop = new Properties();
                // load the properties file
                // set the properties
                prop.setProperty("URL","https://www.google.com");
           //     prop.setProperty("Selenium", "https://chercher.tech");
             //   prop.setProperty("Google", "https://google.com");
               // prop.setProperty("Yahoo", "https://yahoo.com");
                // store the file into local system
                prop.store(fis, null);



        WebDriverManager.firefoxdriver().driverVersion("0.33.0").setup();
        FirefoxDriver driver = new FirefoxDriver(); //navigates to the Browser

                driver.get(prop.getProperty("URL"));


        prop.setProperty("URL","https://www.whatsapp.com");
        prop.store(fis, null);

    }
}

