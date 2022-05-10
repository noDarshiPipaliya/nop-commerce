package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

   public String getwelcometext(){
       clickOnElement(welcomeText);
       return null;
   }
    public void emailfield(String s){
       clickOnElement(emailField);
    }

    public void passeordfield(String prime123){
       clickOnElement(passwordField);
    }

    public void loginbuttonfield(){
        clickOnElement(loginButton);
    }

    public String errorMessagefield(){
        clickOnElement(errorMessage);
        return null;
    }


}
