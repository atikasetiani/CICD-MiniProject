Feature: Orders

  Scenario: As user i have be able to success see purchase details of a product in cart
    Given I am on the login page
    When I enter valid email
    And I enter valid password
    And I click login button
    Then I am on the product page
    And I click buy button from one of product
    Then I success to add purchase product in the cart
    And I click cart icon
    Then I see the purchase details of a product in cart

  Scenario: As user i have be able to success increasing the quantity product in cart
    Given I am on the login page
    When I enter valid email
    And I enter valid password
    And I click login button
    Then I am on the product page
    And I click buy button from one of product
    Then I success to add purchase product in the cart
    And I click cart icon
    Then I see the purchase details of a product in cart
    And I click plus icon
    And I clicked the plus icon one more time
    Then I was successful in increasing the quantity to three

  Scenario: As user i can view details of two products that have been purchased in the cart
    Given I am on the login page
    When I enter valid email
    And I enter valid password
    And I click login button
    Then I am on the product page
    And I click buy button from one of product
    And I click buy button from one of the other products
    Then I success to add purchase product in the cart
    And I click cart icon
    Then I see the purchase details of a product in cart