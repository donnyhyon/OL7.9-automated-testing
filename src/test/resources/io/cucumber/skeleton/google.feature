Feature: I goto google homepage

  Scenario: I can land on the google homepage
    Given I am on a chrome browser
    When I get google
    Then I should see google title
