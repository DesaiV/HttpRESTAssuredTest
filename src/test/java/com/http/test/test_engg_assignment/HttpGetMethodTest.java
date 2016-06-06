package com.http.test.test_engg_assignment;

import static com.jayway.restassured.RestAssured.*;

import static  org.hamcrest.Matchers.*;


import org.testng.annotations.Test;


import com.jayway.restassured.http.ContentType;



public class HttpGetMethodTest {
	
	private String baseurl ="http://httpbin.org"; 
	private String serviceEndpoint ="/get";
	
	
	

	
	/**
	 * Test Case 1 : Check response status code is 200 and json element <code>url = "http://httpbin.org/get"</code> 
	 */
	@Test
	public void testUrlElement() {
		given().
			contentType("application/json").
		when().
			get(baseurl+serviceEndpoint).
		then().log().all().
			statusCode(200).
			and().
			body("url",equalTo(baseurl+serviceEndpoint));	
	}
	
	/**
	 * Test Case 2 : Check json element <code>origin</code> is not null
	 */
	@Test
	public void testOrigin(){
		given().
			contentType("application/json").
		when().
			get(baseurl+serviceEndpoint).
		then().log().all().
			body("origin",not(equalTo("")));	
	}
	
	/**
	 * Test Case 3 : Test result of query parameters 
	 * 
	 */
	@Test
	public void testDataValue(){
	
			given().
				contentType("application/json").
			when().log().all().
				get(baseurl+serviceEndpoint+"?data=value&data1=value2").
			then().log().all().
				contentType(ContentType.JSON).body("args.data",equalTo("value"));
	}
	
}
