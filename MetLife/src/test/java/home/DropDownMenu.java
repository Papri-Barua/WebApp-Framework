package home;


import base.Base;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;





public class DropDownMenu extends Base{

    public void selectElementByOption(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    private WebElement getWebEelementByid(String string) {
        return null;
    }

    @Test
    public void selectElementByOptionMenu() throws InterruptedException{

        //for state
        WebElement element1 = driver.findElement(By.id("state1-mmquote"));
        Select select = new Select(element1);
        select.selectByVisibleText("New Jersey");

        //date of birth
        WebElement element2 = driver.findElement(By.id("month-mmquote"));
        Select select1 = new Select(element2);
        select1.selectByVisibleText("1");

        WebElement element3 = driver.findElement(By.id("day-mmquote"));
        Select select2 = new Select(element3);
        select2.selectByVisibleText("31");

        WebElement element4 = driver.findElement(By.id("year-mmquote"));
        Select select3 = new Select(element4);
        select3.selectByVisibleText("1986");

        //gender
        WebElement element5 = driver.findElement(By.id("gender-mmquote"));
        Select select4 = new Select(element5);
        select4.selectByVisibleText("Female");

        //coverage amt
        WebElement element6 = driver.findElement(By.id("coverage-mmquote"));
        Select select5 = new Select(element6);
        select5.selectByVisibleText("$50,000");
        Thread.sleep(3000);
        // submit
        driver.findElement(By.id("submitBtnImage")).click();


        // for customer service

	/*WebElement element1 = driver.findElement(By.id("Customer Service"));
	WebElement element2 = driver.findElement(By.id("custservice"));
	Select select = new Select(element2);
	select.selectByVisibleText("Pay a Bill");*/


    }














}