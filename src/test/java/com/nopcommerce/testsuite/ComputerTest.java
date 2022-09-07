package com.nopcommerce.testsuite;

import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.PaymentPage;
import com.nopcommerce.testbase.TestBase;
import javafx.scene.control.Tab;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    ComputerPage computerPage = new ComputerPage();
    PaymentPage paymentPage = new PaymentPage();

    @Test
    public void verifyTheProductDescedningOrder (){
        computerPage.clickOnComputerMenu();
        computerPage.clickOnDesktop();
        computerPage.selectSortByPositionNameZtoA();
        computerPage.verifyTheProductArrangeInDescendingOrder();
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessfully () throws InterruptedException {
        computerPage.clickOnComputerMenu();
        computerPage.clickOnDesktop();
        computerPage.selectSortByPositionAtoZ();
        Thread.sleep(1000);
        computerPage.clickOnAddToCart();
        Thread.sleep(1000);
        computerPage.verifyTextBuildYourOwnComputer();
        Thread.sleep(1000);
        computerPage.select22GHzIntelPentiumDualCore();
        Thread.sleep(1000);
        computerPage.select8GB$60();
        Thread.sleep(1000);
        computerPage.selectHDDRadio400GB();
        Thread.sleep(1000);
        computerPage.selectOSRadioVistaPremium();
        Thread.sleep(1000);
        computerPage.checkTwoBoxesMicrosoftAndTotalCommander();
        Thread.sleep(1000);
        //2.11 Verify the price "$1,475.00"
        computerPage.verifyThePrice$1475();
        Thread.sleep(1000);
        computerPage.clickOnAddToCartButton1475();
        Thread.sleep(1000);
        computerPage.verifyTheMsgTheProductHasBeenAddedToYourShoppingCart();
        Thread.sleep(1000);
        computerPage.closeTheBarByClickingOnTheCrossButton();
        Thread.sleep(1000);
        computerPage.mouseHoverOnShoppingCartAndClickOnGoToCartButton();
        Thread.sleep(1000);
        computerPage.verifyTheMessageShoppingCart();
        Thread.sleep(1000);
        computerPage.changeTheQtyTo2AndClickOnUpdateShoppingCart();
        Thread.sleep(1000);
        computerPage.verifyTheTotal2950();
        Thread.sleep(1000);
        computerPage.clickOnCheckBoxIAgreeWithTermOfService();
        Thread.sleep(1000);
        computerPage.clickOnCheckout();
        Thread.sleep(1000);
        computerPage.verifyTheTextWelcomPleaseSignIn();
        Thread.sleep(1000);
//        2.21Click on “CHECKOUT AS GUEST”Tab
        computerPage.clickOnCheckOutAsGuestTab();
        Thread.sleep(1000);
        computerPage.fillTheAllMandatoryField();
        Thread.sleep(1000);
        computerPage.clickOnContinueOnAfterPhoneNumber();
        Thread.sleep(1000);
        computerPage.clickOnRadioButtonNextDayAir();
        Thread.sleep(1000);
        computerPage.clickOnContinueAfterShipping();
        Thread.sleep(1000);
        computerPage.selectRadioButtonCreditCard();
        Thread.sleep(1000);
        computerPage.selectMasterCardFromDropDown();
        Thread.sleep(1000);
        computerPage.fillAllTheDetails();
        Thread.sleep(1000);
        computerPage.clickOnContinueAfterPaymentDetails();
        Thread.sleep(1000);
        computerPage.verifyPaymentMethodIsCreditCard();
        Thread.sleep(1000);
        computerPage.verifyShippinMethodIsNextDayAir();
        Thread.sleep(1000);
        computerPage.verifyTotalIs$2950final();
        Thread.sleep(1000);
        computerPage.clickOnConfirm();
        Thread.sleep(1000);
        computerPage.verifyTheTextThankYou();
        Thread.sleep(1000);
        computerPage.verifyTheMsgYourOrderHasBeenSuccessfullyProcessed();
        Thread.sleep(1000);
        computerPage.clickOnContinueFinal();
        Thread.sleep(1000);
        computerPage.verifyTheTextWelcomeToOurStore();
    }
}
