package StepDefinitions;

import Utils.Base;
import io.cucumber.java.en.Then;

public class DeleteSteps extends Base {

    @Then("I search for a user to delete")
    public void i_search_for_a_user_to_delete() {

        String emailToSearch = SignupSteps.generatedEmail;
        if (emailToSearch == null) {
            throw new RuntimeException("No generated email found! Make sure the signup step ran with AUTO email.");
        }
        adminPanelPage.enterSearchUsersQuery(emailToSearch);
    }
    @Then("I click the Delete button")
    public void i_click_the_delete_button() {
        adminPanelPage.clickDeleteUserButton();
    }
    @Then("I confirm the deletion")
    public void i_confirm_the_deletion() {

    }

}
