package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void verifyCheckoutFlow() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "testpass");

        HomePage homePage = new HomePage(driver);
        homePage.addProductToCart();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.checkout();
    }
}

