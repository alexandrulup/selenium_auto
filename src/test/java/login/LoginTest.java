package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.Header;
import pageobjects.Login;

public class LoginTest {
    WebDriver driver;

    @BeforeTest
    public void init(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alexandru.lupu\\Documents\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void loginValidUser() {
        Header header = new Header(driver);
        Login login = new Login(driver);
        String user = "johnsnow@workshop.com";
        String password = "iknoweverything";

        header.pressSignInBtn();
        login.signIn(user, password);
        WebElement loginCheck = driver.findElement(By.className("logout"));
        Assert.assertTrue(loginCheck.isDisplayed());
    }

    @Test (priority = 1)
    public void loginInvalidUser()  {
        Header header = new Header(driver);
        Login login = new Login(driver);
        String user = "gigi@gmail.com";
        String password = "parola";

        header.pressSignInBtn();
        login.signIn(user, password);
        WebElement errorMessage = driver.findElement(By.xpath( "//*[@id=\"center_column\"]/div[1]/ol/li"));
        Assert.assertEquals(errorMessage.getText(), "Authentication failed.");
    }

    @AfterClass
    public void shutDown(){
        driver.close();
    }
}
