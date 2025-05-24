package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    WebDriver driver;
    By firstResult = By.cssSelector("div.s-main-slot div[data-index='1'] h2 a");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstResult() {
        driver.findElement(firstResult).click();
    }
}