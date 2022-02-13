Feature: Search

  Scenario: Searching repos in java sorted by descending
    Given User is not authorized
    When Search data is retrieved
    Then Repository URLs end with their full names
    And Repositories are arranged in descending order