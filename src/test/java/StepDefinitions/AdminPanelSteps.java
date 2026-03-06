package StepDefinitions;

import Utils.Base;
import io.cucumber.java.en.*;

public class AdminPanelSteps extends Base {
    String emailToSearch = SignupSteps.generatedEmail;

    @Given("I am on the admin login page")
    public void i_am_on_the_admin_login_page() {
        homePage.clickLoginButton();
    }

    @When("I enter a valid admin username {}")
    public void i_enter_a_valid_admin_username_admin(String email) {
        loginPage.enterEmail(email);
    }

    @When("I enter a valid admin password {}")
    public void i_enter_a_valid_admin_password(String password) {
        loginPage.enterPassword(password);

    }

    @When("I will click on the login button")
    public void i_will_click_on_the_login_button() {
        loginPage.loginButtonSubmit();
    }

    @Then("I should be redirected to the admin dashboard")
    public void i_should_be_redirected_to_the_admin_dashboard() {
        learnPage.verifyHeading();
    }


    @Then("I click the Admin button")
    public void i_click_the_admin_button() {
        learnPage.clickAdminButton();
    }

    @Then("I click the Admin Panel button")
    public void i_click_the_admin_panel_button() {
        learnPage.clickAdminPanelButton();
    }

    @Then("I click the Approvals button")
    public void i_click_the_approvals_button() {
        adminPanelPage.clickApprovalsButton();
    }

    @Then("I search for a user approve")
    public void i_search_approvals_for() {
        String emailToSearch = SignupSteps.generatedEmail; // get it at runtime
        if (emailToSearch == null) {
            throw new RuntimeException("No generated email found! Make sure the signup step ran with AUTO email.");
        }
        adminPanelPage.enterSearchQuery(emailToSearch);
    }

    @Then("I click the Approve button")
    public void i_click_the_approve_button() {
        adminPanelPage.clickApproveButton();
    }

    @Then("I click the Users button")
    public void i_click_the_users_button() {
        adminPanelPage.clickUsersButton();
    }

    @Then("I search a user to assign a role")
    public void i_search_users_for() {

        String emailToSearch = SignupSteps.generatedEmail; // get it at runtime
        if (emailToSearch == null) {
            throw new RuntimeException("No generated email found! Make sure the signup step ran with AUTO email.");
        }
        adminPanelPage.enterSearchUsersQuery(emailToSearch);
    }

    @Then("I select role {string} from the dropdown")
    public void i_select_role_from_the_dropdown(String role) {
        adminPanelPage.selectRoleFromDropdown(role);
    }

    @Then("I click the Back to Website button")
    public void i_click_the_back_to_website_button() {
        adminPanelPage.clickBackToWebsiteButton();
    }//

    @Then("I click again the Admin button")
    public void i_click_again_the_admin_button() {
        learnPage.clickAdminButton();
    }

    @Then("I click the Logout button")
    public void i_click_the_logout_button() {
        adminPanelPage.clickLogoutButton();
    }


}
