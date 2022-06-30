package pages;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import util.ElementHelper;

public class HomePage {

    By modal_intro_popup_close= By.className("wis_clsbtn");
    By input_search = By.xpath("//input[@data-cy='header-search-input']");
    By btn_search = By.xpath("//input[@data-cy='search-find-button']");
    By btn_basket = By.className("basket-title");
    WebDriver driver;
    ElementHelper elementHelper;
    Actions action;
    FluentWait wait ;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new FluentWait(driver);
        this.elementHelper = new ElementHelper(driver);
        this.action = new Actions(driver);
    }

    public void assertUrl(String siteUrl ){
        elementHelper.assertUrl(siteUrl);
    }

    public void passPopup(){
        if(elementHelper.exist(modal_intro_popup_close)){
            elementHelper.click(modal_intro_popup_close);
        }
    }

    public void typeSearchText(String searchText) {
        elementHelper.sendKey(input_search,searchText);
    }

    public void clickSearchButton() {
        elementHelper.click(btn_search);
    }

    public void goToCart() {
        elementHelper.click(btn_basket);
    }
}
