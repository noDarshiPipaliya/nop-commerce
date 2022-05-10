package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement Computers;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement Desktops;

    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement Sortby;

    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement Display;


    public void clickcomputeronlink(){
        clickOnElement(Computers);
    }
    public void clickdesktoponlink(){
        clickOnElement(Desktops);
    }
    public void clicksortbylink(){
        clickOnElement(Sortby);
        selectByValueFromDropDown(Sortby,"10");
    }
    public void clickdisplaylink(){
        clickOnElement(Display);
        selectByValueFromDropDown(Display,"6");
    }
}
