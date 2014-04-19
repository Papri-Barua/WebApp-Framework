package home;

import base.Base;
import org.junit.Test;

/**
 * Created by Prithul on 4/14/2014.
 */
public class LogIn extends Base {

    @Test
    public void test() {
        clickByXpath(".//*[@id='gh-ug']/a");
        typeByCss("input#userid","prithul28@gmail.com");
        typeByCss("input#pass","Prithul123");
        clickByCss("input#sgnBt");

        System.out.println("Successful login in eBay website....:)");
    }

}
