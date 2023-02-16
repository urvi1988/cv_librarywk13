package com.CVlibrary.pages.Resultpage;

import com.CVlibrary.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this); }

    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public String verifytheResults(){
        return getTextFromElement(resultText);
    }
    public void resultMessage(String result){
        String actualMsg = verifytheResults(); //Get text from page
        String expectedMsg = result; //Expected Message
        Assert.assertEquals(actualMsg, expectedMsg, "Results Verified!"); //Compare and Verify tes

    }
}
