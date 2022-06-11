@SmokeTesting
Feature: Add different products to cart

  Background: user navigate to homepage

    Given open home page again
    And user navigates to home page

  Scenario: user could add different products to Shopping cart

    When user selects category like electronics >camera >Leica >Add to cart

    And msg "The product has been added to your shopping cart"

    And user selects category like books >first prize pizza >Add to cart

    Then also msg "The product has been added to your shopping cart"