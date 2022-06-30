package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;
import util.FileProccess;

import java.io.IOException;

public class CartPage {

    By price_product = By.cssSelector(".total-price > strong");
    By select_amount = By.cssSelector(".gg-input-select>select");
    By btn_delete_product = By.className("btn-delete");
    By section_empty_cart = By.cssSelector(".empty-cart-info>div>h2");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Actions action;
    FileProccess fp;

    public CartPage(WebDriver driver) throws IOException {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
        this.action = new Actions(driver);
        this.fp = new FileProccess();
    }

    public void checkProductPrice( ) throws IOException {
        Assert.assertEquals(elementHelper.getText(price_product),fp.readText());
    }

    public void increaseCount(String count) {
        elementHelper.selectValueOption(select_amount,count);
    }

    public void checkProductCount(String count) {
        elementHelper.checkAttribute(select_amount,"value",count);
    }

    public void deleteProductFromCart( ) {
        elementHelper.click(btn_delete_product);
    }

    public void assertCartEmpty(String emptyMessage) {
        elementHelper.checkElementWithText(section_empty_cart,emptyMessage);
    }
}
