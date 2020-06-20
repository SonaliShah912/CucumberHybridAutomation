
Feature: User login for Automation Practice
  As a user
  I want to login successfully
  so that I can excess my account


  @smoke1
  Scenario Outline: Verify user can see validation messages for invalid credentials
    Given I am on Homepage
    When I click on SignIn link
    Then I should be on Authentication page
    And I should see SignUp panel
    When I enter EmailId as <emailID> and password as <password>
    And I click signIn
    Then I should not be login
    And I should see validation message as <message>
         Examples:
           | emailID                    | password  | message                    |
           | sonu                       | pjj       | Invalid email address.     |
           |                            |           | An email address required. |
           | testaccount@mailinator.com | pjjj      | Invalid password.          |
           | testaccount                | Password1 | Invalid email address.     |
