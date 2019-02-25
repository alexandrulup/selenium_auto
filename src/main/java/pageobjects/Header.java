package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Utils;

public class Header {
    WebDriver driver;
    Utils util = new Utils();
    By signInLocator = By.className("login");

    public Header(WebDriver driver){
        this.driver = driver;
    }

    public void pressSignInBtn(){
        util.sleepUntilVisible(signInLocator, 10, driver);
        driver.findElement(signInLocator).click();
    }
}
