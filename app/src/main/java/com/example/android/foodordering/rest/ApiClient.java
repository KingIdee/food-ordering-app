package com.example.android.foodordering.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Princess on 1/20/2018.
 */

public class ApiClient {

    private static final String BASE_URL = " https://api.eatstreet.com";
    private static Retrofit retrofit = null;

    public static Retrofit getCLient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
