package com.example.android.foodordering.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Princess on 1/20/2018.
 */

public class RestaurantsResponse {

    @SerializedName("address")
    private List<String> address = new ArrayList<String>();
    @SerializedName("restaurants")
    private List<Restaurants> restaurants;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public List<Restaurants> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurants> restaurants) {
        this.restaurants = restaurants;
    }
}
