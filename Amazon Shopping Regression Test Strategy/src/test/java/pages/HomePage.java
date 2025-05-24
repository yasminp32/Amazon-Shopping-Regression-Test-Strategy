package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By searchBox = By.id("twotabsearchtextbox");
    By searchBtn = By.id("nav-search-submit-button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForProduct(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
        driver.findElement(searchBtn).click();
    }
}