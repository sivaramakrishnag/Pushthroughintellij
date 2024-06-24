import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoProperties {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:\\Users\\ramkr\\IdeaProjects\\TestNGParameterization\\src\\test\\resources\\writedataintofile.properties");
        Properties prop = new Properties();
        prop.setProperty("URL","http://www.google.com");
        prop.store(fos,"saved");
    }
}
