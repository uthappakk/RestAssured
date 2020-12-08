package rest;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ResponseParsing {
	@Test
	public void responseParsing()  {
		Response res= RestAssured.get("https://api.ratesapi.io/api/2010-01-12");
		 RestAssured.given().when().get("https://api.ratesapi.io/api/2010-01-12").then().statusCode(200).statusLine("HTTP/1.1 200 OK").log().all();
		 System.out.println("Finally Response is stored and logged successfully");
	}
}
