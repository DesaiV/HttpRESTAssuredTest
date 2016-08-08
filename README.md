# HttpRESTAssuredTest

Source code is to showcase Test for /get, /post and /headers service endpoints hosted at http://httpbin.org.

Test cases for Get method

Test Case 1: Check response status code is 200 and json element url = "http://httpbin.org"
	Check the status code and url in json response . If the status code is equal to 200 and url is equal to "http://httpbin.org/get"
	than test is passed otherwise test is failed.
	Test Scenario		: Check the status code and url element in json response
	Test Data	 	: url = "http://httpbin.org"
	Expected Results 	: Status code = 200 and url = http://httpbin.org
	Actual Results		: As Expected
	Pass/Fail		: Pass

Test Case 2: Check json element <code>origin</code> is not null
	Check the origin element in json response. If it is not null than test is pass otherwise test is fail.
	Test Scenario		: Check the origin element in json response 
	Test Data	 	: origin="173.58.53.59" 
	Expected Results 	: origin = "173.58.53.59"
	Actual Results		: As Expected
	Pass/Fail		: Pass
	
Test Case 3: Test result of query parameters
    Check value of the query parameters. If the value is same as passed in query than test is pass otherwise test is fail.
	Test Scenario		: Check value of the query parameters
	Test Data	 	: ?data=value&data1=value2
	Expected Results 	: data = value
	Actual Results		: As expected
	Pass/Fail		: Pass
	
Test cases for Post method

Test Case 1: Test result of form submit
    Check that status code is equal to 200 and form is submitted and response contains data submitted than test is passed otherwise test is failed.
	Test Scenario		: Check that status code is equal to 200 and form is submitted and response contains data submitted
	Test Data	 	: data = "Vishal"
	Expected Results 	: Value of data is Vishal
	Actual Results		: As expected
	Pass/Fail		: Pass

Test Case 2: Check post date (empId)
	Check that status code is equal to 200 and form is submitted and response contains empId submitted than test is passed otherwise test is failed.
	Test Scenario		: Check that status code is equal to 200 and form is submitted and response contains empId submitted
	Test Data	 	: empId="1"
	Expected Results 	: empId="1"
	Actual Results		: As expected
	Pass/Fail		: Pass

Test Case 3: Check post date (empName)
	Check that status code is equal to 200 and form is submitted and response contains empName submitted than test is passed otherwise test is failed.
	Test Scenario		: Check that status code is equal to 200 and form is submitted and response contains empName submitted
	Test Data	 	: empName="Vishal"
	Expected Results 	: empName="Vishal"
	Actual Results		: As expected
	Pass/Fail		: Pass

Test Case 4: Check post date (empSal)
	Check that status code is equal to 200 and form is submitted and response contains empSal submitted than test is passed otherwise test is failed.
	Test Scenario		: Check that status code is equal to 200 and form is submitted and response contains empSal submitted 
	Test Data	 	: empSal="6666.45"
	Expected Results 	: empSal="6666.45"
	Actual Results		: As expected
	Pass/Fail		: Pass


Test Cases for headers method

Test Case 1: Test response headers
	Check that status code is equal to 200 and response contains server value equal to "nginx" passed otherwise test is failed.
	Test Scenario		: Check that status code is equal to 200 and response contains server value equal to "nginx"
	Test Data	 	: server="nginx"
	Expected Results 	: server="nginx"
	Actual Results		: As expected
	Pass/Fail		: Pass

Test Case 2: Test request headers
	Check that status code is equal to 200 and requested headers and response header contains value of requested header than test is passed otherwise test failed.
	Test Scenario		: Check that status code is equal to 200 and requested headers and response header contains value of requested header
	Test Data	 	: Headers1="headerValue1" and Headers2="headerValue2"
	Expected Results 	: Headers1="headerValue1" and Headers2="headerValue2"
	Actual Results		: As expected
	Pass/Fail		: Pass
	
Steps to execute test locally

1) Install  Maven (After All installation steps. write mvn -v on command prompt to check mvn version )
2) Download all files from this link " https://github.com/DesaiV/HttpRESTAssuredTest "
3) Type command " cd Path of the pom.xml file "
4) Type command " mvn test " it will start test.

Git repository has been integrated with travis ci. Travis build will be trigged when code changes push into Git repository. latest build report
including test case results can be viewed at " https://travis-ci.org/DesaiV/HttpRESTAssuredTest ".
