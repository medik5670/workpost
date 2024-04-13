package ru.netology.rest;

import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class PostmanEchoTest {
    @Test
    void shouldReturnSendData(){
        String text = "Hello";
        given()
                .baseUri("https://postman-echo.com")
                .body(text)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo(text));


    }
}
