package nytimescommon;
/**
 * Created by Sayeda on 4/17/14.
 */
import base.Base;

import java.util.List;


public class TopNews extends Base {

    public void clickOnNews(String locator){
        List<String> news = getListOfString(locator);
        for(String st:news){
            System.out.println(st);
        }
    }
}
