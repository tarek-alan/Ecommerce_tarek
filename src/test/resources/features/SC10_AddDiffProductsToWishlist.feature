@SmokeTesting
Feature: Add products to wishlist

  Background: user navigate to homepage

    Given open home page again
     And user navigates to home page

  Scenario: user could add products to wishlist

    Given user scroll down to products

    When user click on add to wishlist
      And user select attributes for product if found

    Then go back to home and choose another product
      And user should found the product added to wishlist in the wishlist
