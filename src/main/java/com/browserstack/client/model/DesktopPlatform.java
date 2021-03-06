package com.browserstack.client.model;


import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DesktopPlatform extends Platform {

    @JsonProperty("os_version")
    private String osVersion;

    @JsonProperty("browsers")
    private List<Browser> browsers = new ArrayList<>();

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * @return The osVersion
     */
    @JsonProperty("os_version")
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * @param osVersion The os_version
     */
    @JsonProperty("os_version")
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * @return The browsers
     */
    @JsonProperty("browsers")
    public List<Browser> getBrowsers() {
        return browsers;
    }

    /**
     * @param browsers The browsers
     */
    @JsonProperty("browsers")
    public void setBrowsers(List<Browser> browsers) {
        this.browsers = browsers;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
