package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

WebDriver driver;



        @FindBy(id = "//h1[@class='hero-title' and normalize-space()='Master Test Automation']") WebElement homepageTitle_id;
        @FindBy(id ="//button[.//span[text()=\"Login\"]]") WebElement loginButton_id;
        @FindBy(id = "signup-toggle")WebElement signuptoggle_id;
        @FindBy(id = "registration-heading") WebElement registrationHeading_id;
        @FindBy(id ="login-heading") WebElement loginHeading_id;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageIsDisplayed() throws InterruptedException{
        homepageTitle_id.isDisplayed();
        Thread.sleep(2000);
    }

    public void clickLoginButton() throws InterruptedException{
        loginButton_id.click();
        Thread.sleep(2000);
    }

    public void verifyLoginPageIsDisplayed() throws InterruptedException {
        loginHeading_id.isDisplayed();
        Thread.sleep(2000);
    }

    public void clickSignupToggle()throws InterruptedException {
        signuptoggle_id.click();
        Thread.sleep(2000);
    }

    public void verifyRegistrationHeadingIsDisplayed()throws InterruptedException {
        registrationHeading_id.isDisplayed();
        Thread.sleep(2000);
    }
}
