
  Feature:As a user i have be able to success login so that i can see products page
@AddToCart
  Scenario: User can add product to cart
    Given user on homepage AltaShop
    When user click Buy on item to add to cart
    And user click shopping cart
    Then user can see the products added to the cart
