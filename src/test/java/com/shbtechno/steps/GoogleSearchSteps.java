package com.shbtechno.steps;


import com.shbtechno.pages.BasePage;
import com.shbtechno.pages.Login;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import sun.rmi.runtime.Log;

public class GoogleSearchSteps extends ScenarioSteps {


    BasePage basePage;
    Login loginPage;


    @Step("Given the user is navigated to google")
    public Login navigateToGoogle(){
        return basePage.navigateToLogin();
    }


    @Step("verify google page")
    public Login verifyGooglePage()
    {
        return basePage.verifyGooglePage();
    }

    @Step("verify sign in button availibility failed test")
    public Login verifySignButtonFailedTest(){
        return basePage.verifySignButtonAvailableFailedTest();
    }

    @Step("verify sign in button availibility passed test")
    public Login verifySignButtonPassedTest(){
        return basePage.verifySignButtonAvailablePassTest();
    }

    @Step("When user enters text to search: {0}")
    public Login enterSearch(String searchText){
        return basePage.searchInGoogle(searchText);
    }

    @Step("Then user clicks Google Search")
    public Login clickSearch(){
        return basePage.clickSearch();
    }
}
