Feature: Successful Registration

  Scenario: Successful user registration

    Given the user is on the registration page
    When the user enters the information below:
      | name     | email             | password  |
      | Bruna    | bruna@test.com    | 12345     |
    And the user submits the registration form
    Then the system should display a registration success message
    And the user should be redirected to the welcome page