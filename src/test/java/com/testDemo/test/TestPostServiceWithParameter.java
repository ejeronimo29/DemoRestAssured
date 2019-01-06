package com.testDemo.test;

import com.google.gson.reflect.TypeToken;
import com.testDemo.framework.PostServicesWithParameter.RequestPostServiceWithParameter;
import com.testDemo.framework.PostServicesWithParameter.ResponsePostServiceWithParameter;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import util.ConvertTypeJson;

import static io.restassured.RestAssured.given;

public class TestPostServiceWithParameter {

    @BeforeSuite(alwaysRun = true)
    public void configure(){

        /* Original URL: https://test.com/RealTimeSales */
        /* Split the URL */

        RestAssured.baseURI ="https://test.com";
        RestAssured.basePath="/RealTimeSales";
    }

    @Test
    public void validatePostServiceWithParameter(){

        /* Instance the classes that has the response object and the class Util for the JSON manipulation. */
        ConvertTypeJson convertTypeJson = new ConvertTypeJson();
        ResponsePostServiceWithParameter responseService;

        /* Instance the class that has the request object  */
        RequestPostServiceWithParameter requestPostServiceWithParameter = new RequestPostServiceWithParameter();
        requestPostServiceWithParameter.setDeviceId("1604088");

        /*  Use the method that converts a Java Object to JSON */
        String request = convertTypeJson.convertObjectToStringJson(requestPostServiceWithParameter,new TypeToken<RequestPostServiceWithParameter>(){}.getType());

        /* Execute the service and get the response */
        Response response =
                given().
                        request().body(request).
                            when().
                                post();

        /*  Use the method that converts a JSON to Java Object */
        responseService = convertTypeJson.getObjectFromJson(response.getBody().asString(), new TypeToken<ResponsePostServiceWithParameter>(){}.getType());

        /* Get the data of the object*/
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeaders().toString());
    }


}
