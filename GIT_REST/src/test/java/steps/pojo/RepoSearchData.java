package steps.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RepoSearchData {

    @JsonProperty("stargazers_count")
    private Integer stargazersCount;
    @JsonProperty("full_name")
    private String fullName;
    private String url;


    public RepoSearchData() {
    }

    public RepoSearchData(Integer id, String fullName, String url) {
        this.stargazersCount = id;
        this.fullName = fullName;
        this.url = url;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUrl() {
        return url;
    }

    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
