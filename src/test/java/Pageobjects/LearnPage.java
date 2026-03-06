package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnPage {

    WebDriver driver;
    @FindBy(xpath = "//h2[contains(text(),'Welcome back')]") WebElement welcomeHeading_xpath;
    @FindBy(xpath = "//button[contains(@class,'user-pill')]") WebElement adminButton_xpath;
    @FindBy(xpath = "(//button[.//span[text()=\"Admin Panel\"]])[1]") WebElement adminPanelButton_xpath;

    public LearnPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHeading() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Welcome back')]")));

        welcomeHeading_xpath.isDisplayed();
    }

    public void clickAdminButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'user-pill')]")));

        adminButton_xpath.click();
    }

    public void clickAdminPanelButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[.//span[text()=\"Admin Panel\"]])[1]")));
        adminPanelButton_xpath.click();
    }

    public boolean verifyAdminPanelButtonIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[.//span[text()=\"Admin Panel\"]])[1]")));
        adminPanelButton_xpath.isDisplayed();
        return true;
    }


}
