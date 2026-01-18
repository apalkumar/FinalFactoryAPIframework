package com.api.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import com.api.factory.RequestSpecFactory;
import com.api.factory.UserPayLoadFactory;

public class CreateUserTest {
	
	@Test
	public void validateCreateUser() {
		given()
			.spec(RequestSpecFactory.request())
			.body(UserPayLoadFactory.createUserPayLoad())
			.log().all()
		.when()
			.post("/users")
		.then()
			.log().all()
			.statusCode(201);
	}

}
