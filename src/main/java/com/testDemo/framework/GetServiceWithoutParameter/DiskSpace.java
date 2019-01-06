package com.testDemo.framework.GetServiceWithoutParameter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DiskSpace<T> {
    @Expose
    @SerializedName("status")
    private String status;
    @Expose
    @SerializedName("total")
    private String total;
    @Expose
    @SerializedName("free")
    private String free;
    @Expose
    @SerializedName("threshold")
    private String threshold;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }
}
