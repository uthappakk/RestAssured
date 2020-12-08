package rest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResponseStatusCod {
	@Test
	public void responseStautsCode()  {
		Response response;
		response = RestAssured.get("https://api.ratesapi.io/api/2010-01-12");	    
	    int statusCode = response.getStatusCode();
	    Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/);
	    Assert.assertNotEquals(statusCode, 400);
	    System.out.println("Finally the status response code is validated using two assertions");
	}
}
