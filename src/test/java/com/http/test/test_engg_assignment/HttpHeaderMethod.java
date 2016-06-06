package com.http.test.test_engg_assignment;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Headers;

public class HttpHeaderMethod {

	private String baseurl = "http://httpbin.org";
	private String serviceEndpoint = "/headers";
	
	/**
	 * Test Case 1: Test response headers
	 */
	@Test
	public void testResponseHeaders() {

		given().
			head(baseurl + serviceEndpoint).
		then().log().all().
			statusCode(200).
			and().
			header("Content-Type", "application/json").
			and().header("Server", "nginx");
	}

	/**
	 *  Test Case 2: Test request headers
	 */
	@Test
	public void testRequesteHeaders() {
		Header first = new Header("Headers1", "headerValue1");
		Header second = new Header("Headers2", "headerValue2");
		Headers headers = new Headers(first, second);

		given().
			headers(headers).
		when().
			get(baseurl + serviceEndpoint).
		then().log().all().
			statusCode(200).
			and().
			contentType(ContentType.JSON).body("headers.Headers1", equalTo("headerValue1")).
			and().
			contentType(ContentType.JSON).body("headers.Headers2", equalTo("headerValue2"));

	}
}
