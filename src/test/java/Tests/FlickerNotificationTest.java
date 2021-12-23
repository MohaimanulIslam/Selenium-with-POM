package Tests;

import Base.Base;
import Pages.FlickerNotification;
import Pages.FlickerSearch;
import org.testng.annotations.Test;

public class FlickerNotificationTest extends Base {

    @Test
    public void notificationClick(){

        FlickerNotification flickerNotification = homePage.flickerNotification();
        flickerNotification.setEmailId("marazislam8@gmail.com");
        flickerNotification.clickEmail();
        flickerNotification.setPassWord("TestCase0101");
        flickerNotification.clickLogin();
        flickerNotification.clickNotification();

    }

}
