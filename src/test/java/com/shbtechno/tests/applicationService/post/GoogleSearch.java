package com.shbtechno.tests.applicationService.post;

import com.shbtechno.steps.GoogleSearchSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Concurrent //This is for parallel test and 2 threads per cpu core
@WithTag("ui:uitest")
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("$DATADIR/UIdata.csv")
public class GoogleSearch {

    private String accountNumber;
    private String firstName;
    private String lastName;
    private int amount;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Managed
    WebDriver driver;

    @Steps
    GoogleSearchSteps searchSteps;

    @Test
    @Title("Verify entering text in Google search - Failed test")
    public void enterSearchInGoogle() throws InterruptedException {

        searchSteps.navigateToGoogle();
        System.out.println(firstName);

        Thread.sleep(1000);

        //searchSteps.verifyGooglePage();

        searchSteps.verifySignButtonFailedTest();

        searchSteps.enterSearch(firstName);

        searchSteps.clickSearch();

    }

    @Test
    @Title("Verify entering text in Google search - Passed test")
    public void enterSearchInGoogle1() throws InterruptedException {

        searchSteps.navigateToGoogle();
        System.out.println(firstName);

        Thread.sleep(1000);

        //searchSteps.verifyGooglePage();

        searchSteps.verifySignButtonPassedTest();

        searchSteps.enterSearch(firstName);

        searchSteps.clickSearch();

    }

}
