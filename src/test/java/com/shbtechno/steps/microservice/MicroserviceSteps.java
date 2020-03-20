package com.shbtechno.steps.microservice;

import com.google.inject.internal.cglib.core.$ClassNameReader;
import com.shbtechno.model.Params;
import com.shbtechno.utils.ReusableSpecifications;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class MicroserviceSteps {

    @Step("Getting weather information by city")
    public ValidatableResponse getweatherInformation(String endpoint){

        return SerenityRest.given()
                .spec(ReusableSpecifications.getGenericRequestSpec())
                .when()
                .get(endpoint)
                .then();
    }


}
