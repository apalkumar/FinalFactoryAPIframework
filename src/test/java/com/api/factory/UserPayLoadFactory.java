package com.api.factory;

import java.util.HashMap;
import java.util.Map;

public class UserPayLoadFactory {
	
	public static Map<String, Object> createUserPayLoad(){
		Map<String, Object> user = new HashMap<>();
		user.put("name", "Anil");
		user.put("username", "anil123");
		user.put("email", "anil@test.com");
		return user;
	}
	
	public static Map<String, Object> UpdateUserPayLoad(){
		Map<String, Object> user = new HashMap<>();
		user.put("name", "Anil Updated");
		user.put("email", "update@test.com");
		return user;
	}
	
}
