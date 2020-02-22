package com.shbtechno.steps;


import com.shbtechno.pages.BasePage;
import com.shbtechno.pages.Login;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DDSearchSteps extends ScenarioSteps {


    BasePage basePage;
    Login loginPage;


    @Step("Given the user is navigated to google")
    public Login navigateToGoogle(){
        return basePage.navigateToLogin();
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
