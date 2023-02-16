package com.CVlibrary.testsuite;
//1.verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
//distance, String salaryMin, String salaryMax, String salaryType, String jobType,
//String result).
//enter job title 'jobTitle'
//enter Location 'location'
//select distance 'distance'
//click on moreSearchOptionsLink
//enter salaryMin 'salaryMin'
//enter salaryMax 'salaryMax'
//select salaryType 'salaryType'
//select jobType 'jobType'
//click on 'Find Jobs' button

import com.CVlibrary.pages.Homepage.HomePage;
import com.CVlibrary.pages.Resultpage.ResultPage;
import com.CVlibrary.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class JobSearchTest extends TestBase {
    HomePage homePage=new HomePage();
    ResultPage resultPage=new ResultPage();
    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        resultPage = new ResultPage();
    }
    @Test (dataProvider="JobSearch",dataProviderClass= TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance,
                                                           String salaryMin, String salaryMax, String salaryType, String jobType,String result){
        homePage.enterjobTitle(jobTitle);
        homePage.enterlocation(location);
        homePage.selectDistanceFromDropDown(distance);
        homePage.clickonmoreSearchOptionsLink();
        homePage.enterSalarymin(salaryMin);
        homePage.enterSalarymax(salaryMax);
        homePage.selectSalaryTypeDropDown(salaryType);
        homePage.selectJobTypeDropDown(jobType);
        homePage.clickonfindJobs();
        resultPage.resultMessage(result);
    }
}
