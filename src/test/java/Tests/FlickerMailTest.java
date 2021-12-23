package Tests;

import Base.BaseMail;
import Pages.FlickerMail;
import org.testng.annotations.Test;

public class FlickerMailTest extends BaseMail {

    @Test
    public void viewMailPage(){
        FlickerMail flickerMail = homePage.mailPage();
        flickerMail.setEmailId("marazislam8@gmail.com");
        flickerMail.clickEmail();
        flickerMail.setPassWord("TestCase0101");
        flickerMail.clickLogin();
        flickerMail.clickOnManu();
        flickerMail.clickOnMail();
    }

}
