@activity5
Feature: Data driven test with example
@loginTest
  Scenario: Successful login
    Given the user is on the login page
    When the user enters "<username>" and "<password>"
    And clicks the submit button
    Then verify error message as "Invalid credentials"
    
    Examples:
    |username |password  |
    |Weonadmin|Password  |
    |Admin    |Password!@|
    |&*^%$%   |Password  |