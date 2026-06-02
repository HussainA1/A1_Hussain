package org.hussain;


import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class AppTest
{
    public static void main(String[] args) {
        RestAssured.baseURI = "https://rahulshettyacademy.com/";
        given().log().all().header("Content-Type","application/json").queryParam("key","qaclick123").queryParam("place_id", "12345")
                .when().get("maps/api/place/get/json")
                .then().log().all().statusCode(200);

    }
}