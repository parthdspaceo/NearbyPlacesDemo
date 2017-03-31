package com.parthdave.nearbysearch.networking;

import com.parthdave.nearbysearch.model.NearByApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Parth Dave on 31/3/17.
 * Spaceo Technologies Pvt Ltd.
 * parthd.spaceo@gmail.com
 */

public interface NearByApi {
    
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyCe0L2pON1GBKGzTCYu6-T2d2cbt-OlHNo")
    Call<NearByApiResponse> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);
}
