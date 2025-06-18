#Feature: Login Page
#
#   Scenario Outline: Login with invalid credential
#
#     When the user enters "<username>" or "<password>"
#     And the user clicks the login button
#     Then the user should see an error message and remain on the login page
#
#     Examples:
#     | user name | password |
#     | bruna     | 1234     |
#     | april     | 4321     |
#     | chay      | 1254     |