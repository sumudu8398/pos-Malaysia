package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestObject {

    protected WebDriver driver;

    @BeforeSuite
    public void setupAll(){
        // Set the path to the ChromeDriver executable
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeTest
    public void setup(){
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterTest
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }
}
