package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement RegisterText;

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement malefemaleradio;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement Firstname;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastname;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement DateofBirth;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement birthMonth;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement birthYear;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement Password;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement Confirmpassword;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement RegisterButton;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/span[2]")
    WebElement Firstnameisrequired;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement Lastnameisrequired;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement Passwordisrequired;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailisrequired;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement Yourregistrationcompleted;


    public void clickregistertextlink(){clickOnElement(RegisterText);}
    public void clickradiobuttontlink(){clickOnElement(malefemaleradio);}
    public void clickfirstnamelink(){clickOnElement(Firstname);}
    public void clicklastnamelink(){clickOnElement(lastname);}
    public void clickdateofbirthlink(){clickOnElement(DateofBirth);}
    public void clickmontheofbirthlink(){clickOnElement(birthMonth);}
    public void clickyearofbirthlink(){clickOnElement(birthYear);}
    public void clickemaillink(){clickOnElement(email);}
    public void clickpasswordlink(){clickOnElement(Password);}
    public void clickconfirmpasswordlink(){clickOnElement(Confirmpassword);}
    public void clickregisterbuttonlink(){clickOnElement(RegisterButton);}
    public void clickfirstnamerequiredlink(){clickOnElement(Firstnameisrequired);}
    public void clicklastnamerequiredlink(){clickOnElement(Lastnameisrequired);}
    public void clickpasswordrequiredlink(){clickOnElement(Passwordisrequired);}
    public void clickemailrequiredrequiredlink(){clickOnElement(emailisrequired);}
    public void registrationcompleted(){clickOnElement(Yourregistrationcompleted);}




}
