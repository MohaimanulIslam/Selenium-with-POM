package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FlickerSettings {

    WebDriver driver;

    private By emailId = By.id("login-email");
    private By clickEmail = By.xpath("//*[@id=\"login-form\"]/button");
    private By passWord = By.xpath("//*[@id=\"login-password\"]");
    private By logInBtn = By.xpath("//button[contains(.,'Sign in')]");
    private By clickMenu = By.xpath("//div[@class='avatar person tiny no-menu']");
    private By clickSetting = By.cssSelector("#yui_3_16_0_1_1639507911671_773");

    public FlickerSettings(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailId(String email){
        driver.findElement(emailId).sendKeys(email);
    }

    public void clickEmail(){
        driver.findElement(clickEmail).click();
    }

    public void setPassWord(String password){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(passWord).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(logInBtn).click();
    }

    public void clickOnManu(){
        driver.findElement(clickMenu).click();
    }

    public void clickOnSetting(){
        driver.findElement(clickSetting).click();
    }

}
