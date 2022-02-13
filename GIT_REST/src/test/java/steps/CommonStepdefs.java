package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;

public class CommonStepdefs {

    public static final String URL = "https://api.github.com/";

    @Given("User is authorized")
    public void userHasAToken() {
        RestAssured.requestSpecification = null;
        RestAssured.requestSpecification = Specifications.requestSpecAuthorized(URL);
    }

    @Given("User is not authorized")
    public void userHasNoToken(){
        RestAssured.requestSpecification = null;
        RestAssured.requestSpecification = Specifications.requestSpec(URL);
    }

    @Then("Response code is {int}")
    public void responseCodeIs(int code) {
        RestAssured.responseSpecification = null;
        RestAssured.responseSpecification = Specifications.responseSpec(code);
    }
}
