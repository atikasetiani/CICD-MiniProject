Feature: Register

  Scenario: As user i have be able to success register
    Given I am on the login page
    When I click icon register
    Then I am on the register page
    And I enter valid full name
    And I enter valid email in register
    And I enter valid password in register
    And I click register button
    Then I am success to register and switch on the login page