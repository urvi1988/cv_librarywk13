package com.CVlibrary.pages.Homepage;

import com.CVlibrary.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;
    @FindBy(xpath = "//input[@id='location']")
    WebElement Location;
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement findJobs;

    public void enterjobTitle(String jobtitle) {
        sendTextToElement(jobTitle, jobtitle);
        log.info("enter jobtitle" + jobTitle.toString());
    }
    public void enterlocation(String location) {
        sendTextToElement(Location, location);
        log.info("enter location" + Location.toString());
    }
    public void selectDistanceFromDropDown(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }
    public void clickonmoreSearchOptionsLink(){
        clickOnElement(moreSearchOptionsLink);
        log.info("click on Moresearchoptionlink"+ moreSearchOptionsLink.toString());
    }
    public void enterSalarymin(String salarymin){
        sendTextToElement(salaryMin,salarymin);
        log.info("enter minsalary"+salaryMin.toString());
    }
    public void enterSalarymax(String salarymax) {
        sendTextToElement(salaryMax, salarymax);
        log.info("enter maxsalary" + salaryMax.toString());
    }
    public void selectSalaryTypeDropDown(String typeSalary){
        selectByValueFromDropDown(salaryTypeDropDown,typeSalary);
    }
    public void selectJobTypeDropDown(String typeJob){
        selectByValueFromDropDown(jobTypeDropDown,typeJob);
    }
    public void clickonfindJobs() {
        clickOnElement(findJobs);
        log.info("clickonfindjobs" + findJobs.toString());
    }

}
