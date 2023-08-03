package com.pflb.API;


import com.pflb.UI.EnvConfig;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserAPI {

EnvConfig envConfig = new EnvConfig();
    @Test
    public void loginTest(){
        Auth auth= new Auth(envConfig.userPassword,envConfig.username);
        given()
                .contentType(ContentType.JSON)
                .body(auth)
                .when()
                .post(envConfig.apiUrl+"/login")
                .then()
                .statusCode(202);


    }
    @Test
    public void userSortByIdTest(){
        List<User> usersList =  given()
                .when()
                .contentType(ContentType.JSON)
                .get(envConfig.apiUrl+"/users")
                .then().log().all()
               .extract().body().jsonPath().getList("$", User.class);
             //   .extract().body().jsonPath().getList("$");


    }

}
