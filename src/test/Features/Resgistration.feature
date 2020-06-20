Feature: New user registration for creating account
  As a user
  I want to register successfully
  so that I can create my account
  Background:
    Given I am on Homepage
    When I click on SignIn link
    Then I should be on Authentication page
    And I should see SignUp panel
    When I Enter Email as sonushah1369@hotmail.com
    And I click create an account
    Then I am on Registration page
    @regression2
  Scenario: Verify user can open account with valid required credentials
    Given I am on Registration page
    When I enter first name as sonu and last name as shah
    And I enter password as "sona1234"and city as "Alaska"
    And I select state as <any>
    And I enter Address as "121, spectrum tower"
    And I enter zip code as "00000" and mobile no as "07332010544"
    And click register button
    Then I should create my account
    And I should be on my Account page
  #UNHAPPY PATH SCENARIO
  @smoke
  Scenario Outline:
    Given I am on Registration page
    When I enter first name as <firstName> and last name as <lastName>
    And I enter password as <password>and city as <city>
    And I select state as <state>
    And I enter Address as <Address>
    And  I enter zip code as <zipCode> and mobile no as <mobileNo>
    And click register button
    Then I should not create an account and see validation message as <message>
    Examples:
      | firstName | lastName | password | city  | state   | Address | zipCode | mobileNo | message               |
      | sonu      | shah     | so12     | lon23 | Arizona | 116     | 000     | 2341234  | passwd is invalid.    |
      |           |          | so12     | lon23 | Arizona | 116     | 00000   | 2341234  | lastname is required. |
      | 123       | 15       | sonna123 | lon23 | Arizona | 116     | 00000   | 2341234  | lastname is invalid.  |

