package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Utils;

public class Register {

    WebDriver driver;
    Utils util = new Utils();
    By emailLocator = By.id("email_create");
    By submitCreate = By.id("SubmitCreate");

    public Register(WebDriver driver){
        this.driver = driver;
    }

    public void populateEmailAddress(String email){
        util.sleepUntilVisible(emailLocator, 10, driver);
        driver.findElement(emailLocator).sendKeys(email);
    }

    public void clickSubmit(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(submitCreate));
        element.click();
    }

    public void createAccount(String email){
        populateEmailAddress(email);
        clickSubmit();
    }
}
