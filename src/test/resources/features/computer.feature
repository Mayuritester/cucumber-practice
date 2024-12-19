@regression
Feature: Computer Page Functionality
  As a user
  I want to navigate all feature on computer page on website
  for that I can view all product and add to in cart

  @sanity
  Scenario: Verify user should navigate to computer page successfully
    Given I am on the home page
    When I click on the COMPUTERS tab
    Then I should see the text Computer

  @smoke
  Scenario: Verify user should navigate to desktops page successfully
    Given I am on the home page
    When  I click on the COMPUTERS tab
    And I click on the Desktops link
    Then I should see the text Desktops

  Scenario Outline: Verify that user should build their own computer and add it to the cart successfully
    Given I am on the home page
    When I click on the COMPUTERS tab
    And I click on the Desktops link
    And I click on the product name Build your own computer
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on ADD TO CART button
    Then I should see the message The product has been added to your shopping cart

    Examples:
      | processor                                      | ram           | hdd    | os                  | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200          | 2 GB          | 320 GB | Windows 7 [+50.00]  | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+15.00] | 4GB [+$20.00] | 400 GB | Windows 10 [+60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+15.00] | 8GB [+$60.00] | 320 GB | Ubuntu              | Total Commander [+$5.00]   |
