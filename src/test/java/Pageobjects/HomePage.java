package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

WebDriver driver;



        @FindBy(xpath = "//h1[ normalize-space()=\"Master Test Automation\"]") WebElement homepageTitle_xpath;
        @FindBy(xpath ="//button[.//span[text()=\"Login\"]]") WebElement loginButton_xpath;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[ normalize-space()=\"Master Test Automation\"]")));

        homepageTitle_xpath.isDisplayed();
    }

    public void clickLoginButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()=\"Login\"]]")));
        loginButton_xpath.click();
    }


}
