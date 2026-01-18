package com.api.factory;

import com.api.config.EnvConfig;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecFactory {
	
	public static RequestSpecification request() {
		return new RequestSpecBuilder()
				.setBaseUri(EnvConfig.getBaseUri())
				.addHeader("content-Type", "application/json")
				.build();		
	}
}



// It shows how to set the other parameters in it.
//public class BaseSpecs {

  //  public static RequestSpecification requestWithAuthAndParams(String token) {
    //    return new RequestSpecBuilder()
      //          .setBaseUri("https://api.example.com")
        //        .addHeader("Authorization", "Bearer " + token)  // Authentication header
          //      .setContentType(ContentType.JSON)               // Content type
            //    .addQueryParam("status", "active")              // Query param
              //  .build();
    //}
//}

//Advantages are
// 1. No BaseTest dependency
// No lifecycle Issues
// No local host Problem EVER
