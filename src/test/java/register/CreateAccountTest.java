package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.Header;
import pageobjects.PersonalInformationObject;
import pageobjects.Register;
import testdata.User;

public class CreateAccountTest {

User user;
WebDriver driver;
Register register;
Header header;
By registerButton = By.id("submitAccount");

@BeforeClass
public void init(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\alexandru.lupu\\Documents\\chromedriver.exe");

    this.driver = new ChromeDriver();
    register = new Register(driver);
    header = new Header(driver);
    user = new User();
    driver.get("http://automationpractice.com/index.php");
    header.pressSignInBtn();
    register.createAccount("gigi@gmail.com");

    user.setGender("Mr.");
    user.setFirstname("Gigi");
    user.setLastname("D'Agostino");
    user.setEmail("gigi@gmail.com");
    user.setPassword("parola");
    user.setDayOfBirth("2");
    user.setMonthOfBirth("January");
    user.setYearOfBirth("2000");
    user.setAddress("28 Street");
    user.setCity("New York");
    user.setState("Alabama");
    user.setZipCode("23789");
    user.setPhone("2255889966");
    user.setAliasAddress("10 Street");
    user.setCountry("United States");

}

@Test
    public void createAccount(){
        PersonalInformationObject pi = new PersonalInformationObject(driver);
        pi.fillPersonalInformation(user);
        driver.findElement(registerButton).click();
    }
}
