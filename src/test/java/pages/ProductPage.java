package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import util.FileProccess;

import java.io.IOException;

public class ProductPage {

    By price_product = By.id("sp-price-highPrice");
    By btn_add_to_cart = By.id("add-to-basket");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Actions action;
    FileProccess fp;

    public ProductPage(WebDriver driver) throws IOException {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
        this.action = new Actions(driver);
        this.fp = new FileProccess();
    }

    public void getPrice() throws IOException {
        fp.writeText(elementHelper.getText(price_product));
    }

    public void clickAddToBasket(){
        elementHelper.click(btn_add_to_cart);
    }
}