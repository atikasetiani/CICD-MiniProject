Feature: Transactions

  Scenario: As user i can view detail transactions of two products that have been purchased in the cart
    Given I am on the login page
    When I enter valid email
    And I enter valid password
    And I click login button
    Then I am on the product page
    And I click buy button from one of product
    And I click buy button from one of the other products
    Then I success to add purchase product in the cart
    And I click cart icon
    And I click payment button
    Then I see the details of a product purchase transaction in the cart