package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private By search = By.id("search-field");
    private final By loginicon = By.className("gn-title");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public FlicrHome clickOnSearch(){
        driver.findElement(search).sendKeys("https://www.flickr.com/");
        return new FlicrHome(driver);
    }

    public FlicrLogin clickOnlogin(){
        driver.findElement(loginicon).click();
        return new FlicrLogin(driver);
    }

    public FlicrUploadPhoto uploadPhoto(){
        return new FlicrUploadPhoto(driver);
    }

    public FlicrShare sharePhoto(){
        return new FlicrShare(driver);
    }

    public FlickerMail mailPage(){
        return new FlickerMail(driver);
    }

    public FlickerSettings settingPage(){
        return new FlickerSettings(driver);
    }

    public FlickerHelp helpPage(){
        return new FlickerHelp(driver);
    }

    public FlickerSignOut signOut(){
        return new FlickerSignOut(driver);
    }

    public FlickerSearch flickerSearch(){
        driver.findElement(loginicon).click();
        return new FlickerSearch(driver);
    }

    public FlickerNotification flickerNotification(){
        driver.findElement(loginicon).click();
        return new FlickerNotification(driver);
    }

    public PhotoShare photoShare(){
        return new PhotoShare(driver);
    }

    public PhotoSearch photoSearch(){
        return new PhotoSearch(driver);
    }

    public FlickerSignUp signUp(){
        return new FlickerSignUp(driver);
    }

}
