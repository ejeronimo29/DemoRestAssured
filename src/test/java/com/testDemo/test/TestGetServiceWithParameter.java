package com.testDemo.test;

import com.google.gson.reflect.TypeToken;
import com.testDemo.framework.GetServiceWithParameter.ResponseGetServiceWithParameter;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import util.ConvertTypeJson;

import static io.restassured.RestAssured.given;

public class TestGetServiceWithParameter {

    @BeforeSuite(alwaysRun = true)
    public void configure(){

        /* Original URL: http://tlauthmgr12.rctanalytics.com/api/v1/auth/query?username=lb_test  */
        /* Split the URL */

        RestAssured.baseURI ="http://tlauthmgr12.rctanalytics.com";
        RestAssured.basePath="/api/v1/auth/query";
    }

    @Test
    public void validateGetServiceWithParameter(){

        /* Instance the classes that has the response object and the class Util for the JSON manipulation. */
        ConvertTypeJson convertTypeJson = new ConvertTypeJson();
        ResponseGetServiceWithParameter responseService;

        /*This variable contains the value of the parameter*/
        String userName = "";

        /* Execute the service and get the response */
        Response response =
                given().
                        queryParam("username",userName).
                     when().
                        get();

        System.out.println(response.getStatusLine());

        /*  Use the method that converts a JSON to Java Object */
        responseService = convertTypeJson.getObjectFromJson(response.getBody().asString(), new TypeToken<ResponseGetServiceWithParameter>(){}.getType());

        /* Get the data of the object*/
        System.out.println("Success --> " + responseService.getSuccess());
        System.out.println("Data Message--> " + responseService.getData().getMessage());


    }



}




