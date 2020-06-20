Feature: User login for Automation Practice
  As a user
  I want to login successfully
  so that I can excess my account

  Background:
    Given I am on Homepage
    When I click on SignIn link
    Then I should be on Authentication page
    And I should see SignUp panel

  @smoke1
  Scenario: Verify user can login with valid credentials
    When I enter EmailId as testaccount@mailinator.com and password as Password1
    And I click signIn
    Then I should be Logged in Successfully
    And I should be on my Account page
  @smoke1
  Scenario: Verify User can go to create account page
    When I Enter Email as sonushah1369@hotmail.com
    And I click create an account
    Then I should be on create an account page
