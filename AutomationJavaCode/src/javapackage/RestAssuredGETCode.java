package javapackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredGETCode {

	@Test
	public void get() {
		
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest=RestAssured.given();
		Response resp=httpRequest.request(Method.GET,"");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.prettyPrint());
		ResponseBody body=resp.getBody();
		System.out.println(body.asString());
		System.out.println(body.prettyPrint());
		
	}
}
