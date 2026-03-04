package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage {

WebDriver driver;



        @FindBy(xpath = "//h1[ normalize-space()=\"Master Test Automation\"]") WebElement homepageTitle_id;
        @FindBy(xpath ="//button[.//span[text()=\"Login\"]]") WebElement loginButton_xpath;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageIsDisplayed() throws InterruptedException{
        homepageTitle_id.isDisplayed();
        Thread.sleep(2000);
    }

    public void clickLoginButton() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()=\"Login\"]]")));
        loginButton_xpath.click();
    }


}
