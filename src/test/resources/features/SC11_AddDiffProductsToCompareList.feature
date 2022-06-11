@SmokeTesting
Feature: Add products to wishlist

  Background: user navigate to homepage

    Given open home page again
    And user navigates to home page

  Scenario: user could add products to comparelist

    Given user scroll down to products

    When user click on add to comparelist

    Then go back to home and choose another productcompare
    And user should found the product added to comparelist in the comparelist
