Feature: User Registration Negative Scenarios
  As a user
  I want to be prevented from registering with invalid details
  So that the system enforces proper validation rules

  Scenario: Registration fails when mandatory fields are empty
    Given I am on the Ndosi login screen
    And I click "Sign up here"
    When I press the "Create account" button
    Then I should see a mandatory fields error
@smoke
  Scenario: Registration fails with invalid first name
    Given I am on the Ndosi login screen
    And I click "Sign up here"
    When I enter registration details with invalid first name
    And I press the "Create account" button
    Then I should see a first name error

  Scenario: Registration fails with invalid last name
    Given I am on the Ndosi login screen
    And I click "Sign up here"
    When I enter registration details with invalid last name
    And I press the "Create account" button
    Then I should see a last name error

  Scenario: Registration fails with short password
    Given I am on the Ndosi login screen
    And I click "Sign up here"
    When I enter registration details with short password
    And I press the "Create account" button
    Then I should see a password length error

  Scenario: Registration fails with password missing special character
    Given I am on the Ndosi login screen
    And I click "Sign up here"
    When I enter registration details with password missing special character
    And I press the "Create account" button
    Then I should see a password special character error

  Scenario: Registration fails with mismatched confirmation
    Given I am on the Ndosi login screen
    And I click "Sign up here"
    When I enter registration details with mismatched confirmation
    And I press the "Create account" button
    Then I should see a password confirmation error


