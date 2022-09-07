package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void verifyComputerNavigation (){
        homePage.selectMenu("Computers");
        homePage.verifyComputerText();
    }
    @Test
    public void verifyElectronicsNavigation (){
        homePage.selectMenu("Electronics");
        homePage.verifyElectronicsText();
    }
    @Test
    public void verifyApparelNavigation (){
        homePage.selectMenu("Apparel");
        homePage.verifyApparelText();
    }
    @Test
    public void verifyDigitalDownloadsNavigation () {
        homePage.selectMenu("Digital Downloads");
        homePage.verifyDigitalDownloadsText();
    }
    @Test
    public void verifyBooksNavigations (){
        homePage.selectMenu("Books");
        homePage.verifyBooksText();
    }
    @Test
    public void verifyJewelryNavigaiton (){
        homePage.selectMenu("Jewelry");
        homePage.verifyJewelryText();
    }
    @Test
    public void verifyGiftCardsNavigation (){
        homePage.selectMenu("Gift Cards");
        homePage.verifyGiftCardsText();
    }

}
