package StepDefinitions;

import Utils.Base;
import io.cucumber.java.en.*;

public class HomePageSteps extends Base {
    @Given("I am on the Home page")
    public void i_am_on_the_home_page() {

        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see the page title as {string}")
    public void i_should_see_the_page_title_as(String string)throws InterruptedException {
        homePage.verifyHomePageIsDisplayed();
    }
    @When("I click on the login button")
    public void i_click_on_the_login_button()throws InterruptedException {
        homePage.clickLoginButton();
    }
    @Then("I should see the login page")
    public void i_should_see_the_login_page()throws InterruptedException {
        homePage.verifyLoginPageIsDisplayed();
    }
    @When("I click on the signup button")
    public void i_click_on_the_signup_button() throws InterruptedException {
        homePage.clickSignupToggle();
    }
    @Then("I should see the signup page")
    public void i_should_see_the_signup_page()throws InterruptedException {
    homePage.verifyRegistrationHeadingIsDisplayed();
    }

}
