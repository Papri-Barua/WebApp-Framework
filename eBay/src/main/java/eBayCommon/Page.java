package eBayCommon;

import base.Base;

/**
 * Created by Prithul on 4/19/2014.
 */
public class Page extends Base {

    public final static String Baby1stWishList = ".//*[@id='content']/div[1]/div[2]/div[1]/div[1]/h2/a";
    public final static String $5Deals = ".//*[@id='content']/div[1]/div[2]/div[13]/div[1]/h2/a";
    public final static String SurfUp = ".//*[@id='content']/div[1]/div[2]/div[3]/div[1]/h2/a";
    public final static String TopSellers = ".//*[@id='content']/div[1]/div[2]/div[12]/div[1]/h2/a";
    public final static String DealoftheDay =".//*[@id='content']/div[1]/div[2]/div[9]/div[1]/h2/a";
    public final static String AppleSale = ".//*[@id='content']/div[1]/div[2]/div[11]/div[1]/h2/a";



    public  void goToBaby1stWish(){
        clickByXpath(Baby1stWishList);
    }
    public void goTo$5deals(){
        clickByXpath($5Deals);
    }

    public  void goToSurfUp(){
        clickByXpath(SurfUp);
    }
    public  void goToTopSellers(){
        clickByXpath(TopSellers);
    }
    public void goToDealoftheDay(){
        clickByXpath(DealoftheDay);
    }
    public void goToAppleSale(){
        clickByXpath(AppleSale);
    }
}
