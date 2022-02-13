Feature: Creating, checking, deleting a private repository

  Scenario: Creating a private repository
    Given User is authorized
    When Post private repo with name "blog"
    Then Response code is 201

  Scenario: Accessing private repo
    Given User is authorized
    When Get request for private repo "blog" is performed
    Then Response code is 200

  Scenario: Failing to access private repo
    Given User is not authorized
    When Get request for private repo "blog" is performed
    Then Response code is 404
    
  Scenario: Deleting private repo
    Given User is authorized
    When Deleting private repo
    Then Response code is 204
