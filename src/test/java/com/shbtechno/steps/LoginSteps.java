package com.shbtechno.steps;

import com.shbtechno.pages.BasePage;
import com.shbtechno.pages.Login;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    BasePage basePage;
    Login loginPage;

    @Step("Navigating to google")
    public Login navigateToGoogle(){
        return basePage.navigateToLogin();
    }



}
