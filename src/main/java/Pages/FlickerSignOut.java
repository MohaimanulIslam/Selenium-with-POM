package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FlickerSignOut {

    WebDriver driver;

    private By emailId = By.id("login-email");
    private By clickEmail = By.xpath("//*[@id=\"login-form\"]/button");
    private By passWord = By.xpath("//*[@id=\"login-password\"]");
    private By logInBtn = By.xpath("//button[contains(.,'Sign in')]");
    private By clickMenu = By.xpath("//li[@data-context='account']");
    private By signoutBtn = By.xpath("//a[@data-track='Account-sign_out']");

    public FlickerSignOut(WebDriver driver) {
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

    public void clickSignOut(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(signoutBtn).click();
    }

}
