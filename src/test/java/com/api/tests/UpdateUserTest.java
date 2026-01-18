package com.api.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.api.factory.RequestSpecFactory;
import com.api.factory.UserPayLoadFactory;

public class UpdateUserTest {

	@Test
	public void validateUpdateUser() {
		given()
			.spec(RequestSpecFactory.request())
			.body(UserPayLoadFactory.UpdateUserPayLoad())
			.log().all()
		.when()
			.put("/user/1")
		.then()
			.log().all()
			.statusCode(200);
		
	}
	
}
