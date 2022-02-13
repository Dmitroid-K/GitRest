package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.pojo.RepoSearchData;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class SearchStepdefs {

    List<RepoSearchData> repos;

    @When("Search data is retrieved")
    public void searchDataIsRetrieved() {
        repos = given()
                .log().all()
                .when()
                .get("search/repositories?q=language:java&sort=stars")
                .then()
                .log().all()
                .extract().jsonPath().getList("items", RepoSearchData.class);
    }

    @Then("Repository URLs end with their full names")
    public void repositoryURLsContainTheirFullNames() {
        Assert.assertTrue(repos.stream().allMatch(x->x.getUrl().endsWith(x.getFullName())));

    }

    @And("Repositories are arranged in descending order")
    public void repositoriesAreArrangedInDescendingOrder() {
        List<Integer> rates = repos.stream().map(RepoSearchData::getStargazersCount).collect(Collectors.toList());
        List<Integer> sortedRates = rates.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Assert.assertEquals(rates, sortedRates);
    }
}
