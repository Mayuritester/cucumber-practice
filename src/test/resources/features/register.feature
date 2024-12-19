@regression
Feature: Register page functionality
  In order to perform successful
  As a User
  I want to register on the website so that I can create account successfully.

  @sanity
  Scenario: Verify user should navigate to register page successfully
    Given I am on the home page
    When I click on the Register link
    Then I should see the text Register

  @smoke
  Scenario: Verify that first name, last name, email, password, and confirm password fields are mandatory
    Given I am on the home page
    When I click on the Register link
    And I click on register button
    Then I should see the error message First name is required.
    And I should see the error message Last name is required.
    And I should see the error message Email is required.
    And I should see the error message password is required.
    And I should see the error message confirm password is required.

  Scenario: Verify that user should create account successfully
    Given I am on the home page
    When I click on the Register link
    And I select the gender female
    And I enter the first name "Tithi"
    And I enter the last name "Shah"
    And I enter the email "Radhika.shah1901@gmail.com"
    And I enter the password "Radhika123"
    And I enter the confirm password "Radhika123"
    And I click on register button
    Then I should see the message Your registration completed

