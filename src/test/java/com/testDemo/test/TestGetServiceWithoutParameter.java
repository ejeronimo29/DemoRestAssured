package com.testDemo.test;

import com.google.gson.reflect.TypeToken;
import com.testDemo.framework.GetServiceWithoutParameter.ResponseGetServiceWithoutParameter;
import util.ConvertTypeJson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestGetServiceWithoutParameter {

    @BeforeSuite(alwaysRun = true)
    public void configure(){

        /* Original URL: http://test.com:9000/health  */
        /* Split the URL */
        RestAssured.baseURI ="http://test.com";
        RestAssured.port = 9000;
        RestAssured.basePath="/health";
    }

    @Test
    public void validateGetServiceWithoutParameter(){

        /* Instance the classes that has the response object and the class Util for the JSON manipulation. */
        ResponseGetServiceWithoutParameter responseService;
        ConvertTypeJson convertTypeJson = new ConvertTypeJson();

        /* Execute the service and get the response */
        Response response = given().get();

        /*  Use the method that converts a JSON to Java Object */
        responseService = convertTypeJson.getObjectFromJson(response.getBody().asString(), new TypeToken<ResponseGetServiceWithoutParameter>(){}.getType());

        /* Get the data of the object*/
        System.out.println(" STATUS Services --> "+responseService.getStatus());
        System.out.println(" STATUS Total DiskSpace --> "+responseService.getDiskSpace().getTotal());
        System.out.println(" STATUS Mongo Version --> "+responseService.getMongo().getVersion());

    }


}


