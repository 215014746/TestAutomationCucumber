package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//h2[@id = \"login-heading\"]") WebElement loginpagetitle_xpath;
    @FindBy(id = "login-email") WebElement email_id;
    @FindBy(id = "login-password") WebElement password_id;
    @FindBy(id = "login-submit") WebElement loginsubmit_id;
    @FindBy(xpath = "//button[@id='signup-toggle']") WebElement signuptoggle_xpath;
    @FindBy(id = "registration-heading") WebElement registrationHeading_id;
    @FindBy(xpath = "//h2[@id = \"login-heading\"]")  WebElement loginHeading_xpath;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginpageIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id = \"login-heading\"]")));
        loginpagetitle_xpath.isDisplayed();

    }
    public void enterEmail(String email){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-email")));
        email_id.clear();
        email_id.sendKeys(email);
    }
    public void enterPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));
        password_id.sendKeys(password);
    }
    public void loginButtonSubmit(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-submit")));
        loginsubmit_id.click();
    }

    public void verifyLoginPageIsDisplayed()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id = \"login-heading\"]")));
        loginHeading_xpath.isDisplayed();
    }

    public void clickSignupToggle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='signup-toggle']")));
        signuptoggle_xpath.click();
    }

    public void verifyRegistrationHeadingIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("registration-heading")));
        registrationHeading_id.isDisplayed();

    }

}
