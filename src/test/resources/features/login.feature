@regression
Feature: Login Page Functionality
  In order to perform successful
  As a User
  I have to ensure the login page operates as expected for all users

  @sanity @author_Mayuri
  Scenario: User should navigate to login page successfully
    Given I am on the home page
    When I click on the login link
    Then I should see the message "Welcome, Please Sign In!"

  @smoke
  Scenario: Verify the error message with invalid credentials
    Given I am on the login page
    When I enter an invalid EmailId "maya@gmail.com"
    And I enter an invalid Password "m1234"
    And I click on the login button
    Then I should see the error message "Login was unsuccessful. Please correct the errors and try again.No customer account found "

  Scenario: Verify that user should log in successfully with valid credentials
    Given I am on the login page
    When  I enter a valid EmailId "priya@gmail.com"
    And I enter a valid password "Priya123"
    And I click on the login button
    Then I should see the "LogOut" link displayed

  Scenario: Verify that user should log out successfully
    Given I click on the login link
    When I enter a valid EmailId "mayuri007@gmail.com"
    And I enter a valid password "mayuri2201"
    When I click on the logout link
    Then I should see the login link displayed
