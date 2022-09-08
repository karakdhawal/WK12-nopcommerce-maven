package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Random;

public class ELectronicPage extends Utility {

    By electronicsTab = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");

    By cellPhones = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/ul[1]/li[2]/a");

    By verifyCellPhones = By.xpath("//div[@class='page category-page']/div[1]/h1");
    By clickOnList = By.xpath("//div[@class='product-selectors']/div[1]/a[2]");
    By clickOnProductNameNokia = By.xpath("//div[@class='products-wrapper']/div[1]/div[1]/div[3]/div[1]/div[2]/h2/a");
    By verifyTheTextNokia = By.xpath("//div[@class='product-essential']/div[2]/div[1]/h1");
    By verifyThePrice349 = By.xpath("//div[@class='product-essential']/div[2]/div[6]/div[1]/span");
    By clearQty = By.xpath("//input[@id='product_enteredQuantity_20']");
    By changeQtyTo2 = By.xpath("//input[@id='product_enteredQuantity_20']");
    By clickOnAddToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By verifyTheMsgTheProductHasBeenAdded = By.xpath("//div[@class='bar-notification success']");
    By closeTheBar = By.xpath("//div[@class='bar-notification success']/span");
    //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By mouseHoverOnShoppingCart = By.xpath("//span[@class='cart-label']");
    By clickonGoToCart= By.xpath("//button[@class='button-1 cart-button']");
    By verifyTheMsgShoppingCart = By.xpath("//div[@class='page-title']/h1");
    By verifyTheQuantity2 = By.xpath("//div[@class='table-wrapper']/table[1]/tbody[1]/tr/td[5]/label");
    By verify698 = By.xpath("//span[@class='product-subtotal']");
    By clickOnCheckBoxIAgreeWithTheTermsOfService = By.xpath("//div[@class='totals']/div[3]/input");
    By clickOnCheckout = By.xpath("//button[@id='checkout']");
    By verifyTheTextWelcomePlsSignIn = By.xpath("//div[@class='page-title']/h1");
    By clickOnRegisterTab = By.xpath("//button[@class='button-1 register-button']");
    By verifyTheTextRegister = By.xpath("//div[@class='page-title']/h1");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By email = By.xpath("//input[@id='Email']");
    By passWord = By.xpath("//input[@id='Password']");
    By confirmPw = By.xpath("//input[@id='ConfirmPassword']");
//2.21 Click on “REGISTER” Button
    By clickOnReg = By.xpath("//button[@id='register-button']");
    By verifyTheMsgYourRegComplet = By.xpath("//div[@class='result']");
    By clickOnContinueT = By.xpath("//div[@class='buttons']/a");
    By verifyTheTextShoppingCart = By.xpath("//div[@class='page-title']/h1");
    By clickOnCheckBoxTOSAfterShoppingCart = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckout226 = By.xpath("//button[@id='checkout']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNum = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickOnContinue228 = By.xpath("//div[@id='billing-buttons-container']/button[4]");
    By clickOnRadioButton2DayAir = By.xpath("//input[@id='shippingoption_2']");
    By clickOnContinue230 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
//2.31 Select Radio Button “Credit Card”
    By clickOnRadioButtonCC = By.xpath("//input[@id='paymentmethod_1']");
    By clickonContinueCC = By.xpath("//div[@id='checkout-step-payment-method']/div[1]/button[1]");
    By visa = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By clickOnContinueCheckOut = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By verifyPaymentMethodCC = By.xpath("//div[@class='payment-method-info']/ul[1]/li[1]/span[2]");
    By verifyShippingMethod2ndAir = By.xpath("//div[@class='shipping-method-info']/ul[1]/li[1]/span[2]");
    By verifyTotalis698at237 = By.xpath("//span[@class='value-summary']/strong");
    By clickOnConfirm = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By verifyTheTextThankU = By.xpath("//div[@class='page-title']/h1");

    By verifyTheMsgYourOrderHasBeenSucc = By.xpath("//div[@class='section order-completed']/div[1]/strong");
    By clickOnContinue241 = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    By verifyTheTextWelcomeToOurStore = By.xpath("//div[@class='topic-block-title']/h2");
    By clickOnLogOut = By.xpath("//div[@class='header-links']/ul[1]/li[2]/a");




    public void verifyTheURL (){
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://demo.nopcommerce.com/";
        Assert.assertEquals(expectedUrl, actualUrl);
    }


    public void clickOnLogOutLink (){
        clickOnElement(clickOnLogOut);
    }

    public String verifyTheTextWelcomeToOurStore (){
        return getTextFromElement(verifyTheTextWelcomeToOurStore);
    }
    public void clickOnContinue241 () {
        clickOnElement(clickOnContinue241);
    }
    public String verifyTheMsgYourOrderHasBeenSuccessfullyProcessed (){
        return getTextFromElement(verifyTheMsgYourOrderHasBeenSucc);
    }
    public String verifyTheTextThankYou (){
        return getTextFromElement(verifyTheTextThankU);
    }
    public void clickOnConfirm (){
        clickOnElement(clickOnConfirm);
    }
    public String verifyTotalis698at237 (){
        return getTextFromElement(verifyTotalis698at237);
    }
    public String verifyShippingMethoIs2ndDayAir (){
        return getTextFromElement(verifyShippingMethod2ndAir);
    }
    public String verifyPaymentMethodIsCreditCard (){
        return getTextFromElement(verifyPaymentMethodCC);
    }
    public void clickOnContinueCheckOut234 (){
        clickOnElement(clickOnContinueCheckOut);
    }
    public void fillAllTheDetails233 (){
        sendTextToElement(cardHolderName, "Lord uk");
        sendTextToElement(cardNumber, "5425233430109903");
        selectByValueFromDropDown(expiryMonth, "4");
        selectByValueFromDropDown(expiryYear, "2023");
        sendTextToElement(cardCode, "123");
    }
    public void selectVisaFromSelectCreditCardOp (){
        selectByValueFromDropDown(visa, "visa");
    }
    public void selectRadioButtonCreditCard (){
        clickOnElement(clickOnRadioButtonCC);
        clickOnElement(clickonContinueCC);
    }
    //2.31 Select Radio Button “Credit Card”
    public void clickOnContinue230 (){
        clickOnElement(clickOnContinue230);
    }
    public void clickOnRadioButton2DayAir (){
        clickOnElement(clickOnRadioButton2DayAir);
    }
    public void clickOnContinue228 (){
        clickOnElement(clickOnContinue228);
    }
    public void fillTheMandatoryFields227 (){
        selectByValueFromDropDown(country, "233");
        sendTextToElement(city, "London");
        sendTextToElement(address, "Buckingham Palace");
        sendTextToElement(zipPostalCode, "SW1A 1AA");
        sendTextToElement(phoneNum, "1234567890");
    }
    public void clickOnCheckOut226 (){
        clickOnElement(clickOnCheckout226);
    }
    public void clickOncheckBoxIAgreeWithTOS225 (){
        clickOnElement(clickOnCheckBoxTOSAfterShoppingCart);
    }
    public String verifyTheTextShoppingCart (){
        return getTextFromElement(verifyTheTextShoppingCart);
    }
    public void clickOnContinueTab (){
        clickOnElement(clickOnContinueT);
    }
    public String verifyTheMsgYourRegCompleted (){
        return getTextFromElement(verifyTheMsgYourRegComplet);
    }
    public void clickOnRegisterButton (){
        clickOnElement(clickOnReg);
    }
    //2.21 Click on “REGISTER” Button
    public void fillTheMandatoryFields (){

        sendTextToElement(firstName, "Lor");
        sendTextToElement(lastName, "duk");
        Random randomNum = new Random();
        int randomGenerator = randomNum.nextInt(1000);
        sendTextToElement(email, "Lorduk"+randomGenerator+ "@gmail.com");
        sendTextToElement(passWord, "123456");
        sendTextToElement(confirmPw, "123456");
    }
    public String verifyTheTextRegister (){
        return getTextFromElement(verifyTheTextRegister);
    }
    public void clickOnRegisterTab (){
        clickOnElement(clickOnRegisterTab);
    }
    public String verifyTheTextWelcomePlsSignIn (){
        return getTextFromElement(verifyTheTextWelcomePlsSignIn);
    }
    public void clickOnChechOut (){
        clickOnElement(clickOnCheckout);
    }
    public void clickOnCheckBoxIAgreeWithTheTermsOfService (){
        clickOnElement(clickOnCheckBoxIAgreeWithTheTermsOfService);
    }
    public String verifyTheTotal698 (){
        return getTextFromElement(verify698);
    }
    public String verifyTheQtyIs2 (){
        return getTextFromElement(verifyTheQuantity2);
    }
    public String verifyTheMsgShoppingCart (){
        return getTextFromElement(verifyTheMsgShoppingCart);
    }
    public void mouseHoverOnShoppingCartAndClickOnGoToCartButton () throws InterruptedException {
        mouseHoverToElement(mouseHoverOnShoppingCart);
        Thread.sleep(1000);
        clickOnElement(clickonGoToCart);
    }
    //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void closeTheBarClickingOnTheCrossButton (){
        clickOnElement(closeTheBar);
    }

    public String verifyTheMsgTheProductHasBeenAddedToYourShoppingCartOnTapGreen( ) {
        return getTextFromElement(verifyTheMsgTheProductHasBeenAdded);

    }
    public void clickOnAddToCartTab (){
        clickOnElement(clickOnAddToCart);
    }
    public void changeQtyTo2 (){
        driver.findElement(clearQty).clear();
        sendTextToElement(changeQtyTo2, "2");
    }
    public String verifyThePrice349 (){
        return getTextFromElement(verifyThePrice349);
    }
    public String verifyTheTextNokiaLumia1020 (){
        return getTextFromElement(verifyTheTextNokia);
    }
    public void clickOnProductNameNokiaLumia1020 (){
        clickOnElement(clickOnProductNameNokia);
    }
    public void clickOnListViewTab (){
        clickOnElement(clickOnList);
    }

    //Test1 below and Test 2 rest above descending
    public void mouseHoverOnElectronicsTab (){
        mouseHoverToElement(electronicsTab);
    }
    public void mouseHoverOnCellPhonesAndClick (){
        mouseHoverToElementAndClick(cellPhones);
    }
    public String verifyTheTextCellPhones (){
        return getTextFromElement(verifyCellPhones);
    }
}
