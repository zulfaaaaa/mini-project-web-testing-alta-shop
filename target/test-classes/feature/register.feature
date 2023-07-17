Feature: As a user i have be able to success register so that i can login

  @Register
  Scenario: as user i want to input valid to then i can see success register
    Given user on login page for register
    When user click button register
    And user input valid full name for register
    And user input valid email for register
    And user input valid password for register
    And user click register button
    Then user on login page succes register

    @RegisterInvalidFormatEmail
  Scenario: as user i want to input invalid format email
    Given user on login page for register invalid format email
    When user click button for register invalid format email
    And user input valid full name for register invalid format email
    And user input invalid format email
    And user input valid password for register invalid format email
    And user click register button for register invalid format email
    Then user on login page succes register invalid format email

  @RegisterNameNumeric
  Scenario: as user i want to input invalid format name (numeric)
    Given user on login page for register invalid format name
    When user click button for register invalid format name
    And user input invalid format full name
    And user input valid email for register invalid format name
    And user input valid password for register invalid format name
    And user click register button for register invalid format name
    Then user on login page succes register invalid format name

  @RegisterSameEmail
  Scenario: as user i want to input same email
    Given user on login page for register same email
    When user click button for register same email
    And user input valid full name for register same email
    And user input same email
    And user input valid password for register same email
    And user click register button for register same email
    Then user should see an error message

  @RegisterBlankName
  Scenario: as user i want to input blank name
    Given user on login page for register blank name
    When user click button for register blank name
    And user input blank name for register
    And user input valid email for register blank name
    And user input valid password for register blank name
    And user click register button for register blank name
    Then user on login page fail register blank name

  @RegisterBlankEmail
  Scenario: as user i want to input blank email
    Given user on login page for register blank email
    When user click button for register blank email
    And user input valid full name for register blank email
    And user input blank email for register
    And user input valid password for register blank email
    And user click register button for register blank email
    Then user on login page fail register blank email

  @RegisterBlankPassword
  Scenario: as user i want to input blank password
    Given user on login page for register blank password
    When user click button for register blank password
    And user input valid full name for register blank password
    And user input valid email for register blank password
    And user input blank password for register
    And user click register button for register blank password
    Then user on login page succes register blank password

  @RegisterBlankData
  Scenario: as user i want to input blank data
    Given user on login page for register blank data
    When user click button for register blank data
    And user input blank name for register blank data
    And user input blank email for register blank data
    And user input blank password for register blank data
    And user click register button for register blank data
    Then user on login page succes register blank data