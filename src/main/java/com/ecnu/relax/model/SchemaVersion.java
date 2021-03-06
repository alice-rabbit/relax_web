package com.ecnu.relax.model;

import java.util.Date;

public class SchemaVersion {
    private String version;

    private Integer versionRank;

    private Integer installedRank;

    private String description;

    private String type;

    private String script;

    private Integer checksum;

    private String installedBy;

    private Date installedOn;

    private Integer executionTime;

    private Boolean success;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getVersionRank() {
        return versionRank;
    }

    public void setVersionRank(Integer versionRank) {
        this.versionRank = versionRank;
    }

    public Integer getInstalledRank() {
        return installedRank;
    }

    public void setInstalledRank(Integer installedRank) {
        this.installedRank = installedRank;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script == null ? null : script.trim();
    }

    public Integer getChecksum() {
        return checksum;
    }

    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }

    public String getInstalledBy() {
        return installedBy;
    }

    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy == null ? null : installedBy.trim();
    }

    public Date getInstalledOn() {
        return installedOn;
    }

    public void setInstalledOn(Date installedOn) {
        this.installedOn = installedOn;
    }

    public Integer getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}