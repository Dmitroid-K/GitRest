package steps;

import io.cucumber.java.en.When;
import steps.pojo.RepoCreationData;

import static io.restassured.RestAssured.given;

public class RepositoryStepdefs {

    @When("Post private repo with name {string}")
    public void postRequestForRepo(String repoName) {
        RepoCreationData repoCreationData = new RepoCreationData(repoName, true,true, "nanoc");
        given()
                .body(repoCreationData)
                .log().all()
                .when()
                .post("user/repos")
                .then()
                .log().all();
    }

    @When("Get request for private repo {string} is performed")
    public void getRequestForThePrivateRepo(String repoName) {
        given()
                .log().all()
                .when()
                .get("repos/TestUserNotRealPerson/" + repoName)
                .then()
                .log().all();
    }

    @When("Deleting private repo")
    public void deleteRequest() {
        given()
                .log().all()
                .when()
                .delete("repos/TestUserNotRealPerson/blog")
                .then()
                .log().all();
    }
}
