package validation;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Prithul on 4/19/2014.
 */
public class MetlifeValidation extends Base {

    int counter = 0;

    public WebDriver driver = null;


    public void setUp() throws Exception {

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://www.metlife.com");
        driver.manage().window().maximize();


    }


}
