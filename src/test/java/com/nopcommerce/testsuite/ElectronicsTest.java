package com.nopcommerce.testsuite;

import com.nopcommerce.pages.ELectronicPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {

    ELectronicPage eLectronicPage = new ELectronicPage();

    @Test
    public void verifyCellPhones (){
        eLectronicPage.mouseHoverOnElectronicsTab();
        eLectronicPage.mouseHoverOnCellPhonesAndClick();
        eLectronicPage.verifyTheTextCellPhones();
    }

}
