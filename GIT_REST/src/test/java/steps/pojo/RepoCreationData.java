package steps.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RepoCreationData {

    private String name;
    @JsonProperty("auto_init")
    private Boolean autoInit;
    @JsonProperty("private")
    private Boolean ifPrivate;
    @JsonProperty("gitignore_template")
    private String gitignoreTemplate;

    public void setName(String name) {
        this.name = name;
    }

    public void setAutoInit(Boolean autoInit) {
        this.autoInit = autoInit;
    }

    public void setIfPrivate(Boolean ifPrivate) {
        this.ifPrivate = ifPrivate;
    }

    public void setGitignoreTemplate(String gitignoreTemplate) {
        this.gitignoreTemplate = gitignoreTemplate;
    }

    public String getName() {
        return name;
    }

    public Boolean getAutoInit() {
        return autoInit;
    }

    public Boolean getIfPrivate() {
        return ifPrivate;
    }

    public String getGitignoreTemplate() {
        return gitignoreTemplate;
    }

    public RepoCreationData() {
    }

    public RepoCreationData(String name, Boolean autoInit, Boolean ifPrivate, String gitignoreTemplate) {
        this.name = name;
        this.autoInit = autoInit;
        this.ifPrivate = ifPrivate;
        this.gitignoreTemplate = gitignoreTemplate;
    }
}
