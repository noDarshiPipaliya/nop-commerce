package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.loginlink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getwelcometext();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        homePage.loginlink();
        loginPage.emailfield("prime123@gmail.com");
        loginPage.passeordfield("prime123");
        loginPage.loginbuttonfield();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.errorMessagefield();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");
    }
}
