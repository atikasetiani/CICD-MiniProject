Feature: login
  As a user
  I want to see my home page
  So that I can see the various products that exist

  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter valid email
    And I enter valid password
    And I click login button
    Then I am on the product page

  Scenario: As user i haven't be able to login when using invalid email
    Given I am on the login page
    When I enter invalid email
    And I enter valid password
    And I click login button
    Then I can't be on the product page

  Scenario: As user i haven't be able to login when using invalid password
    Given I am on the login page
    When I enter valid email
    And I enter invalid password
    And I click login button
    Then I can't be on the product page

  Scenario: As user i haven't be able to login when using invalid email and invalid password
    Given I am on the login page
    When I enter invalid email
    And I enter invalid password
    And I click login button
    Then I can't be on the product page

  Scenario: As user i haven't be able to login when using empty email
    Given I am on the login page
    When I enter empty email
    And I enter valid password
    And I click login button
    Then I can't be on the product page

  Scenario: As user i haven't be able to login when using empty password
    Given I am on the login page
    When I enter valid email
    And I enter empty password
    And I click login button
    Then I can't be on the product page

  Scenario: As user i haven't be able to login when using empty email and empty password
    Given I am on the login page
    When I enter empty email
    And I enter empty password
    And I click login button
    Then I can't be on the product page

