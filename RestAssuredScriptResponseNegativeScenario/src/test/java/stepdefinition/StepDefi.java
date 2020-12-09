package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefi {
	
	
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() throws Throwable{
	    System.out.println("The API is https://api.ratesapi.io/api");
	}

	@When("posted with correct Information")
	public void posted_with_correct_information() {
	   System.out.println("Posted with correct information");
	}

	@Then("Validate positive response code recieved")
	public void validate_positive_response_code_recieved() {
		int statusCode=RestAssured.get("https://api.ratesapi.io/api").statusCode();
		if(statusCode==400) {
			RestAssured.given().when().get("https://api.ratesapi.io/api").then().log().all();
			System.out.println("Response logged successfully");
		}
	}

	@Then("store the response into response object")
	public void store_the_response_into_response_object() {
		Response res=RestAssured.get("https://api.ratesapi.io/api");
		System.out.println("Response is stored into response object successfully");
	}

}
