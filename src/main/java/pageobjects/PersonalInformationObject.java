package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testdata.User;

import java.security.Key;

public class PersonalInformationObject {

    WebDriver driver;

    public PersonalInformationObject(WebDriver driver){
        this.driver = driver;
    }

    By mrGenderLocator = By.id("id_gender1");
    By mrsGenderLocator = By.id("id_gender2");
    By customerFirstNameLocator = By.id("customer_firstname");
    By customerLastNameLocator = By.id("customer_lastname");
    By emailLocator = By.id("email");
    By passwordLocator = By.id("passwd");
    By daysLocator = By.id("days");
    By monthsLocator = By.id("months");
    By yearsLocator = By.id("years");
    By firstNameLocator = By.id("firstname");
    By lastNameLocator = By.id("lastname");
    By addressLocator = By.id("address1");
    By cityLocator = By.id("city");
    By stateLocator = By.id("id_state");
    By zipCodeLocator = By.id("postcode");
    By countryLocator = By.id("id_country");
    By phoneNumberLocator = By.id("phone_mobile");
    By aliasAddressLocator = By.id("alias");


    public void selectGender(String gender){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        if(gender.equalsIgnoreCase("Mr.")){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(mrGenderLocator));
        element.click();}
        else{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(mrsGenderLocator));
            element.click();
        }
    }


    public void populateCustomerFirstname(String firstname){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerFirstNameLocator));
        element.sendKeys(firstname);
    }

    public void populateCustomerLastname(String lastname){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(customerLastNameLocator));
        element.sendKeys(lastname);
    }

    public void populateEmail(String email){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator));
        element.clear();
        element.sendKeys(email);
    }

    public void populatePassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator));
        element.sendKeys(password);
        element.sendKeys(Keys.TAB);
    }

    public void selectDayOfBirth(String dayOfBirth){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Select element = new Select(driver.findElement(daysLocator));

        element.selectByValue(dayOfBirth);
    }

    public void selectMonthOfBirth(String monthOfBirth){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Select element = new Select(driver.findElement(monthsLocator));
        element.selectByValue("1");
    }

    public void selectYearOfBirth(String yearOfBirth){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Select element = new Select(driver.findElement(yearsLocator));
        element.selectByValue(yearOfBirth);
    }

    public void populateFirstname(String firstname){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameLocator));
        element.sendKeys(firstname);
    }

    public void populateLastname(String lastname){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameLocator));
        element.sendKeys(lastname);
    }

    public void populateAddress(String address){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(addressLocator));
        element.sendKeys(address);
    }

    public void populateCity(String city){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(cityLocator));
        element.sendKeys(city);
    }

    public void populateState(String state){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Select element = new Select(driver.findElement(stateLocator));
        element.selectByValue("2");
    }

    public void populateZipCode(String zipCode){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(zipCodeLocator));
        element.sendKeys(zipCode);
    }

    public void populateCountry(String country){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Select element = new Select(driver.findElement(countryLocator));
        element.selectByVisibleText(country);
    }

    public void populatePhone(String phone){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberLocator));
        element.sendKeys(phone);
    }

    public void populateAlis(String aliasAddress){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(aliasAddressLocator));
        element.sendKeys(aliasAddress);
    }


    public void fillPersonalInformation(User user){
        selectGender(user.getGender());
        populateCustomerFirstname(user.getFirstname());
        populateCustomerLastname(user.getLastname());
        populateEmail(user.getEmail());
        populatePassword(user.getPassword());
        selectDayOfBirth(user.getDayOfBirth());
        selectMonthOfBirth(user.getMonthOfBirth());
        selectYearOfBirth(user.getYearOfBirth());
        populateFirstname(user.getFirstname());
        populateLastname(user.getLastname());
        populateAddress(user.getAddress());
        populateCity(user.getCity());
        populateState(user.getState());
        populateZipCode(user.getZipCode());
        populateCountry(user.getCountry());
        populatePhone(user.getPhone());
        populateAlis(user.getAliasAddress());

    }

}
