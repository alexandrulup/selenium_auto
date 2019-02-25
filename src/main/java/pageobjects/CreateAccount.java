package pageobjects;

import org.openqa.selenium.WebDriver;

public class CreateAccount {

    WebDriver driver;
    Login login = new Login(driver);
    Register register = new Register(driver);
    public CreateAccount(WebDriver driver){
        this.driver=driver;
    }

public static void fillInfo(){


}


}
