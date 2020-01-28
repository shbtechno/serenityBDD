package com.shbtechno.tests;

import com.shbtechno.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class Sample {

    @Managed
    WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Test
    @Title("Navigating to google page")
    public void navigateToGoogle(){
        loginSteps.navigateToGoogle();
    }

}
