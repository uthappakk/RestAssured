
Feature: Check the api for foreign exchange
  
  Scenario: To validate response for given API
    Given API for foreign Exchange
    When posted with correct information
    Then validate positive response code recieved
