package Tests;

import Base.BaseSignUp;
import Pages.FlickerSignUp;
import org.testng.annotations.Test;

public class FlickerSignUpTest extends BaseSignUp {

    @Test
    public void signUpSuccess(){

        FlickerSignUp flickerSignUp = homePage.signUp();
        flickerSignUp.setName("Maraz");
        flickerSignUp.setLastName("Islam");
        flickerSignUp.setAge("20");
        flickerSignUp.setEmail("marazislm8@gmail.com");
        flickerSignUp.setPassword("TestCase0101");
        flickerSignUp.clickOnSignUp();

    }

}
