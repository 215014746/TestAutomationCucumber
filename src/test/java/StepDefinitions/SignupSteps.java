package StepDefinitions;

import Utils.Base;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class SignupSteps extends Base {

    @Given("I am on the signup page")
    public void i_am_on_the_signup_page()throws InterruptedException {
        signupPage.verifySignupPageIsDisplayed();
    }
    @When("I enter valid first name Zee")
    public void i_enter_valid_first_name(String firstName)throws InterruptedException {
        signupPage.enterFirstName(firstName);
    }
    @When("I enter valid last name Ndu")
    public void i_enter_valid_last_name(String lastName)throws InterruptedException {

        signupPage.enterLastName(lastName);
    }
    @When("I enter email zee@ndu.com")
    public void i_enter_email()throws InterruptedException {

        signupPage.generateUniqueEmail();
    }
    @When("I enter password @{int}")
    public void i_enter_password(String password)throws InterruptedException {

        signupPage.enterPassword(password);
    }
    @When("I enter confirm password @{int}")
    public void i_enter_confirm_password(String confirmPassword) throws InterruptedException{

        signupPage.enterConfirmPassword(confirmPassword);
    }
    @When("I select a group 1st Group {int}")
    public void i_select_a_group_1st_group(String group) throws InterruptedException{

        signupPage.selectGroup(group);
    }
    @When("I click create account button")
    public void i_click_create_account_button() throws InterruptedException{

        signupPage.clickRegisterSubmit();
    }
    @Then("I should see a success message")
    public String i_should_see_a_success_message()throws InterruptedException {
        String actualValue = signupPage.getSignupSuccessMessage();
        System.out.println("Actual signup success message: " + actualValue);
        String expectedValue = "Registration submitted successfully. Your account is pending admin approval.";
        Assert.assertEquals(actualValue, expectedValue, "Expected message: " + expectedValue + ", but got: " + actualValue);
   return actualValue;
    }

}
