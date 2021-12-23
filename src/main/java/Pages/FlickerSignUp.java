package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlickerSignUp {

    WebDriver driver;

    private By name = By.id("sign-up-first-name");
    private By lastName = By.id("sign-up-last-name");
    private By age = By.id("sign-up-age");
    private By email = By.id("sign-up-email");
    private By password = By.id("sign-up-password");
    private By signUpBtn = By.xpath("//button[contains(.,'Sign up')]");

    public FlickerSignUp(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String username){
        driver.findElement(name).sendKeys(username);
    }

    public void setLastName(String userlastname){
        driver.findElement(lastName).sendKeys(userlastname);
    }

    public void setAge(String userage){
        driver.findElement(age).sendKeys(userage);
    }

    public void setEmail(String useremail){
        driver.findElement(email).sendKeys(useremail);
    }

    public void setPassword(String userpassword){
        driver.findElement(password).sendKeys(userpassword);
    }
    public void clickOnSignUp(){
        driver.findElement(signUpBtn).click();
    }


}
