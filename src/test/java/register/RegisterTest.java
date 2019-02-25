package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.Header;
import pageobjects.Register;

import java.util.concurrent.TimeUnit;

public class RegisterTest {
    WebDriver driver;

    @BeforeTest
    public void init(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alexandru.lupu\\Documents\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void createAccount() {
        Header header = new Header(driver);
        header.pressSignInBtn();
        Register register = new Register(driver);
        String email ="gigi@gmail.com";
        register.createAccount(email);

        WebElement personalInfo = driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/h3"));
        Assert.assertEquals(personalInfo.getText(), "YOUR PERSONAL INFORMATION");
    }

    @AfterClass
    public void shutdown(){
        driver.close();
    }
}
