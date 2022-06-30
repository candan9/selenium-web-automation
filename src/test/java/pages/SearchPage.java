package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class SearchPage {
    String searchUrl= "https://www.gittigidiyor.com/arama?k=bilgisayar&sf=";
    By btn_pagination = By.xpath("//li[@data-testid='pagination-list-item']/a/span");
    By img_product = By.xpath("//img[@data-testid='productImage']");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Actions action;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
        this.action = new Actions(driver);
    }

    public void goPageWithIndex(String index) {
        elementHelper.checkElementWithText(btn_pagination,index);
        elementHelper.clickElementWithText(btn_pagination,index);
    }

    public void assertOnPage(String index) {
        elementHelper.assertUrl(searchUrl+index);
    }

    public void clickAProduct() {
        elementHelper.findElementRandom(img_product).click();
    }
}
