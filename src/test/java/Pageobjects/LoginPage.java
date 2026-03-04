package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//h2[@id = \"login-heading\"]") WebElement loginpagetitle_xpath;
    @FindBy(id = "login-email") WebElement email_id;
    @FindBy(id = "login-password") WebElement password_id;
    @FindBy(id = "login-submit") WebElement loginsubmit_id;
    @FindBy(id = "signup-toggle")WebElement signuptoggle_id;
    @FindBy(id = "registration-heading") WebElement registrationHeading_id;
    @FindBy(xpath = "//h2[@id = \"login-heading\"]")  WebElement loginHeading_id;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginpageIsDisplayed()throws InterruptedException{
        Thread.sleep(2000);
        loginpagetitle_xpath.isDisplayed();

    }
    public void enterEmail(String email)throws InterruptedException{
        email_id.clear();
        email_id.sendKeys(email);
        Thread.sleep(2000);
    }
    public void enterPassword(String password)throws InterruptedException{
        password_id.sendKeys(password);
        Thread.sleep(2000);
    }
    public void loginButtonSubmit()throws InterruptedException{
        loginsubmit_id.click();
        Thread.sleep(2000);
    }

    public void verifyLoginPageIsDisplayed() throws InterruptedException {
        loginHeading_id.isDisplayed();
        Thread.sleep(2000);
    }

    public void clickSignupToggle()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signup-toggle")));
        signuptoggle_id.click();
    }

    public void verifyRegistrationHeadingIsDisplayed()throws InterruptedException {
        Thread.sleep(2000);
        registrationHeading_id.isDisplayed();

    }

}
