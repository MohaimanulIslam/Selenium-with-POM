package Tests;

import Base.Base;
import Pages.FlicrHome;
import org.testng.annotations.Test;

public class FlicrHomeTese extends Base {


    @Test
    public void searchSucc(){
        FlicrHome flicrHome = homePage.clickOnSearch();
        flicrHome.clickButton();
    }
}
