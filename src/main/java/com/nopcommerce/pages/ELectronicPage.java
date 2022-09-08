package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ELectronicPage extends Utility {

    By electronicsTab = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");

    By cellPhones = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/ul[1]/li[2]/a");

    By verifyCellPhones = By.xpath("//div[@class='page category-page']/div[1]/h1");

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
