package Tests;

import Base.BaseMail;
import Pages.FlickerSignOut;
import org.testng.annotations.Test;

public class FlickerSignOutTest extends BaseMail {

    @Test
    public void signout(){
        FlickerSignOut flickerSignOut = homePage.signOut();
        flickerSignOut.setEmailId("marazislam8@gmail.com");
        flickerSignOut.clickEmail();
        flickerSignOut.setPassWord("TestCase0101");
        flickerSignOut.clickLogin();
        flickerSignOut.clickOnManu();
        flickerSignOut.clickSignOut();
    }

}
