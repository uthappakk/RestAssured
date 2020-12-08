package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefinition {
		Response res=RestAssured.get("https://api.ratesapi.io/api/2010-01-12");
		@Given("^API for foreign Exchange$")
		public void api_for_foreign_exchange()  {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("The API is https://api.ratesapi.io/api/2010-01-12");
		    //throw new io.cucumber.java.PendingException();
		}

		@When("^posted with correct information$")
		public void posted_with_correct_information()  {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println(res.getBody().asString());
		    //throw new io.cucumber.java.PendingException();
		    
		}
		
		@Then("^validate positive response code recieved$")
		public void validate_positive_response_code_recieved()  {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println(res.getStatusCode());
		    //throw new io.cucumber.java.PendingException();
		}



}
