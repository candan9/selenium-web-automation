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
    When click a product
    And select "<size>" size
    And click add to basket
    And go to cart
    Then user verifies  product information that price,product code,"<color>","<count>","<size>" , is correct on cart
    When go to payment phase
    Then user should see payment screen
    Examples:
      | search-text | index | password     | my-account | category-name | branch | color | size | count | web-site-url                  |
      | bilgisayar  | 2     | Ee1234012400!| Hesabım    | KADIN         | Bluz   | Siyah | M    | 1     | https://www.gittigidiyor.com/ |