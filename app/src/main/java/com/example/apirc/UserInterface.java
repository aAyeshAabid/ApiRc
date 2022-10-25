package com.example.apirc;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserInterface {
    @GET("users")
    Call<List<model>> getuser();

}
