Feature: Add New User

   Scenario: Register a new user with valid details
    Given I am on the Ndosi login screen
    And I click "Sign up here"
    When I enter registration details
    And I press the "Create account" button
    Then I should see a registration success message
    And I confirm by clicking "OK"






  Scenario Outline: Approve and promote a registered user
    Given I am on the login page
    When I enter admin username "<username>"
    And I enter admin password "<password>"
    And I click the login button
    And I click the Admin button
    And I navigate to the admin panel
    And I go to the approval section
    When I search for the registered user by email
    And I click Approve for that user


    And I navigate to the users section
    And I search for the approved user by email
    And I change this user's role to "admin"
    Then a confirmation message "User role updated to admin successfully!" is displayed
    And I click OK on the confirmation
    And I navigate back to the website home page
  And I click admin tab
    Then I click the Logout button
    And accept logout confirmation popup


    Examples:
      | username        | password   |
      | admin@gmail.com | @12345678  |




  Scenario: Login with the newly registered user
    When I log in with the registered






  Scenario Outline: Admin deletes a newly created user
    Given I am on the Ndosi login Dashboard
    When I enter the admin email "<username>"
    And I enter the admin valid password "<password>"
    And I click the delete login button

    And I click the Admin Tab
    And I navigate to the Admin Panel section

    And I click the Users Tab
    And I search for an email to be delete the user
    And I delete the newly created user by email
    Then a confirmation message "Are you sure you want to delete this user?" is displayed after deletion

    And I navigate back to the website home dashaboard
    And I navigate to the admin Button to logout
    And I click the Logout Btn

    Examples:
      | username        | password   |
      | admin@gmail.com | @12345678  |






