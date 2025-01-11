package com.parvin.APITest;
import static io.restassured.response.Response.*;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.testing.annotation.Test;


public class example {
    @Test
    public void test2(){
        get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200);

    }
}
