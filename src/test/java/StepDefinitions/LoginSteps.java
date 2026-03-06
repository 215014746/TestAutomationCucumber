package StepDefinitions;

import Utils.Base;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSteps extends Base {

    String emailToUse = SignupSteps.generatedEmail;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws InterruptedException {
        homePage.clickLoginButton();
    }

    @When("I enter valid username")
    public void i_enter_valid_username() {
        loginPage.enterEmail(emailToUse);
    }

    @When("I enter valid password {}")
    public void i_enter_valid_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        loginPage.loginButtonSubmit();
    }

    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
        learnPage.verifyHeading();
    }

    @And("I click the new Admin button")
    public void iClickTheNewAdminButton() {
        learnPage.clickAdminButton();
    }

    @Then("verify that the Admin Panel button is visible")
    public boolean verifyThatTheAdminPanelButtonIsVisible() {
       return learnPage.verifyAdminPanelButtonIsDisplayed();
    }

    @And("I click on the logout button")
    public void iClickOnTheLogoutButton() {
        adminPanelPage.clickLogoutButton();
    }
}
