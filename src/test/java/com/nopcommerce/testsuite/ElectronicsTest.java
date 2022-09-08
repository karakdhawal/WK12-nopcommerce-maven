package com.nopcommerce.testsuite;

import com.nopcommerce.pages.ELectronicPage;
import com.nopcommerce.testbase.TestBase;
import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {

    ELectronicPage eLectronicPage = new ELectronicPage();

    @Test
    public void verifyCellPhones (){
        eLectronicPage.mouseHoverOnElectronicsTab();
        eLectronicPage.mouseHoverOnCellPhonesAndClick();
        eLectronicPage.verifyTheTextCellPhones();
    }
    @Test
    public void verifyThatProductAddedSuccessfullyAndPlaceOrderSuccessfully () throws InterruptedException {
        eLectronicPage.mouseHoverOnElectronicsTab();
        eLectronicPage.mouseHoverOnCellPhonesAndClick();
        eLectronicPage.verifyTheTextCellPhones();
        eLectronicPage.clickOnProductNameNokiaLumia1020();
        eLectronicPage.verifyThePrice349();
        eLectronicPage.changeQtyTo2();
        Thread.sleep(1000);
        eLectronicPage.clickOnAddToCartTab();
        Thread.sleep(1000);
        eLectronicPage.verifyTheMsgTheProductHasBeenAddedToYourShoppingCartOnTapGreen();
        Thread.sleep(1000);
        eLectronicPage.closeTheBarClickingOnTheCrossButton();
        Thread.sleep(1000);
        eLectronicPage.mouseHoverOnShoppingCartAndClickOnGoToCartButton();
        Thread.sleep(1000);
        eLectronicPage.verifyTheMsgShoppingCart();
        Thread.sleep(1000);
        eLectronicPage.verifyTheQtyIs2();
        Thread.sleep(1000);
        eLectronicPage.verifyTheTotal698();
        Thread.sleep(1000);
        eLectronicPage.clickOnCheckBoxIAgreeWithTheTermsOfService();
        Thread.sleep(1000);
        eLectronicPage.clickOnChechOut();
        Thread.sleep(1000);
        eLectronicPage.verifyTheTextWelcomePlsSignIn();
        Thread.sleep(1000);
        eLectronicPage.clickOnRegisterTab();
        Thread.sleep(1000);
        eLectronicPage.verifyTheTextRegister();
        Thread.sleep(1000);
        eLectronicPage.fillTheMandatoryFields();
        Thread.sleep(1000);
        //2.21 Click on “REGISTER” Button
        eLectronicPage.clickOnRegisterButton();
        Thread.sleep(1000);
        eLectronicPage.verifyTheMsgYourRegCompleted();
        Thread.sleep(1000);
        eLectronicPage.clickOnContinueTab();
        Thread.sleep(1000);
        eLectronicPage.verifyTheTextShoppingCart();
        Thread.sleep(1000);
        eLectronicPage.clickOncheckBoxIAgreeWithTOS225();
        //2.25 click on checkbox “I agree with the terms of service”
        Thread.sleep(1000);
        eLectronicPage.clickOnCheckOut226();
        Thread.sleep(1000);
        eLectronicPage.fillTheMandatoryFields227();
        Thread.sleep(1000);
        eLectronicPage.clickOnContinue228();
        Thread.sleep(1000);
        eLectronicPage.clickOnRadioButton2DayAir();
        Thread.sleep(1000);
        eLectronicPage.clickOnContinue230();
        Thread.sleep(1000);
        eLectronicPage.selectRadioButtonCreditCard();
        Thread.sleep(1000);
        eLectronicPage.selectVisaFromSelectCreditCardOp();
        Thread.sleep(1000);
        eLectronicPage.fillAllTheDetails233();
        Thread.sleep(1000);
        eLectronicPage.clickOnContinueCheckOut234();
        Thread.sleep(1000);
        eLectronicPage.verifyPaymentMethodIsCreditCard();
        Thread.sleep(1000);
        eLectronicPage.verifyShippingMethoIs2ndDayAir();
        Thread.sleep(1000);
        eLectronicPage.verifyTotalis698at237();
        Thread.sleep(1000);
        eLectronicPage.clickOnConfirm();
        Thread.sleep(1000);
        eLectronicPage.verifyTheTextThankYou();
        Thread.sleep(1000);
        eLectronicPage.verifyTheMsgYourOrderHasBeenSuccessfullyProcessed();
        Thread.sleep(1000);
        eLectronicPage.clickOnContinue241();
        Thread.sleep(1000);
        eLectronicPage.verifyTheTextWelcomeToOurStore();
        Thread.sleep(1000);
        eLectronicPage.clickOnLogOutLink();
        Thread.sleep(1000);
        eLectronicPage.verifyTheURL();
    }

}
