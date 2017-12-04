package com.example.monirah.masijed;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Monirah on 28/11/17.
 */
public interface User {
    /*@GET("/mosques/DawaActivity.jsp")

    Call<List<ResponceServer>> Region(@Query("Region") String Region);
        */
//where=Region = 1 and City_Village = N'الرياض 'AND District = N'الربوة'
    //    Call doGetUserList(@Query("page") String page);

    @GET("/mosques/DawaActivity.jsp?")
   // Call<List<ResponceServer>> Region(@Query("Region") String Region);
        Call <List<ResponceServer>> Region(@Query("Region") String Region , @Query("City_Village") String City_Village,@Query("District") String District );

    //@GET("/mosques/DawaActivity.jsp?")
    //Call<ResponceServer> getMovieDetails(@Path("id") String id, @Query("Region") String Region);
   }
