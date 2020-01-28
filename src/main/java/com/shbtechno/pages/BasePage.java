package com.shbtechno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import sun.rmi.runtime.Log;


public class BasePage extends PageObject {

    private static final String SEARCH_INPUT = "//*[@title='Search']";
    private static final String SEARCH_BUTTON = "//*[@value='Google Search']";
    public Login navigateToLogin(){
        open();
        return this.switchToPage(Login.class);
    }

    public Login searchInGoogle(String searchValue){
        waitFor(SEARCH_INPUT).$(SEARCH_INPUT).sendKeys(searchValue);
        return this.switchToPage(Login.class);
    }

    public Login clickSearch(){
        waitFor(SEARCH_BUTTON).$(SEARCH_BUTTON).click();
        return this.switchToPage(Login.class);
    }
}
