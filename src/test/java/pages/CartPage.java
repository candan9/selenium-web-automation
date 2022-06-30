package pages;

import enitities.Product;
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
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Actions action;
    FileProccess fp;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
        this.action = new Actions(driver);
        this.fp = new FileProccess();
    }

    public void checkProductPrice(Product product) throws IOException {
        Assert.assertEquals(elementHelper.getText(price_product),fp.readText());
    }
}
