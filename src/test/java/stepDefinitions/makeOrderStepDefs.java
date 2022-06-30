package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import util.DriverFactory;

import java.io.IOException;

public class makeOrderStepDefs {

    SearchPage searchPage = new SearchPage(DriverFactory.getDriver());
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    ProductPage productPage = new ProductPage(DriverFactory.getDriver());
    CartPage cartPage = new CartPage(DriverFactory.getDriver());

    public makeOrderStepDefs() throws IOException {
    }


    @Then("should see {string} title next")
    public void shouldSeeTitleNext(String title) {
    }

    @Given("user is opened gittigidiyor Website")
    public void userIsOpenedGittigidiyorWebsite() {
        
    }

    @And("pass the pop-up")
    public void passThePopUp() {
        homePage.passPopup();
    }

    @Given("user is opened {string} Website")
    public void userIsOpenedWebsite(String siteUrl) {
        homePage.assertUrl(siteUrl);
    }

    @When("user type {string} in search input")
    public void userTypeInSearchInput(String searchText) {
        homePage.typeSearchText(searchText);
    }

    @And("click search button")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }

    @And("go {string}. page")
    public void goPage(String index) {
        searchPage.goPageWithIndex(index);
    }

    @Then("assert on {string}. page")
    public void assertOnPage(String index) {
        searchPage.assertOnPage(index);
    }

    @And("click a product image")
    public void clickAProductImage() {
        searchPage.clickAProduct();
    }

    @Then("get product price information")
    public void getProductPriceInformation() throws IOException {
        productPage.getPrice();
    }

    @When("click add to basket")
    public void clickAddToBasket() {
        homePage.acceptCookies();
        productPage.clickAddToBasket();
    }

    @And("go to cart")
    public void goToCart() {
        homePage.goToCart();
    }

    @Then("assert product price")
    public void assertProductPrice() throws IOException {
        cartPage.checkProductPrice();
    }

    @When("increase count to {string}")
    public void increaseCountTo(String count) {
        cartPage.increaseCount(count);
    }

    @Then("assert product count {string}")
    public void assertProductCount(String count) {
        cartPage.checkProductCount(count);
    }

    @When("delete product from cart")
    public void deleteProductFromCart() {
        cartPage.deleteProductFromCart();
    }

    @Then("assert cart is empty with {string} message")
    public void assertCartIsEmptyWithMessage(String emptyMessage) {
        cartPage.assertCartEmpty(emptyMessage);
    }
}
