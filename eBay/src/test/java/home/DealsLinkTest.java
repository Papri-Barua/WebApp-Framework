package home;

import eBayCommon.Page;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Prithul on 4/19/2014.
 */
public class DealsLinkTest extends Page {

    @Test
    public void test1() throws InterruptedException {

        String DealsofDayTitle = "Deals of the Day collection on eBay!";
        goToDealoftheDay();
        Assert.assertEquals(driver.getTitle(),DealsofDayTitle );
        System.out.println(driver.getTitle());
        sleep(2);
    }
    @Test
    public void test2() throws InterruptedException {

        goToTopSellers();
        sleep(2);
    }
}
