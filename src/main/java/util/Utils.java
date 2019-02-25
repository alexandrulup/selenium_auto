package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utils {

    public static void sleepMe(int time, WebDriver driver){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void sleepUntilVisible(By locator, int defaultTimeout, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, defaultTimeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
