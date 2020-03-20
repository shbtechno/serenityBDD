package com.shbtechno.tests.applicationService.get;

import com.shbtechno.steps.LoginSteps;
import com.shbtechno.steps.microservice.GetBaseURISteps;
import com.shbtechno.steps.microservice.MicroserviceSteps;
import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.Matchers.is;
import static org.assertj.core.api.Assertions.*;
@Concurrent //This is for parallel test and 2 threads per cpu core
@WithTag("ms:weather")
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("testData/dev/Restdata.csv")
public class getWeather {


    private String endpoint;
    private String input;
    private int statusCode;

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setInput(String input) {
        this.input = input;
    }




  /*  @Steps
    MicroserviceSteps steps;

    @Steps
    GetBaseURISteps baseURISteps;
*/
   /* @Test
    @Title("Get weather by city")
    public void getWeather(){

        //Get base uri according to environment
        //RestAssured.baseURI = baseURISteps.getweatherURI();
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities";
        String finalEndpoint = endpoint.replace("{input}",input);
        System.out.println("endpoint : "+finalEndpoint);

       String stats= SerenityRest.given()
                .when().get(finalEndpoint).
                then()
                .extract().toString();
        System.out.println("status is " +stats);
        assertThat(stats).isEqualTo("201");

    //log().all().assertThat().statusCode(201);

        *//*steps.getweatherInformation(finalEndpoint)
                .log()
                .all().assertThat()
                .statusCode(statusCode);*//*

    }
*/
    @Test
    public void failTest(){

        SerenityRest.given().when().get("http://restapi.demoqa.com/utilities/weather/city/Pune")
                .then().assertThat().statusCode(201);
    }
}
