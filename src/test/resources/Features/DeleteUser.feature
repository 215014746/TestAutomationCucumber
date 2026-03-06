Feature: Delete user account

  Scenario Outline: Admin deletes a user account
    Given I am on the admin login page
    When I enter a valid admin username <Username>
    And I enter a valid admin password <Password>
    And I will click on the login button
    Then I should be redirected to the admin dashboard
    And I click the Admin button
    And I click the Admin Panel button
    And I click the Users button
    And I search for a user to delete
    And I click the Delete button
    And I confirm the deletion
    Then I should see a message <Message>

    Examples:
      | Username        | Password  |Message                    |
      | admin@gmail.com | @12345678 |User deleted successfully! |