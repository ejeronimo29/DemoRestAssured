package com.testDemo.framework.GetServiceWithParameter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data<T> {
    @Expose
    @SerializedName("message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
