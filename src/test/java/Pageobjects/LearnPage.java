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
    @FindBy(id = "//button[.//span[text()=\"admin\"]]") WebElement adminButton_id;
    @FindBy(id = "(//button[.//span[text()=\"Admin Panel\"]])[1]") WebElement adminPanelButton_id;

    public LearnPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHeading(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Welcome back')]")));

        welcomeHeading_xpath.isDisplayed();
    }

    public void clickAdminButton(){
        adminButton_id.click();
    }

    public void clickAdminPanelButton(){
        adminPanelButton_id.click();
    }


}
