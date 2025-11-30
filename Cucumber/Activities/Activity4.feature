@activity4
Feature: Activity to test the login feature
@loginTest
  Scenario: Successful login
    Given the user is on the login page
    When the user enters "admin" and "password"
    And clicks the submit button
    Then verify message as "Welcome Back, Admin!"