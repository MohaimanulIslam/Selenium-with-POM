package Tests;

import Base.BaseSettings;
import Pages.FlickerSettings;
import org.testng.annotations.Test;

public class FlickerSettingsTest extends BaseSettings {

    @Test
    public void setting(){

        FlickerSettings flickerSettings = homePage.settingPage();
        flickerSettings.setEmailId("marazislam8@gmail.com");
        flickerSettings.clickEmail();
        flickerSettings.setPassWord("TestCase0101");
        flickerSettings.clickLogin();
        flickerSettings.clickOnManu();
        flickerSettings.clickOnSetting();

    }

}
