package com.shbtechno.utils;

import com.shbtechno.steps.microservice.GetBaseURISteps;
import io.restassured.RestAssured;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;

public class MSTestbase {



    @BeforeClass
    public static void init(String uri){
        RestAssured.baseURI = "http://localhost:8080/student";
    }
}
