package Tests;

import Base.Base;
import Pages.FlicrLogin;
import org.testng.annotations.Test;

public class FlicerLoginTest extends Base {

    @Test
    public void logInSuccess(){

        FlicrLogin flicrLogin = homePage.clickOnlogin();
        flicrLogin.setEmailId("marazislam8@gmail.com");
        flicrLogin.clickEmail();
        flicrLogin.setPassWord("TestCase0101");
        flicrLogin.clickLogin();

    }

}
