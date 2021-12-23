package Tests;

import Base.BaseHelp;
import Pages.FlickerHelp;
import org.testng.annotations.Test;

public class FlickerHelpTest extends BaseHelp {

    @Test
    public void help(){
        FlickerHelp flickerHelp = homePage.helpPage();
    }

}
