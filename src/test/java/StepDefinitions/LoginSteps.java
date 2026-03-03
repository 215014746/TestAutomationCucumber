package StepDefinitions;

import Utils.Base;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps extends Base {
    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws InterruptedException {
        loginPage.verifyLoginpageIsDisplayed();
    }
    @When("I enter valid username sss@sss.com")
    public void i_enter_valid_username_sss_sss_com(String email)throws InterruptedException {
        loginPage.enterEmail(email);
    }
    @When("I enter valid password @{int}")
    public void i_enter_valid_password(String password) throws InterruptedException {
        loginPage.enterPassword(password);
    }
    @When("I click the login button")
    public void i_click_the_login_button() throws InterruptedException{
        loginPage.loginButtonSubmit();
    }
    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() throws InterruptedException{

        String actualValue = loginPage.getLoginSuccessMessage();
            System.out.println("Actual login success message: " + actualValue);
            String expectedValue = "Welcome back, Admin!";
            Assert.assertEquals(actualValue, expectedValue, "Expected message: " + expectedValue + ", but got: " + actualValue);
   }

}
