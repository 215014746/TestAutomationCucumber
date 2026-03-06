package Pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPanelPage {
    WebDriver driver;

    @FindBy(xpath = "//h1[contains(text(), \"Admin Dashboard\")]") WebElement adminDashboardHeading_xpath;
    @FindBy(xpath = "//button[text() = \"Approvals\"]") WebElement approvalsButton_xpath;
    @FindBy(xpath = "//input[@placeholder='Search by name or email...']") WebElement searchApprovalsBox_xpath;
    @FindBy(xpath = "//button[contains(text(),'Approve')]") WebElement approveButton_xpath;
    @FindBy(xpath = "//button[text() = \"Users\"]") WebElement usersButton_xpath;
    @FindBy(xpath = "//input[contains(@placeholder,\"Search users\")]") WebElement searchUsersBox_xpath;
    @FindBy(xpath = "//select[option[@value='admin']]") WebElement roleDropdown_xpath;
    @FindBy(xpath = "//button[contains(text(), \"Back to Website\")]") WebElement backToWebsiteButton_xpath;
    @FindBy(xpath = "//button[.//span[text()=\"Logout\"]]") WebElement logoutButton_xpath;
    @FindBy(xpath = "//button[normalize-space()='\uD83D\uDDD1\uFE0F']") WebElement deleteUserButton_xpath;


    public AdminPanelPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyAdminDashboardHeadingIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), \"Admin Dashboard\")]")));
        adminDashboardHeading_xpath.isDisplayed();
    }

    public void clickApprovalsButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = \"Approvals\"]")));
        approvalsButton_xpath.click();

    }

       public void enterSearchQuery(String query) {
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search by name or email...']")));
           searchApprovalsBox_xpath.clear();
           searchApprovalsBox_xpath.sendKeys(query);

    }

    public void clickApproveButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Approve')]")));
        approveButton_xpath.click();
    }

    public void clickUsersButton()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = \"Users\"]")));
        usersButton_xpath.click();
    }

    public void enterSearchUsersQuery(String query) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,\"Search users\")]")));
        searchUsersBox_xpath.clear();
        searchUsersBox_xpath.sendKeys(query);

    }

    public void handleAlertIfPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Alert message: " + alert.getText());
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert present");
        }
    }
    public void selectRoleFromDropdown(String role)  {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement roleDropdown = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//select[option[@value='admin']]"))
        );

        Select select = new Select(roleDropdown);
        select.selectByValue(role);

        // Handle alert after selecting role
        handleAlertIfPresent();

    }

    public void clickBackToWebsiteButton()  {
        handleAlertIfPresent();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), \"Back to Website\")]")));
        backToWebsiteButton_xpath.click();

    }

    public void clickLogoutButton()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()=\"Logout\"]]")));
        logoutButton_xpath.click();

    }

    public void clickDeleteUserButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='\uD83D\uDDD1\uFE0F']")));
        deleteUserButton_xpath.click();

        handleAlertIfPresent();
    }

}
