package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

//    By loginLink = By.linkText("Log in");
//
//    By registerLink = By.linkText("Register");

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement LoginLink;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement RegisterLink;

    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement DisplayLogo;

    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
    WebElement MyAccount;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement Computers;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement Eletronics;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
    WebElement Apparel;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
    WebElement Digitaldownloads;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement Books;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
    WebElement Jewelry;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement GiftCards;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement signout;


    public void loginlink() {
        clickOnElement(LoginLink);
    }

    public void clickOnRegisterLinklink() {
        clickOnElement(RegisterLink);
    }

    public void displaylogo() {
        clickOnElement(DisplayLogo);
    }

    public void clickmyaccountLink() {
        clickOnElement(MyAccount);
    }

    public void clickcomputeronlink(){
        clickOnElement(Computers);
    }
    public void clickoneletronicslink(){
        clickOnElement(Eletronics);
    }
    public void clickonapparellink(){
        clickOnElement(Apparel);
    }
    public void clickondigitaldowmloadslink(){
        clickOnElement(Digitaldownloads);
    }
    public void clickonbookslink(){
        clickOnElement(Books);
    }
    public void clickonjewelrylink(){
        clickOnElement(Jewelry);
    }
    public void clickongiftcardslink(){
        clickOnElement(GiftCards);
    }

    public void clickonsignoutlink(){
        clickOnElement(signout);
    }

}
