package com.shbtechno.steps.microservice;

//import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

public class GetBaseURISteps {
    private static EnvironmentVariables environmentVariables;

    @Step("Get base uri for getting weather details")
    public static String getweatherURI(){
       // return EnvironmentSpecificConfiguration.from(environmentVariables)
              //  .getProperty("weather.getapplicationservice.url");
        return null;
    }

}
