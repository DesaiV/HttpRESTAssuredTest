package com.http.test.test_engg_assignment;

import static com.jayway.restassured.RestAssured.*;
import static  com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.restassured.path.json.JsonPath;

@SuppressWarnings("deprecation")
public class HttpGetMethodTest {
	
	private String baseurl ="http://httpbin.org"; 
	private String serviceEndpoint ="/get";
	
	@BeforeTest
	public void Setup(){
		
		
	}
	
	@Test
	public void testjsonPrint(){
		System.out.println(given().contentType("application/json").
		when().get(baseurl+serviceEndpoint+"?data=value&data1=value2").
		//then().body("data",not(equalTo("")));
		asString());
	}

	
	/**
	 * Test Case 1 : Check statuscode = 200 and url = "http://httpbin.org" 
	 */
	@Test(groups={"functest"})
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
	 * Test Case 2 : origin not null
	 */
	@Test(groups={"functest"})
	public void testOrigin(){
		given().
			contentType("application/json").
		when().
			get(baseurl+serviceEndpoint).
		then().log().all().
			body("origin",not(equalTo("")));	
	}
	
	/**
	 * Test Case 3 : 
	 * 
	 */
	/*@Test
	public void testDataValue(){
		given().contentType("application/json").
		when().get(baseurl+serviceEndpoint+"?data=value&data1=value2").
		then().body();	
	}*/
	public void testDataValue(){
	String json = 
			(given().
					contentType("application/json").
			when().log().all().
					get(baseurl+serviceEndpoint+"?data=value&data1=value2").
			asString());
	Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);
	/*String dataValue = JsonPath.
			read(document,"$.args.data");*/
	}
	
}
