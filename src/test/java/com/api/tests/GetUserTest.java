package com.api.tests;

import com.api.factory.RequestSpecFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class GetUserTest {

	@Test
	public void validateGetUser() {
		Response response = given().
								spec(RequestSpecFactory.request())
								.log().all()
							.when()
								.get("/users/1").
							then()
								.log().all()
								.statusCode(200)
								.extract().
								response();
		Assert.assertEquals(response.jsonPath().getInt("id"), 1);
		Assert.assertEquals(response.jsonPath().getString("username"), "Bret");
	}
}