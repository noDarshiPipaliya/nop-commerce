package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {

    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage ownComputerPage;

    public void init(){
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        ownComputerPage = new BuildYourOwnComputerPage();
    }


    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        computerPage.clickcomputeronlink();
    }
@Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        computerPage.clickcomputeronlink();
        desktopsPage.clickdesktoponlink();

}
@Test
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,String hdd, String os, String software){
    computerPage.clickcomputeronlink();
    desktopsPage.clickdesktoponlink();
    ownComputerPage.clickbuildyourowncomputer();
    ownComputerPage.clickprocessorlink();
    ownComputerPage.clickramlink();
    ownComputerPage.clickHDDlink();
    ownComputerPage.clickoslink();
    ownComputerPage.clicksoftwarelink();
    ownComputerPage.clickaddtocartbuttonlink();

}




}
