package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MobileVersionCheck implements Serializable {

    private static final long serialVersionUID = -2273464833455803057L;

    @JsonProperty("status")
    private String status; //Will be "ok" if the app does not need to be updated.

    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("os_version_number")
    private int osVersionNumber;

    @JsonProperty("force_upgrade")
    private boolean forceUpgrade;

    @JsonProperty("platform")
    private String platform;

    @JsonProperty("custom_message")
    private String customMessage;

    @JsonProperty("upgrade_url")
    private String upgradeUrl;

    @JsonProperty("version_number")
    private int versionNumber;

    @JsonProperty("error")
    private String error;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public int getOsVersionNumber() {
        return osVersionNumber;
    }

    public void setOsVersionNumber(int osVersionNumber) {
        this.osVersionNumber = osVersionNumber;
    }

    public boolean isForceUpgrade() {
        return forceUpgrade;
    }

    public void setForceUpgrade(boolean forceUpgrade) {
        this.forceUpgrade = forceUpgrade;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    public String getUpgradeUrl() {
        return upgradeUrl;
    }

    public void setUpgradeUrl(String upgradeUrl) {
        this.upgradeUrl = upgradeUrl;
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
