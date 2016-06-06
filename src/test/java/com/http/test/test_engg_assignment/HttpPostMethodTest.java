package com.http.test.test_engg_assignment;

import static com.jayway.restassured.RestAssured.*;

import static  org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

import dto.EmployeeDetailDto;

public class HttpPostMethodTest {
	
	
	
	/**
	 * Test Case 1: Test result of form submit
	 */
	@Test
	public void testPostFormData(){
		
		given().
			contentType("text/plain; charset=us-ascii").body("Vishal").
		when().
			post("http://httpbin.org/post").
		then().log().all().
			statusCode(200).
			and().
			body("data",equalTo("Vishal"));
			
	} 
	
	/**
	 * Test Case : 2 Check post data (empId)
	 */
	
	@Test
	public void testPostJson() {
		
		EmployeeDetailDto emp = new  EmployeeDetailDto(1,"Vishal",6666.45f);
		
		given().
			contentType("application/json").body(emp).
		when().
			post("http://httpbin.org/post").
		then().log().all().
			contentType(ContentType.JSON).body("json.empId", equalTo(1));
	}
	
	/**
	 * Test case 3: Check post data (empName)
	 */
	
	@Test
	public void testPostEmpNameJson(){
		
		EmployeeDetailDto empName = new  EmployeeDetailDto(1,"Vishal",6666.45f);
		
		given().
			contentType("application/json").body(empName).
		when().
			post("http://httpbin.org/post").
		then().log().all().
			contentType(ContentType.JSON).body("json.empName", equalTo("Vishal"));	
	}
	
	/**
	 * Test case 4: Check post data (empSal)
	 */
	
	@Test
	public void testPostEmpSalJson(){
		
		EmployeeDetailDto empSal = new  EmployeeDetailDto(1,"Vishal",6666.45f);
		
		given().
			contentType("application/json").body(empSal).
		when().
			post("http://httpbin.org/post").
		then().log().all().
		contentType(ContentType.JSON).body("json.empSal", equalTo(6666.45f));
	}

}
