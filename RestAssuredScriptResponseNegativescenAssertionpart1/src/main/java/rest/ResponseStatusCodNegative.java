package rest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResponseStatusCodNegative {
	@Test
	public void responseStautsCode()  {
		Response response;
		response = RestAssured.get("https://api.ratesapi.io/api");	    
	    int statusCode = response.getStatusCode();
	    Assert.assertEquals(statusCode /*actual value*/, 400 /*expected value*/);
	    Assert.assertNotEquals(statusCode, 200);
	    System.out.println("Finally the status response code for negative scenario is validated using two assertions");
	}
}
