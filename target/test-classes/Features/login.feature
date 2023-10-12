#author: shivaskqa@gmail.com
@login
Feature: feature to test Login functionality

  @loginwithvalidcreds
  Scenario: Check login with valid credentials
    Given user is on login page
    When user enters username, password
    And click on login button
    Then user navigates to home page

  @loginwithinvalidcreds
  Scenario Outline: Title of your scenario outline
    Given user is on login page
    When user enters "<username>", "<password>"
    And click on login button
    Then user navigates to home page

    Examples: 
      | username | password |
      | user1    | pass1    |