package com.testDemo.framework.PostServiceWithoutParameter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponsePostServiceWithoutParameter {

    @Expose
    @SerializedName("timestamp")
    private int timestamp;
    @Expose
    @SerializedName("status")
    private int status;
    @Expose
    @SerializedName("error")
    private String error;
    @Expose
    @SerializedName("exception")
    private String exception;
    @Expose
    @SerializedName("message")
    private String message;
    @Expose
    @SerializedName("path")
    private String path;


    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
