@E2e @Regression
Feature: e2e make order tests

  @makeOrder
  Scenario Outline: e2e make order test
    Given user is opened "<web-site-url>" Website
    And pass the pop-up
    When user type "<search-text>" in search input
    And click search button
    And go "<index>". page
    Then assert on "<index>". page
    And click a product image
    Then get product price information
    When click add to basket
    And go to cart
    Then assert product price
    When increase count to "<count>"
    Then assert product count "<count>"
    When delete product from cart
    Then assert cart is empty with "<empty-message>" message

    Examples:
      | search-text | index | count | web-site-url                  | empty-message                     |
      | bilgisayar  | 2     | 2     | https://www.gittigidiyor.com/ | Sepetinizde ürün bulunmamaktadır. |