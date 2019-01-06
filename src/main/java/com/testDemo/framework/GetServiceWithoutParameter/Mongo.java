package com.testDemo.framework.GetServiceWithoutParameter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mongo<T> {
    @Expose
    @SerializedName("status")
    private String status;
    @Expose
    @SerializedName("version")
    private String version;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
