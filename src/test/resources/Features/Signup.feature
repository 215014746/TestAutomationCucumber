Feature: User registration and admin approval

  Scenario Outline: User creates account and admin approves it
    Given I am on the signup page
    When I enter valid first name <firstName>
    And I enter valid last name <lastName>
    And I enter email <email>
    And I enter password <password>
    And I enter confirm password <confirmPassword>
    And I select a group <group>
    And I click create account button
    Then I should see a message <Message>

    Examples:

      | firstName | lastName | email        | password   | confirmPassword | group                 | Message                                                                      |
      | Zee       | Ndu      | zee2@ndu.com | @123456789 | @12345678       | 1st Group 2026 (2026) | Passwords do not match!                                                      |
      | Zee       | Ndu      | zee3@        | @12345678  | @12345678       | 1st Group 2026 (2026) | Please enter a valid email address                                           |
      | Zee       | Ndu      | AUTO         | @12345678  | @12345678       | 1st Group 2026 (2026) | Registration submitted successfully. Your account is pending admin approval. |

