Feature: Navigation from Home to Signup

  As a user,
  I want to access the home page and navigate to the login page
  So that I can log in to my account.

  Scenario: User navigates from home page to signup page
    Given I am on the Home page
    Then I should see the page title as "Master Test Automation"
    When I click on the login button
    Then I should see the login page
    When I click on the signup button
    Then I should see the signup page