package Tests;

import Base.BaseTwo;
import Pages.FlicrUploadPhoto;
import Pages.PhotoSearch;
import org.testng.annotations.Test;

public class PhotoSearchTest extends BaseTwo {

    @Test
    public void searchSuccess(){

        PhotoSearch photoSearch = homePage.photoSearch();
        photoSearch.setEmailId("marazislam8@gmail.com");
        photoSearch.clickEmail();
        photoSearch.setPassWord("TestCase0101");
        photoSearch.clickLogin();
        photoSearch.setChosePhoto("C:\\Users\\S.M.Mohaimanul Islam\\Pictures\\Saved Pictures/index.jpg");
        photoSearch.uploadBtn();
        photoSearch.upLOad();
        photoSearch.searchPhoto();
        photoSearch.setSearchBar("Biology");
        photoSearch.searchButton();

    }

}
