package com.testDemo.framework.PostServicesWithParameter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Transaction<T>
{
    @Expose
    @SerializedName("storeID")
    private String storeID;
    @Expose
    @SerializedName("transactionID")
    private String transactionID;
    @Expose
    @SerializedName("time")
    private String time;
    @Expose
    @SerializedName("amount")
    private double amount;
    @Expose
    @SerializedName("currency")
    private String currency;
    @Expose
    @SerializedName("items")
    private int items;


    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }
}