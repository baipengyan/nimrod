package com.gioov.nimrod.common.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2018-02-22
 */
@Component
@ConfigurationProperties(prefix = "nimrod", ignoreUnknownFields = true, ignoreInvalidFields = true)
public class NimrodProperties {

    private String version = "0.6.5";
    private String url = "https://github.com/godcheese/nimrod";

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
