Feature: Gorest users

  @Test2
  Scenario: Get all users
    When all users are requested
    Then status code 200 is returned
    And 20 users are returned


  Scenario: Create user
    When the following users is created
      | name | email          | gender | status |
      | Baha | baha@gmail.com | male   | active |
    Then a status code 201 is returned
    And The following user is returned
      | name | email          | gender | status |
      | Baha | baha@gmail.com | male   | active |