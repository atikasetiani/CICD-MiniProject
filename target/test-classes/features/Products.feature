Feature: Products

  Scenario: As user i have be able to success see product details
    Given I am on the login page
    When I enter valid email
    And I enter valid password
    And I click login button
    Then I am on the product page
    And I click detail button from one of product
    Then I see product details

  Scenario: As user i have be able to success adding purchase product
    Given I am on the login page
    When I enter valid email
    And I enter valid password
    And I click login button
    Then I am on the product page
    And I click buy button from one of product
    Then I success to add purchase product in the cart

  Scenario: As user i have be able to success adding two purchase product
    Given I am on the login page
    When I enter valid email
    And I enter valid password
    And I click login button
    Then I am on the product page
    And I click buy button from one of product
    And I click buy button from one of the other products
    Then I success to add purchase product in the cart