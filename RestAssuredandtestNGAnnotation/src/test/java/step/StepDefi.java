package step;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefi {
	Response res;
	
	@DataProvider(name="Date")
	public Object[][] provider(){
		Object[][] data=new Object[2][3];
		data[0][0]="2015";
		data[0][1]="09";
		data[0][2]="17";
		
		data[1][0]="2019";
		data[1][1]="11";
		data[1][2]="10";
		return data;
	}
	
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	    RestAssured.baseURI="https://api.ratesapi.io";
	}

	@Test(dataProvider="Date")
	@When("posted with correct information")
	public void posted_with_correct_information(String year,String mon,String day) {
	    res=RestAssured.get("/api/"+year+"-"+mon+"-"+day);
	}

	@Test
	@Then("Validate positive response code recieved")
	public void validate_positive_response_code_recieved() {
	    int statusCode=res.getStatusCode();
	    System.out.println(statusCode);
	    assertEquals(statusCode,200);
	    
	    String statusLine=res.getStatusLine();
	    System.out.println(statusLine);
	    assertEquals(statusLine,"HTTP/1.1 200 OK");
	}


}
