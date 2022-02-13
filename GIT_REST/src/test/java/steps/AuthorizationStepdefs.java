package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class AuthorizationStepdefs {

    public static ValidatableResponse response;

    @When("Get request for user private page is performed")
    public void getRequestForUserPrivatePageIsPerformed() {
        response = given()
                .log().all()
                .when()
                .get("user")
                .then().log().all();
    }

    @And("Entered as {string}")
    public void enteredAs(String userName) {
        response.body("login", equalTo(userName));
    }
}
