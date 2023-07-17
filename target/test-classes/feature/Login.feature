Feature: As a user i have be able to success login so that i can see products page

  @login
  Scenario: User login with valid credentials
    Given the user is on the login page
    When user clicks on Sign button
    And user enters valid email
    And user enters valid password
    And they click the Login button
    Then they should be redirected to the home page

  @LoginInvalidEmail
  Scenario: as user i want to login with input invalid email
    Given user on login page for login invalid email
    When user input invalid email
    And user input valid password for login invalid email
    And user click login button for login invalid email
    Then user on login page and see error message record not found

  @LoginInvalidPassword
  Scenario: as user i want to login with input invalid password
    Given user on login page for login invalid password
    When user input valid email for login invalid password
    And user input invalid password
    And user click login button for login invalid password
    Then user on login page and user see error message record not found

  @LoginBlankEmail
  Scenario: as user i want to login with blank email
    Given user on login page for login blank email
    When user input valid email for login blank email
    And user input valid password for login blank email
    And user click login button for login blank email
    Then user on login page and user see error message blank email

  @LoginBlankPassword
  Scenario: as user i want to login with blank password
    Given user on login page for login blank password
    When user input valid email for login blank password
    And user input valid password for login blank password
    And user click login button for login blank password
    Then user on login page and user see error message blank password

  @LoginBlankData
  Scenario: as user i want to login with blank data
    Given user on login page for login blank data
    When user input valid email for login blank data
    And user input valid password for login blank data
    And user click login button for login blank data
    Then user on login page and user see error message blank data