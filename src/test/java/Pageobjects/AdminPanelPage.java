package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPanelPage {

    @FindBy(id = "//h1[contains(text(), \"Admin Dashboard\")]") WebElement adminDashboardHeading_id;
    @FindBy(id = "//button[text() = \"Approvals\"]") WebElement approvalsButton_id;
    @FindBy(id = "(//button[contains(text() , \"Approve\")])[2]") WebElement approveButton_id;
    @FindBy(id = "//div[input[@placeholder=\"Search by name or email...\"]]") WebElement searchBox_id;
    @FindBy(id = "//button[text() = \"Users\"]") WebElement usersButton_id;
    @FindBy(id = "//input[contains(@placeholder,\"Search users\")]") WebElement searchUsersBox_id;
    @FindBy(id = "(//select[.//option[contains(text(),\"Admin\")]])[1]") WebElement roleDropdown_id;
    @FindBy(id = "//button[contains(text(), \"Back to Website\")]") WebElement backToWebsiteButton_id;
    @FindBy(id = "//button[.//span[text()=\"Logout\"]]") WebElement logoutButton_id;

    //U+D83D
    public void verifyAdminDashboardHeadingIsDisplayed() throws InterruptedException {
        adminDashboardHeading_id.isDisplayed();
        Thread.sleep(2000);
    }

    public void clickApprovalsButton() throws InterruptedException {
        approvalsButton_id.click();
        Thread.sleep(2000);
    }

       public void enterSearchQuery(String query) throws InterruptedException {
        searchBox_id.clear();
        searchBox_id.sendKeys(query);
        Thread.sleep(2000);
    }

    public void clickApproveButton() throws InterruptedException {
        approveButton_id.click();
        Thread.sleep(2000);
    }

    public void clickUsersButton() throws InterruptedException {
        usersButton_id.click();
        Thread.sleep(2000);
    }

    public void enterSearchUsersQuery(String query) throws InterruptedException {
        searchUsersBox_id.clear();
        searchUsersBox_id.sendKeys(query);
        Thread.sleep(2000);
    }

    public void selectRoleFromDropdown(String role) throws InterruptedException {
            roleDropdown_id.sendKeys(role);
            Thread.sleep(2000);
    }

    public void clickBackToWebsiteButton() throws InterruptedException {
        backToWebsiteButton_id.click();
        Thread.sleep(2000);
    }

    public void clickLogoutButton() throws InterruptedException {
        logoutButton_id.click();
        Thread.sleep(2000);
    }





}
