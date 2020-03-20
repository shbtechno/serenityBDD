package com.shbtechno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import sun.rmi.runtime.Log;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.*;

public class BasePage extends PageObject {

    private static final String SEARCH_INPUT = "//*[@title='Search']";
    private static final String SEARCH_BUTTON = "//*[@value='Google Search']";
    private static final String SIGNIN_BUTTON = "//*[@id='gb_70']";


    public Login navigateToLogin(){
        open();
        return this.switchToPage(Login.class);
    }

    public Login searchInGoogle(String searchValue){
        waitFor(SEARCH_INPUT).$(SEARCH_INPUT).sendKeys(searchValue);
        return this.switchToPage(Login.class);
    }

    public Login verifyGooglePage(){
        String googleText = waitFor(SEARCH_BUTTON).$(SEARCH_BUTTON).getValue();
        //assertThat(googleText,equalToIgnoringCase("Google Search"));
        return this.switchToPage(Login.class);
    }

    public Login verifySignButtonAvailableFailedTest(){
        String signInTxt = waitFor(SIGNIN_BUTTON).$(SIGNIN_BUTTON).getText();
        System.out.println("sign in text is : " +signInTxt);
        assertThat(signInTxt).isEqualTo("Sign in Not");
        return this.switchToPage(Login.class);
    }

    public Login verifySignButtonAvailablePassTest(){
        String signInTxt = waitFor(SIGNIN_BUTTON).$(SIGNIN_BUTTON).getText();
        System.out.println("sign in text is : " +signInTxt);
        assertThat(signInTxt).isEqualTo("Sign in");
        return this.switchToPage(Login.class);
    }

    public Login clickSearch(){
        waitFor(SEARCH_BUTTON).$(SEARCH_BUTTON).click();
        return this.switchToPage(Login.class);
    }
}
