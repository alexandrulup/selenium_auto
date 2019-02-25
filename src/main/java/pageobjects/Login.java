package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    By emailLocator = By.id("email");
    By passwordLocator = By.id("passwd");
    By submitLocator = By.id("SubmitLogin");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void populateUser(String user){
        driver.findElement(emailLocator).sendKeys(user);
    }

    public void populatePassword(String password){
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickSubmit(){
        driver.findElement(submitLocator).click();
    }


    public void signIn(String user, String password) {
      populateUser(user);
      populatePassword(password);
      clickSubmit();
    }
}
