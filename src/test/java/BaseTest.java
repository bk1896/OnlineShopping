import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public WebDriver driver;
    public  Properties prop;

    @BeforeClass
    public void init() throws IOException {
        driver= new FirefoxDriver();
        prop=loadProperties();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    }

    @AfterClass
    public void rearDown(){
        driver.close();
    }

    public Properties loadProperties() throws IOException {
        FileInputStream file= new FileInputStream("E:/Bhagwan/Project/src/test/java/config.properties");
        Properties prop= new Properties();
        prop.load(file);
        return prop;

    }
}
