package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlicrHome {

    private final WebDriver driver;
    private final By searchValur = By.xpath("//input[@type='submit']");

    public FlicrHome(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton(){
        driver.findElement(searchValur).click();
    }

}
