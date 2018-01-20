package com.example.android.foodordering.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Princess on 1/19/2018.
 */

public class Restaurants {

    @SerializedName("apiKey")
    private String apiKey;
    @SerializedName("logoUrl")
    private String restaurantLogo;
    @SerializedName("name")
    private String restaurantName;
    @SerializedName("streetAddress")
    private String address;
    @SerializedName("city")
    private String city;
    @SerializedName("state")
    private String state;
    @SerializedName("foodTypes")
    private List<Integer> foodTypes = new ArrayList<Integer>();
    @SerializedName("open")
    private Boolean open;
    @SerializedName("url")
    private String restaurantUrl;

    public Restaurants(String apiKey, String restaurantLogo, String restaurantName, String address, String city, String state, List<Integer> foodTypes, Boolean open, String restaurantUrl) {
        this.apiKey = apiKey;
        this.restaurantLogo = restaurantLogo;
        this.restaurantName = restaurantName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.foodTypes = foodTypes;
        this.open = open;
        this.restaurantUrl = restaurantUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String restaurantLogo) {
        this.apiKey = apiKey;
    }


    public String getRestaurantLogo() {
        return restaurantLogo;
    }

    public void setRestaurantLogo(String restaurantLogo) {
        this.restaurantLogo = restaurantLogo;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Integer> getFoodTypes() {
        return foodTypes;
    }

    public void setFoodTypes(List<Integer> foodTypes) {
        this.foodTypes = foodTypes;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public String getRestaurantUrl() {
        return restaurantUrl;
    }

    public void setRestaurantUrl(String restaurantUrl) {
        this.restaurantUrl = restaurantUrl;
    }
}
