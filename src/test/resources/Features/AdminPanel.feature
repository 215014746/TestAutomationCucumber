Feature: admin panel

  Scenario: Admin can access the admin panel
    Given I am logged in as an admin
    When I navigate to the admin panel
    Then I should see the admin dashboard


    When I navigate to the Approvals section
    Then I should see a list of all users that require approval
    When I select a user and click Approve
    Then the user's account should be activated
    Then I should be able to update the user's information


    When I navigate to the Users section
    Then I should see a list of all users
    When I view a user and select role
    Then I should be able to assign or change the user's role (Admin, User)
    Then the user's role should be updated accordingly