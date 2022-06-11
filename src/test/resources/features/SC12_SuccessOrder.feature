@SmokeTesting
Feature: Add products to wishlist

  Background: user navigate to homepage

    Given open home page again
    And user navigates to home page

  Scenario: user adds a product to cart and purchases it

    Given user adds product to cart

    When user click on shopping cart
    And user click on agree with terms of service
    And user click on checkout

    Then continue on same address, shipping method, payment info
    And confirm order
    And confirm order msg
