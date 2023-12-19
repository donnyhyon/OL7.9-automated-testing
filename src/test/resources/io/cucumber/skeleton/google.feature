Feature: I goto google homepage

  Scenario: I can land on the google homepage
    Given I am on a chrome browser
    When I go to "https://bonigarcia.dev/webdrivermanager/"
    Then I should see the title "WebDriverManager"
