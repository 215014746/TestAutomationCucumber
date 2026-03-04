package Pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SignupPage {

    WebDriver driver;

    @FindBy(xpath = "//h2[@id = \"registration-heading\"]")
    WebElement registrationheading_id;
    @FindBy(id = "register-firstName")
    WebElement registerfirstname_id;
    @FindBy(id = "register-lastName")
    WebElement registerlastname_id;
    @FindBy(id = "register-email")
    WebElement registeremail_id;
    @FindBy(id = "register-password")
    WebElement registerpassword_id;
    @FindBy(id = "register-confirmPassword")
    WebElement registerconfirmpassword_id;
    @FindBy(id = "register-group")
    WebElement groupDropdownId;
    @FindBy(id = "register-submit")
    WebElement registersubmit_id;
    @FindBy(id = "registration-success")
    WebElement registrationSuccessMessage_id;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifySignupPageIsDisplayed() throws InterruptedException {
        registrationheading_id.isDisplayed();
        Thread.sleep(3000);
    }

    public void enterFirstName(String firstname) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-firstName")));
        registerfirstname_id.clear();
        registerfirstname_id.sendKeys(firstname);
    }

    public void enterLastName(String lastname) throws InterruptedException {
        registerlastname_id.clear();
        registerlastname_id.sendKeys(lastname);
        Thread.sleep(2000);
    }

    public void enterEmail(String email) throws InterruptedException {
        registeremail_id.clear();
        registeremail_id.sendKeys(email);
        Thread.sleep(2000);
    }

    public void enterPassword(String password) throws InterruptedException {
        registerpassword_id.clear();
        registerpassword_id.sendKeys(password);
        Thread.sleep(2000);
    }

    public void enterConfirmPassword(String confirmpassword) throws InterruptedException {
        registerconfirmpassword_id.clear();
        registerconfirmpassword_id.sendKeys(confirmpassword);
        Thread.sleep(2000);
    }

    public void selectGroup(String group) {

        WebElement dropdown = driver.findElement(By.id("register-group"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(group);
    }

    public void clickRegisterSubmit() throws InterruptedException {
        registersubmit_id.click();

    }

    // Generate NEW email each run
    public String generateUniqueEmail() {
        long timestamp = System.currentTimeMillis();
        return "user" + timestamp + "@mail.com";
    }

    public void confirmIfMessageIsDisplayed(String expectedMessage) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the alert is present
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // Get alert text and assert it matches the expected message
        String alertText = alert.getText();
        Assert.assertEquals(alertText, expectedMessage);

        // Accept (close) the alert
        alert.accept();

    }

}
