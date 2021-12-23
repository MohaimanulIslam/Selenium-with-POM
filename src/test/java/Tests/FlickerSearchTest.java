package Tests;

import Base.Base;
import Pages.FlickerSearch;
import org.testng.annotations.Test;

public class FlickerSearchTest extends Base {

    @Test
    public void search(){

        FlickerSearch flickerSearch = homePage.flickerSearch();
        flickerSearch.setEmailId("marazislam8@gmail.com");
        flickerSearch.clickEmail();
        flickerSearch.setPassWord("TestCase0101");
        flickerSearch.clickLogin();
        flickerSearch.setSearchbar("biology");
        flickerSearch.clickSearchBtn();

    }

}
