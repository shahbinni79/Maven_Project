package New_topic_Maven;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by welcome on 19/11/2016.
 */
public class BaseTest extends BasePage {
    @BeforeMethod
    public void openBrowser(){
        driver = new FirefoxDriver();
        driver.get("http://opensource.demo.orangehrmlive.com/");
//        driver.get("http://www.greenlightpharmacy.com/");
//        driver.get ("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();

    }

    }