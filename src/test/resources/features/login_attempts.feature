@regression #Scenarios that are part of the "regression test" suite
  #Regression tests are a set of tests that ensure new changes haven’t
  # broken existing functionality
Feature: Login Attempts

  @smoke #Scenarios that are part of the "smoke test" suite
    #Smoke tests are a small set of critical tests that quickly check if
      # the most important functions of your application work

  Scenario Outline: Invalid login attempts

    Given the user is on the login page
    When the user enters <username> and <password>
    Then the system should display a login error message

    Examples:
      | username  | password   |
      | invalid1  | wrongPass  |
      | validUser | wrongPass  |
      | invalid2  | correctPass|