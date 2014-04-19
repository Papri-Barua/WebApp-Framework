package nytimescommon;
import base.Base;

import java.util.List;


/**
 * Created by Sayeda on 4/17/14.
 */
public class NyTimesPage {
    /**
     * Created with IntelliJ IDEA.
     * User: rrt
     * Date: 4/6/14
     * Time: 10:35 AM
     * To change this template use File | Settings | File Templates.
     */
    public class Page extends Base {
        public final static String us = "#nav-U.S";
        public final static String world = "#nav-world";
        public final static String newyork = "#nav-newyork";
        public final static String business = "#nav-business";
        public final static String opinion = "#nav-opinion";
        public final static String sports = "#nav-sports";
        public final static String science= "#nav-science";
        public final static String arts = "#nav-arts";
        public final static String fashonandstyle = "#nav-fashonandstyle";
        public final static String video = "#nav-money";


        public void goToUS(){
            clickByCss(us);
        }
        public void goToWORLD(){
            clickByCss(world);
        }
        public void goToNewYork(){
            clickByCss(newyork);
        }
        public void goToBUSINESS(){
            clickByCss(business);
        }
        public void goToOPINION(){
            clickByCss(opinion);
        }
        public void goToSPORTS(){
            clickByCss(sports);
        }
        public void goToSCIENCE(){
            clickByCss(science);
        }
        public void goToARTS(){
            clickByCss(arts);
        }
        public void goToVIDEO(){
            clickByCss(video);
        }
        public void clickOnNews(String locator){
            List<String> news = getListOfString(locator);
            for(String st:news){
                System.out.println(st);
            }
        }
    }

}
