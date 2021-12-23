package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PhotoSearch {

    WebDriver driver;

    private By emailId = By.id("login-email");
    private By clickEmail = By.xpath("//*[@id=\"login-form\"]/button");
    private By passWord = By.xpath("//*[@id=\"login-password\"]");
    private By logInBtn = By.xpath("//button[contains(.,'Sign in')]");
    private By chosePhoto = By.xpath("//input[@id=\"choose-photos-and-videos\"]");
    private By upBtn = By.id("action-publish");
    private By upload = By.id("confirm-publish");
    private By search = By.xpath("//div[@class='view fluid-magic-search-view requiredToShowOnServer closed']");
    private By searchBar = By.xpath("//input[@id='search-field']");
    private By searchBtn = By.xpath("//label[@aria-label='Search']");

    public PhotoSearch(WebDriver driver) {
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

    public void setChosePhoto(String chosephoto){
        driver.findElement(chosePhoto).sendKeys(chosephoto);
    }

    public void uploadBtn(){
        driver.findElement(upBtn).click();
    }

    public void upLOad(){
        driver.findElement(upload).click();
    }

    public void searchPhoto(){
        driver.findElement(search).click();
    }

    public void setSearchBar(String searchbar){
        driver.findElement(searchBar).sendKeys(searchbar);
    }

    public void searchButton(){
        driver.findElement(searchBtn).click();
    }

}
