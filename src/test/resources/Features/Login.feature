Feature: log in test

  Scenario Outline: Log in as admin to approve user account and assign admin role, then user logs in successfully
    Given I am on the login page
    When I enter valid username
    And I enter valid password <Password>
    And I click the login button
    Then I should be redirected to the dashboard
    And I click the new Admin button
    Then  verify that the Admin Panel button is visible
    And I click on the logout button


    Examples:
      | Password  |
      | @12345678 |




