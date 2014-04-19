package home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/19/2014.
 */
public class ErrorCondition extends Base {

    @Test
    public void RegisterNowNextStep() {

        driver.findElement(By.xpath(".//*[@id='registerLink']/a")).click();

        //switch to iframe
        WebElement iframe = driver.findElement(By.cssSelector(".dijitDialogPaneContent iframe:nth-child(1)"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.cssSelector("#firstName")).sendKeys("Fatima");
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Terin");
        // typing error:(@ sign missing in the email address.)
        driver.findElement(By.cssSelector("#email")).sendKeys("fatima.terin 2 gmail.com");
        driver.findElement(By.cssSelector("#retail")).click();
        driver.findElement(By.cssSelector("#dijit_form_Button_3_label")).click();

        driver.switchTo().defaultContent();

    }

}
