package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.json.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assignment {

	Response res;
	RequestSpecification request; 
	String BASE_URL="https://reqres.in/";

	@Given("Get List of user API")
	public void get_list_of_user_api() {
		System.out.println("Get user list");
		
	}

	@When("Enter different value in page number {int}")
	public void provide_different_values_to_page_number(Integer int1) {
		System.out.println("Current page no:" +int1);
		RestAssured.baseURI=BASE_URL;
		request=RestAssured.given().header("Content-Type","application/json");
        //res=httpReq.request(Method.GET);
     	res= request.get("api/users?page="+int1);
        }

	@Then("status code should be {int}")
	public void status_code_equals(Integer int1) {
		System.out.println("Stauscode is:"+res.getStatusCode());
		assertEquals(res.getStatusCode(), +int1);
		}

	@Given("Create new user")
	public void post_api_for_adding_new_user() {
		System.out.println("Create new User");
	 	}

	@When("Enter Username as {string} and Job as {string}")
	public void username_and_job(String string1, String string2) {
	   	RestAssured.baseURI=BASE_URL;
	   	JSONObject requestparams = new JSONObject();
	   	requestparams.put("name", string1);
		requestparams.put("job", string2);
		request=RestAssured.given();
		request.body(requestparams);
		res= request.post("api/users");
		System.out.println("Name: " + requestparams.get("name"));
		System.out.println("job: " + requestparams.get("job"));
	}
	
	@Given("Update existing user")
	public void put_api_for_updating_existing_user() {
		System.out.println("Update existing user");
	}

	@When("Update Userid: {int} with username: {string} and Job: {string}")
	public void updating_userid_with_username_and_job(Integer int1, String string1, String string2) {
	 	RestAssured.baseURI=BASE_URL;
	 	JSONObject requestparams = new JSONObject();
	   	requestparams.put("name", string1);
		requestparams.put("job", string2);
		request=RestAssured.given();
		request.body(requestparams);
     	res= request.put("api/users/"+int1);
     	System.out.println("Name: " + requestparams.get("name"));
		System.out.println("job: " + requestparams.get("job"));
	}
	
	@Given("Delete User")
	public void delete_api_for_deleting_user() {
		System.out.println("Delete User");
	}

	@When("Delete UserID {int}")
	public void user_id_to_be_deleted(Integer int1) {
	 	RestAssured.baseURI=BASE_URL;
		Header acceptHeader = new Header("Content-Type","application/json");
		request=RestAssured.given().header(acceptHeader);
        System.out.println("User id: "+int1);
     	res= request.delete("api/users"+int1);
	}

	@Then("Verify response")
	public void response_contains_valid_data() {
		res.getBody().prettyPrint();
	}
}
