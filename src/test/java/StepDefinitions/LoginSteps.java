package StepDefinitions;

import Utils.Base;
import io.cucumber.java.en.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSteps extends Base {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws InterruptedException {
        homePage.clickLoginButton();
    }
    @When("I enter valid username {}")
    public void i_enter_valid_username(String email)throws InterruptedException {
        loginPage.enterEmail(email);
    }
    @When("I enter valid password {}")
    public void i_enter_valid_password(String password) throws InterruptedException {
        loginPage.enterPassword(password);
    }
    @When("I click the login button")
    public void i_click_the_login_button() throws InterruptedException{
        loginPage.loginButtonSubmit();
    }
    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() throws InterruptedException{
        learnPage.verifyHeading();
    }
}
