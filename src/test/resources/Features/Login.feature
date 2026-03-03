Feature: log in test
  Scenario Outline: Log in as admin to approve user account and assign admin role, then user logs in successfully
    Given I am on the login page
    When I enter valid username "<adminUsername>"
    And I enter valid password "<adminPassword>"
    And I click the login button
    Then I should be redirected to the dashboard

    When I navigate to the user management page
    And I approve the user "<newUsername>"
    And I assign admin role to the user "<newUsername>"
    And I log out

    When I enter valid username "<newUsername>"
    And I enter valid password "<newPassword>"
    And I click the login button
    Then I should be redirected to the dashboard
    And I should see admin privileges enabled

    Examples:
      | adminUsername   | adminPassword | newUsername | newPassword |
      | admin@gmail.com | @12345678      | newuser1    | Password123 |



