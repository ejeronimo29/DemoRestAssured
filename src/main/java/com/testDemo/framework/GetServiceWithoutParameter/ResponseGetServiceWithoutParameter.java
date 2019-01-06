package com.testDemo.framework.GetServiceWithoutParameter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseGetServiceWithoutParameter<T> {

    @Expose
    @SerializedName("status")
    private String status;
    @Expose
    @SerializedName("diskSpace")
    private DiskSpace diskSpace;
    @Expose
    @SerializedName("mongo")
    private Mongo mongo;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DiskSpace getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(DiskSpace diskSpace) {
        this.diskSpace = diskSpace;
    }

    public Mongo getMongo() {
        return mongo;
    }

    public void setMongo(Mongo mongo) {
        this.mongo = mongo;
    }
}
