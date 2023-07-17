Feature: As a user I want to checkout products so i can see list product on checkout page

  @Checkout
  Scenario: User can checkout products on shopping cart
    Given user on homepage AltaShop for checkout
    When user click Buy on item to add to cart for checkout
    And user click shopping cart for checkout
    And user click button bayar
    Then user can see page transactions
