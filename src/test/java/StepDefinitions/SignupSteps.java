package StepDefinitions;

import Utils.Base;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class SignupSteps extends Base {

    @Given("I am on the signup page")
    public void i_am_on_the_signup_page()throws InterruptedException {
        homePage.clickLoginButton();
        loginPage.clickSignupToggle();
    }
    @When("I enter valid first name {}")
    public void i_enter_valid_first_name(String firstName)throws InterruptedException {
        signupPage.enterFirstName(firstName);
    }
    @When("I enter valid last name {}")
    public void i_enter_valid_last_name(String lastName)throws InterruptedException {

        signupPage.enterLastName(lastName);
    }
    @When("I enter email {}")
    public void i_enter_email(String email)throws InterruptedException {

        signupPage.enterEmail(email);
    }
    @When("I enter password {}")
    public void i_enter_password(String password)throws InterruptedException {

        signupPage.enterPassword(password);
    }
    @When("I enter confirm password {}")
    public void i_enter_confirm_password(String confirmPassword) throws InterruptedException{

        signupPage.enterConfirmPassword(confirmPassword);
    }
    @When("I select a group {}")
    public void i_select_a_group(String group) throws InterruptedException{

        signupPage.selectGroup(group);
    }
    @When("I click create account button")
    public void i_click_create_account_button() throws InterruptedException{

        signupPage.clickRegisterSubmit();
    }
    @Then("I should see a message {}")
    public void i_should_see_a_success_message(String message) {
    signupPage.confirmIfMessageIsDisplayed(message);
    }

}
