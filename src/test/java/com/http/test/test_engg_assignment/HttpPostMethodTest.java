package com.http.test.test_engg_assignment;

import static com.jayway.restassured.RestAssured.*;
import static  com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;

import dto.EmployeeDetailDto;

public class HttpPostMethodTest {
	
	private String baseurl ="http://httpbin.org"; 
	private String serviceEndpoint ="/post";
	
	@Test
	public void testPostFormData(){
		
		given().contentType("text/plain; charset=us-ascii").body("Vishal").
		when().post("http://httpbin.org/post").then().statusCode(200).and().body("data",equalTo("Vishal"));
			
	} 
	
	@Test
	public void testPostJson() {
		
		EmployeeDetailDto emp = new  EmployeeDetailDto(1,"Vishal",6666.45f);
		
		given().contentType("application/json").body(emp).
		when().post("http://httpbin.org/post").then().
		contentType(ContentType.JSON).body("json.empId", equalTo(1));
	}
	
	@Test
	public void testPostEmpNameJson(){
		
		EmployeeDetailDto empName = new  EmployeeDetailDto(1,"Vishal",6666.45f);
		
		given().contentType("application/json").body(empName).
		when().post("http://httpbin.org/post").then().
		contentType(ContentType.JSON).body("json.empName", equalTo("Vishal"));	
	}
	
	@Test
	public void testPostEmpSalJson(){
		
		EmployeeDetailDto empSal = new  EmployeeDetailDto(1,"Vishal",6666.45f);
		
		given().contentType("application/json").body(empSal).
		when().post("http://httpbin.org/post").then().
		contentType(ContentType.JSON).body("json.empSal", equalTo(6666.45f));
	}

}
