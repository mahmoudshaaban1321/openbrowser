Feature: User login to automation web

  @smo
  Scenario: user can not login with invalid data
    Given user navigate to automation web
    When user click on signup Login button
    And user Enter email address "abdllah@gmail.com"
    And user Enter Password "111111111111111111"
    And user Enter click login button
    Then web will show error message

  @smo
Scenario Outline: Invalid Login

    Given user navigate to automation web
    When user click on signup Login button
    And user Enter email address "<user>"
    And user Enter Password "<password>"
    And user Enter click login button
    Then web will show error "<message>"

  Examples:

  | user                 |  password         | message   |
  | abdllah@gmail.com    |  2255555555       |           |
  | Mahmoud@gmail.com    |  555555555        |           |
  | Ali@gmail.com        |  111111111        |           |
  | abdllah@gmail.com    |  561612256        |           |
  |                      |                   |           |