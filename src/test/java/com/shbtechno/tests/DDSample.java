package com.shbtechno.tests;

import com.shbtechno.steps.DDSearchSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("testData/OpenAccounts/AccountNumbers.csv")
public class DDSample {

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
    DDSearchSteps searchSteps;

    @Test
    @Title("Verify entering text in Google search")
    public void enterSearchInGoogle(){

        searchSteps.navigateToGoogle();
        System.out.println(firstName);
        searchSteps.enterSearch(firstName);

        searchSteps.clickSearch();

    }

}
