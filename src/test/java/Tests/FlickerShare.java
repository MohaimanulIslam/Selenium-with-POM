package Tests;

import Base.BaseTwo;
import Pages.FlicrShare;
import Pages.FlicrUploadPhoto;
import org.testng.annotations.Test;

public class FlickerShare extends BaseTwo {

    @Test
    public void uploadSuccess(){


        FlicrShare flicrShare = homePage.sharePhoto();
        flicrShare.setEmailId("marazislam8@gmail.com");
        flicrShare.clickEmail();
        flicrShare.setPassWord("TestCase0101");
        flicrShare.clickLogin();
        flicrShare.setChosePhoto("C:\\Users\\S.M.Mohaimanul Islam\\Pictures\\Saved Pictures/index.jpg");
        flicrShare.uploadBtn();
        flicrShare.upLOad();
        flicrShare.shareButton();

    }

}
