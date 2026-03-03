Feature: Learn test

  Scenario: User navigates to the learn page
    Given I am on the learn page
    Then I should see the page title as "Welcome back, Admin!"
    And I should click on the Admin button
    And I should click on Admin panel button
    Then I should see the admin panel page
