Feature: Login Page

  Scenario: Valid login

    Given the user is on the login page
    When the user enters a valid username and password
    And the user clicks the login button
    Then the user should be logged in successfully


  Scenario: Invalid login

    Given the user is on the login page
    When the user enters an invalid username or password
    And the user clicks the login button
    Then the user should see an error message and remain on the login page
