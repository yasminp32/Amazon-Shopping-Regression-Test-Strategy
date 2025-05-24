package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;

public class AmazonTest {
    WebDriver driver;
    HomePage home;
    SearchResultsPage results;
    ProductPage product;
    CartPage cart;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        home = new HomePage(driver);
        results = new SearchResultsPage(driver);
        product = new ProductPage(driver);
        cart = new CartPage(driver);
    }

    @Test
    public void testAddToCartFlow() {
        home.searchForProduct("wireless mouse");
        results.clickFirstResult();
        product.addToCart();
        Assert.assertTrue(cart.isProductInCart(), "Product was not added to cart.");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}