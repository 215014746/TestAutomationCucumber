Feature: admin panel

  //Scenario: Admin can access the admin panel

  Scenario Outline: Admin logs into the system
    Given I am on the admin login page
    When I enter a valid admin username <Username>
    And I enter a valid admin password <Password>
    And I will click on the login button
    Then I should be redirected to the admin dashboard
    And I click the Admin button
    And I click the Admin Panel button

    And I click the Approvals button
    And I search approvals for "<query>"
    And I click the Approve button
    And I click the Users button
    And I search users for "<query>"
    And I select role "<role>" from the dropdown
    And I click the Back to Website button
    And I click the Logout button

    Examples:
      | Username        | Password  | query       | role  |
      | admin@gmail.com | @12345678 | zee4@ndu.com | Admin |



