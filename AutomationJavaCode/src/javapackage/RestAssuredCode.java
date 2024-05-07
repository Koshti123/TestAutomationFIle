package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredCode {

	@Test
	public void getdata() {
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httprequest=RestAssured.given();
		Response resp=httprequest.request(Method.GET,"");
	System.out.println(resp.asString());
		System.out.println(resp.prettyPrint());
		
		ResponseBody body=resp.getBody();
		System.out.println(body.prettyPrint());
		
		String resp1=resp.prettyPrint();
	Assert.assertEquals(resp1,resp.prettyPrint());
	}
}
