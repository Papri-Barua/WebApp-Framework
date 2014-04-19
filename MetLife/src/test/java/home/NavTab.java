package home;

import base.Base;
import java.util.List;


/**
 * Created by Fatima on 4/19/2014.
 */
public class NavTab extends Base {

    public void clickOnTabs(String locator){

        List<String> tab = getListOfString(locator);

        for(String st:tab){

            System.out.println(st);

        }

    }
}
