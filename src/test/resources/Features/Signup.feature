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
    Then I should see a success message

  Examples:

    | firstName | lastName | email       | password  | confirmPassword | group          |
    | Zee       | Ndu      |zee@ndu.com | @12345678 | @12345678       | 5th Group 2026  |
