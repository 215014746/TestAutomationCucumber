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

    @FindBy(xpath = "//h2[@id = \"registration-heading\"]") WebElement registrationheading_id;
    @FindBy(id = "register-firstName") WebElement registerfirstname_id;
    @FindBy(id = "register-lastName") WebElement registerlastname_id;
    @FindBy(id = "register-email") WebElement registeremail_id;
    @FindBy(id = "register-password") WebElement registerpassword_id;
    @FindBy(id = "register-confirmPassword") WebElement registerconfirmpassword_id;
    @FindBy(id = "register-group") WebElement groupDropdownId;
    @FindBy(id = "register-submit") WebElement registersubmit_id;
    @FindBy(id = "registration-success") WebElement registrationSuccessMessage_id;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifySignupPageIsDisplayed()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id = \"registration-heading\"]")));
        registrationheading_id.isDisplayed();

    }

    public void enterFirstName(String firstname)  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-firstName")));
        registerfirstname_id.clear();
        registerfirstname_id.sendKeys(firstname);
    }

    public void enterLastName(String lastname)  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-lastName")));
        registerlastname_id.clear();
        registerlastname_id.sendKeys(lastname);

    }

    public void enterEmail(String email)  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-email")));
        registeremail_id.clear();
        registeremail_id.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-password")));
        registerpassword_id.clear();
        registerpassword_id.sendKeys(password);

    }

    public void enterConfirmPassword(String confirmpassword)  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-confirmPassword")));
        registerconfirmpassword_id.clear();
        registerconfirmpassword_id.sendKeys(confirmpassword);

    }

    public void selectGroup(String group) {

        WebElement dropdown = driver.findElement(By.id("register-group"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(group);
    }

    public void clickRegisterSubmit() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("registration-heading")));
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
