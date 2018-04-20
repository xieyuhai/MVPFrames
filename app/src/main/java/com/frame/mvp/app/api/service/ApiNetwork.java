package com.frame.mvp.app.api.service;

import com.frame.mvp.entity.User;
import com.tool.common.http.ResponseEntity;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiNetwork {

    @FormUrlEncoded
    @POST("xxxxxxxx")
    Call<ResponseEntity<User>> login(@Field("username") String username, @Field("password") String password);

    @FormUrlEncoded
    @POST("index.php?m=member&c=api&a=do_login")
    Observable<ResponseEntity<User>> rxLogin(@Field("username") String username, @Field("password") String password);
}