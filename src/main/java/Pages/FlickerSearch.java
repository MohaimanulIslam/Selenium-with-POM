package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FlickerSearch {

    WebDriver driver;

    private By emailId = By.id("login-email");
    private By clickEmail = By.xpath("//*[@id=\"login-form\"]/button");
    private By passWord = By.xpath("//*[@id=\"login-password\"]");
    private By logInBtn = By.xpath("//button[contains(.,'Sign in')]");
    private By searchBar = By.xpath("//input[@id='search-field']");
    private By searchBtn = By.xpath("//label[@aria-label='Search']");

    public FlickerSearch(WebDriver driver) {
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
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void setSearchbar(String searchbar){
        driver.findElement(searchBar).sendKeys(searchbar);
    }

    public void clickSearchBtn(){
        driver.findElement(searchBtn).click();
    }

}
