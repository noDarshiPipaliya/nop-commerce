package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {

    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement BuildyourOwnComputer;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement ProcessorDropDown;

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement RamdropDown;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement HDDradios;

    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement osradio;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwarecheckboxes;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement AddToCardbutton;

    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement Message;

    public void clickbuildyourowncomputer() {
        clickOnElement(BuildyourOwnComputer);

    }

    public void clickprocessorlink() {
        clickOnElement(ProcessorDropDown);
        selectByValueFromDropDown(ProcessorDropDown, "2");

    }

    public void clickramlink() {
        clickOnElement(RamdropDown);
        selectByValueFromDropDown(RamdropDown, "5");

    }

    public void clickHDDlink() {
        clickOnElement(HDDradios);

    }

    public void clickoslink() {
        clickOnElement(osradio);
    }

    public void clicksoftwarelink() {
        clickOnElement(softwarecheckboxes);
    }

    public void clickaddtocartbuttonlink() {
        clickOnElement(AddToCardbutton);

    }


}
