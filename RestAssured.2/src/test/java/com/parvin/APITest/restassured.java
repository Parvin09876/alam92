package com.parvin.APITest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class restAssExample {
    @Test
    public void testGet(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeader("Content-Type"));
        System.out.println(response.getTime());

        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);
    }
}
