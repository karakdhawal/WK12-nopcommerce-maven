package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By topmenu = By.xpath("//ul[@class='top-menu notmobile']");

    By computerText = By.xpath("//ul[@class='top-menu notmobile']/li[1]");
    By elecronicsText = By.xpath("//ul[@class='top-menu notmobile']/li[2]");
    By apparelText = By.xpath("//ul[@class='top-menu notmobile']/li[3]");
    By digitalDownloads = By.xpath("//ul[@class='top-menu notmobile']/li[4]");
    By books = By.xpath("//ul[@class='top-menu notmobile']/li[5]");
    By jewelry = By.xpath("//ul[@class='top-menu notmobile']/li[6]");
    By giftCards = By.xpath("//ul[@class='top-menu notmobile']/li[7]");


    public void selectMenu (String menu){
        List<WebElement> topMenuName = driver.findElements(topmenu);
        for (WebElement name : topMenuName){
            if(name.getText().equalsIgnoreCase(menu)){
                name.click();
                break;
            }
        }
    }
    public String verifyComputerText (){
        return getTextFromElement(computerText);
    }
    public String verifyElectronicsText (){
        return getTextFromElement(elecronicsText);
    }
    public String verifyApparelText (){
        return getTextFromElement(apparelText);
    }
    public String verifyDigitalDownloadsText (){
        return getTextFromElement(digitalDownloads);
    }
    public String verifyBooksText (){
        return getTextFromElement(books);
    }
    public String verifyJewelryText (){
        return getTextFromElement(jewelry);
    }
    public String verifyGiftCardsText (){
        return getTextFromElement(giftCards);
    }
}
