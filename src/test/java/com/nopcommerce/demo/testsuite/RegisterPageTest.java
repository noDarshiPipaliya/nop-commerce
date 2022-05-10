package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    RegisterPage registerPage;

    public void init(){
        registerPage = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        registerPage.clickregistertextlink();

    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        registerPage.clickregistertextlink();
        registerPage.clickradiobuttontlink();
        registerPage.clickfirstnamelink();
        registerPage.clicklastnamelink();
        registerPage.clickemaillink();
        registerPage.clickpasswordlink();
        registerPage.clickconfirmpasswordlink();

    }

    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        registerPage.clickregistertextlink();
        registerPage.clickradiobuttontlink();
        registerPage.clickfirstnamelink();
        registerPage.clicklastnamelink();
        registerPage.clickemaillink();
        registerPage.clickpasswordlink();
        registerPage.clickconfirmpasswordlink();
        registerPage.clickdateofbirthlink();
        registerPage.clickmontheofbirthlink();
        registerPage.clickyearofbirthlink();
        registerPage.clickregisterbuttonlink();
        registerPage.registrationcompleted();
    }



}
