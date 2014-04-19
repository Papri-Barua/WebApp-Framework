package home;

import base.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Prithul on 4/19/2014.
 */
public class RegisterNow extends Base {

    //@Test
    public void RegisterNow1() {

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());

        driver.findElement(By.xpath(".//*[@id='registerLink']/a")).click();

    }

    @Test
    public void RegisterNowNextStep() {

        driver.findElement(By.xpath(".//*[@id='registerLink']/a")).click();

        //switch to iframe
        WebElement iframe = driver.findElement(By.cssSelector(".dijitDialogPaneContent iframe:nth-child(1)"));
        driver.switchTo().frame(iframe);

        //firstname
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Fatima");

        //lastname
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Terin");

        //email
        driver.findElement(By.cssSelector("#email")).sendKeys("fatima.terin@gmail.com");
        //driver.findElement(By.cssSelector("#email")).sendKeys("fatima.terin gmail.com");

        //What type of MetLife account or policy do you have?
        driver.findElement(By.cssSelector("#retail")).click();

        // NextStep
        driver.findElement(By.cssSelector("#dijit_form_Button_3_label")).click();
        driver.switchTo().defaultContent();

    }

}
