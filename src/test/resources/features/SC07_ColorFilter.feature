@SmokeTesting
Feature: Filter with color

  Background: user navigate to homepage

    Given open home page again
    And user navigates to home page

  Scenario: Logged user could filter with color

    When user selects category like Apparel >shoes

    When user selects color filter like >red

    Then user can see red shoes only