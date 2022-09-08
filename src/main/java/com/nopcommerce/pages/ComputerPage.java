package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

import java.util.Random;

public class ComputerPage extends Utility {

    By computerMenu = By.xpath("//ul[@class='top-menu notmobile']/li[1]");
    By desktop = By.xpath("//div[@class='item-grid']/div[1]/div[1]");
    By positionNameZtoA = By.xpath("//div[@class='product-selectors']/div[2]/select");
    By verifyDescendingOrder = By.xpath("//div[@class='product-selectors']/div[2]/select/option[3]");
    By positionNameAtoZ = By.xpath("//div[@class='product-selectors']/div[2]/select");
    By addToCart = By.xpath("//div[@class='products-container']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By verifyTextBuildYourOwnComp = By.xpath("//div[@class='product-essential']/div[2]/div[1]/h1");
    By select22GHzIntel = By.xpath("//select[@id='product_attribute_1']");
    By select8GB = By.xpath("//select[@id='product_attribute_2']");
    By selectHDDRadio400 = By.xpath("//input[@id='product_attribute_3_7']");
    By selectRadioVistaPremium = By.xpath("//input[@id='product_attribute_4_9']");
    By checkTotalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By verifyTheprice1475 = By.xpath("//span[@id='price-value-1']");
    By clickOnAddtoCart1475 = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyTheProductHasBeenAdded = By.xpath("//div[@class='bar-notification success']");
    By closeTheBar = By.xpath("//div[@class='bar-notification success']/span");
    By mouseHoverOnShopping = By.xpath("//span[@class='cart-label']");
    By clickOnGoToCart = By.xpath("//button[@class='button-1 cart-button']");
    By verifyTheMsgShoppingCart = By.xpath("//div[@class='page-title']");
    By clearQuantity = By.xpath("//div[@class='table-wrapper']/table[1]/tbody[1]/tr/td[5]/input");
    By changeQtyTo2 = By.xpath("//div[@class='table-wrapper']/table[1]/tbody[1]/tr/td[5]/input");
    By clickOnUpdateCart = By.xpath("//button[@id='updatecart']");
    By verifyTheTotal2950 = By.xpath("//span[@class='product-subtotal']");
    By clickOnCheckBoxTermsOfService = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckOut  = By.xpath("//button[@id='checkout']");
    By verifyTextWelcomePlsSignIn = By.xpath("//div[@class='page-title']");
//2.21Click on “CHECKOUT AS GUEST” Tab
    By clickOnCheckoutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickOnContinueAfterPhoneNumber = By.xpath("//div[@id='billing-buttons-container']/button[4]");
    By clickonNextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By clickOnContinueAfterShipping = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    By selectCreditCard = By.xpath("//input[@id='paymentmethod_1']");
    By selectCreditCardContinue = By.xpath("//div[@id='payment-method-buttons-container']/button[1]");
    By selectMasterCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode =By.xpath("//input[@id='CardCode']");
    By clickOncontinueAfterPaymentDetails = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By verifyPaymentMethod = By.xpath("//div[@class='payment-method-info']/ul[1]/li[1]/span[2]");
    By verifyShippingMethod = By.xpath("//div[@class='shipping-method-info']/ul[1]/li[1]/span[2]");
    By verifyTotal2950final = By.xpath("//div[@class='total-info']/table[1]/tbody[1]/tr[4]/td[2]/span[1]");
    By clickOnConfirm = By.xpath("//div[@id='confirm-order-buttons-container']/button");
    By verifyThankYou = By.xpath("//div[@class='page checkout-page order-completed-page']/div[1]/h1");
    //2.36 Verify the message “Your order has been successfully processed!”
    By verifyTheMsgYourOrderHasBeenSuccessful = By.xpath("//div[@class='page-body checkout-data']/div[1]/div[1]");
    By clickOnContinueFinal = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    By verifyTheTextWelcomeTo = By.xpath("//div[@class='topic-block']/div[1]/h2");


    public String verifyTheTextWelcomeToOurStore (){
        return getTextFromElement(verifyTheTextWelcomeTo);
    }

    public void clickOnContinueFinal (){
        clickOnElement(clickOnContinueFinal);
    }

    public String verifyTheMsgYourOrderHasBeenSuccessfullyProcessed (){
        return getTextFromElement(verifyTheMsgYourOrderHasBeenSuccessful);
    }

    public String verifyTheTextThankYou (){
        return getTextFromElement(verifyThankYou);
    }

    public void clickOnConfirm (){
        clickOnElement(clickOnConfirm);
    }

    public String verifyTotalIs$2950final (){
        return getTextFromElement(verifyTotal2950final);
    }

    public String verifyShippinMethodIsNextDayAir (){
        return getTextFromElement(verifyShippingMethod);
    }

    public String verifyPaymentMethodIsCreditCard (){
        return getTextFromElement(verifyPaymentMethod);
    }

    public void clickOnContinueAfterPaymentDetails (){
        clickOnElement(clickOncontinueAfterPaymentDetails);
    }

    public void fillAllTheDetails (){
        sendTextToElement(cardHolderName, "Lord uk");
        sendTextToElement(cardNumber, "5425233430109903");
        selectByValueFromDropDown(expiryMonth, "4");
        selectByValueFromDropDown(expiryYear, "2023");
        sendTextToElement(cardCode, "123");
    }

    public void selectMasterCardFromDropDown (){
        selectByValueFromDropDown(selectMasterCard, "MasterCard");
    }
    public void selectRadioButtonCreditCard (){
        clickOnElement(selectCreditCard);
        clickOnElement(selectCreditCardContinue);
    }

    public void clickOnContinueAfterShipping (){
        clickOnElement(clickOnContinueAfterShipping);
    }

    public void clickOnRadioButtonNextDayAir (){
        clickOnElement(clickonNextDayAir);
    }
    public void clickOnContinueOnAfterPhoneNumber (){
        clickOnElement(clickOnContinueAfterPhoneNumber);
    }
    public void fillTheAllMandatoryField (){
        sendTextToElement(firstName, "Lord");
        sendTextToElement(lastName, "uk");
        Random randomNum = new Random();
        int randomGenerator = randomNum.nextInt(100);
        sendTextToElement(email, "lorduk"+ randomGenerator+"@gmail.com");
        selectByValueFromDropDown(country, "233");
        sendTextToElement(city, "London");
        sendTextToElement(address, "Buckingham Palace");
        sendTextToElement(postCode, "SW1A 1AA");
        sendTextToElement(phoneNumber, "1234567890");
    }

    public void clickOnCheckOutAsGuestTab (){
        clickOnElement(clickOnCheckoutAsGuest);
    }

    //Step1
    public void clickOnComputerMenu (){
        clickOnElement(computerMenu);
    }
    public void clickOnDesktop (){
        clickOnElement(desktop);
    }
    public void selectSortByPositionNameZtoA () {
        selectByValueFromDropDown(positionNameZtoA, "6");
    }
    public String verifyTheProductArrangeInDescendingOrder (){
        return getTextFromElement(verifyDescendingOrder);
    }

    public void selectSortByPositionAtoZ (){
        selectByValueFromDropDown(positionNameAtoZ, "5");
    }
    public void clickOnAddToCart (){
        clickOnElement(addToCart);
    }
    public String verifyTextBuildYourOwnComputer (){
        return getTextFromElement(verifyTextBuildYourOwnComp);
    }
    public void select22GHzIntelPentiumDualCore (){
        selectByValueFromDropDown(select22GHzIntel, "1");
    }
    public void select8GB$60 (){
        selectByValueFromDropDown(select8GB, "5");
    }
    public void selectHDDRadio400GB (){
        clickOnElement(selectHDDRadio400);
    }
    public void selectOSRadioVistaPremium (){
        clickOnElement(selectRadioVistaPremium);
    }
    public void checkTwoBoxesMicrosoftAndTotalCommander (){
        clickOnElement(checkTotalCommander);
    }
    //2.11 Verify the price "$1,475.00"
    public String verifyThePrice$1475 (){
        return getTextFromElement(verifyTheprice1475);
    }
    public void clickOnAddToCartButton1475 (){
        clickOnElement(clickOnAddtoCart1475);
    }
    public String verifyTheMsgTheProductHasBeenAddedToYourShoppingCart (){
        return getTextFromElement(verifyTheProductHasBeenAdded);
    }
    public void closeTheBarByClickingOnTheCrossButton (){
        clickOnElement(closeTheBar);
    }
    public void mouseHoverOnShoppingCartAndClickOnGoToCartButton () throws InterruptedException {
       Thread.sleep(1000);
        mouseHoverToElement(mouseHoverOnShopping);
        Thread.sleep(1000);
        clickOnElement(clickOnGoToCart);

    }
    public String verifyTheMessageShoppingCart(){
        return getTextFromElement(verifyTheMsgShoppingCart);
    }
    public void changeTheQtyTo2AndClickOnUpdateShoppingCart () throws InterruptedException {
        driver.findElement(clearQuantity).clear();
        Thread.sleep(1000);
        sendTextToElement(changeQtyTo2,"2");
        clickOnElement(clickOnUpdateCart);
    }
    public String verifyTheTotal2950 (){
        return getTextFromElement(verifyTheTotal2950);
    }
    public void clickOnCheckBoxIAgreeWithTermOfService (){
        clickOnElement(clickOnCheckBoxTermsOfService);
    }
    public void clickOnCheckout (){
        clickOnElement(clickOnCheckOut);
    }
    public String verifyTheTextWelcomPleaseSignIn (){
        return getTextFromElement(verifyTextWelcomePlsSignIn);
    }
//2.21Click on “CHECKOUT AS GUEST” Tab


}
