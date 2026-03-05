package StepDefinitions;

import Utils.Base;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class SignupSteps extends Base {

    public static String generatedEmail;

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
    public void i_enter_valid_last_name(String lastName){

        signupPage.enterLastName(lastName);
    }
    @When("I enter email {}")
    public void i_enter_email(String email) {

       /* if(email.equals("AUTO")) {
            email = signupPage.generateUniqueEmail();
        }

        signupPage.enterEmail(email);*/

        if (email.equalsIgnoreCase("AUTO")) {
            generatedEmail = signupPage.generateUniqueEmail();
            signupPage.enterEmail(generatedEmail);
        }else {
            generatedEmail = email; // store it even if not AUTO
            signupPage.enterEmail(email);
        }
    }
    @When("I enter password {}")
    public void i_enter_password(String password) {

        signupPage.enterPassword(password);
    }
    @When("I enter confirm password {}")
    public void i_enter_confirm_password(String confirmPassword) {

        signupPage.enterConfirmPassword(confirmPassword);
    }
    @When("I select a group {}")
    public void i_select_a_group(String group) {

        signupPage.selectGroup(group);
    }
    @When("I click create account button")
    public void i_click_create_account_button(){

        signupPage.clickRegisterSubmit();
    }
    @Then("I should see a message {}")
    public void i_should_see_a_success_message(String message) {
    signupPage.confirmIfMessageIsDisplayed(message);
    }

}
