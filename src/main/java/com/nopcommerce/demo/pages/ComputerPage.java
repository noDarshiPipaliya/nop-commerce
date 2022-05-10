package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement Computers;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement Desktops;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement Notebooks;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    WebElement Software;


    public void clickcomputeronlink(){
        clickOnElement(Computers);
    }
    public void clickdesktoponlink(){
        clickOnElement(Desktops);
    }
    public void clicknotebookslink(){
        clickOnElement(Notebooks);
    }
    public void clicksoftwarelink(){
        clickOnElement(Software);
    }





}
