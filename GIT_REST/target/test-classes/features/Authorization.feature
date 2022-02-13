Feature: Authorization

  Scenario: Successful authorization
    Given User is authorized
    When Get request for user private page is performed
    Then Response code is 200
    And Entered as "TestUserNotRealPerson"

