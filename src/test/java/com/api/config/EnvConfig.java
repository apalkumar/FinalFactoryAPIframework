package com.api.config;


public class EnvConfig {
	
	public static String getBaseUri() {
		
		String env = System.getProperty("env","qa");
		
		switch(env.toLowerCase()) {
		case "dev":
			return "https://jsonplaceholder.typicode.com";
		case "qa":
			return "https://jsonplaceholder.typicode.com";
		case "prod":
			return "https://jsonplaceholder.typicode.com";
		default:
			throw new RuntimeException("Invalid ENV: " +env);
		}
	}

}

/*
 * //8️⃣ WHY THIS DESIGN IS ENTERPRISE-GRADE ✔ No POJO maintenance ✔ No Jackson
 * issues ✔ No baseURI lifecycle bugs ✔ Factory-driven test data ✔
 * Environment-agnostic ✔ Parallel-ready ✔ CI/CD friendly
 */
