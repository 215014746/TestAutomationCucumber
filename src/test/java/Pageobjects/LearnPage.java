package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearnPage {

    @FindBy(id = "practice-heading") WebElement welcomeHeading_id;
    @FindBy(id = "//button[.//span[text()=\"admin\"]]") WebElement adminButton_id;
    @FindBy(id = "(//button[.//span[text()=\"Admin Panel\"]])[1]") WebElement adminPanelButton_id;

    public void verifyHeading(){
        welcomeHeading_id.isDisplayed();
    }

    public void clickAdminButton(){
        adminButton_id.click();
    }

    public void clickAdminPanelButton(){
        adminPanelButton_id.click();
    }


}
