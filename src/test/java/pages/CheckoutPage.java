package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    By checkoutBtn = By.id("checkout");
    By confirmOrderBtn = By.id("confirm");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkout() {
        driver.findElement(checkoutBtn).click();
        driver.findElement(confirmOrderBtn).click();
    }
}

