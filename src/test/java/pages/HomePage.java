package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By product = By.xpath("//a[text()='Add to cart']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart() {
        driver.findElement(product).click();
    }
}

