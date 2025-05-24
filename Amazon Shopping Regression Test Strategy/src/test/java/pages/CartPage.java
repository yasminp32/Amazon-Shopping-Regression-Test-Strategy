package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By cartBtn = By.id("nav-cart");
    By cartItem = By.cssSelector(".sc-list-item-content");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductInCart() {
        driver.findElement(cartBtn).click();
        return driver.findElements(cartItem).size() > 0;
    }
}