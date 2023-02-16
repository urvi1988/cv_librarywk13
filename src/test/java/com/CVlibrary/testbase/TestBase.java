package com.CVlibrary.testbase;


import com.CVlibrary.propertyreader.PropertyReader;
import com.CVlibrary.utility.Utility;
import org.testng.annotations.BeforeMethod;


public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp()throws InterruptedException {
        selectBrowser(browser);
        new Utility().acceptCookiesandSwitchToIframe();
    }
}
    /*@AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}


     */