package com.testDemo.test;

import com.google.gson.reflect.TypeToken;
import com.testDemo.framework.PostServiceWithoutParameter.ResponsePostServiceWithoutParameter;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import util.ConvertTypeJson;

import static io.restassured.RestAssured.given;

public class TestPostServiceWithoutParameter {

    @BeforeSuite(alwaysRun = true)
    public void configure(){

        /*Original URL :  http://test:8080/OrgRefData/v1.0/org/1604088/adultChildThreshold */
        /* Split the URL */

        RestAssured.baseURI ="http://test.com";
        RestAssured.port=8080;
        RestAssured.basePath="/Org/adultChildThreshold";
    }

    @Test
    public void validatePostServiceWithoutParameter(){

        /* Instance the classes that has the response object and the class Util for the JSON manipulation. */
        ConvertTypeJson convertTypeJson = new ConvertTypeJson();
        ResponsePostServiceWithoutParameter responseFirstService;

        /* Execute the service and get the response */
        Response response =
                given().
                        when().
                        post();

        /*  Use the method that converts a JSON to Java Object */
        responseFirstService = convertTypeJson.getObjectFromJson(response.getBody().asString(), new TypeToken<ResponsePostServiceWithoutParameter>(){}.getType());

        /* Get the data of the object*/
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeaders().toString());
    }

}
