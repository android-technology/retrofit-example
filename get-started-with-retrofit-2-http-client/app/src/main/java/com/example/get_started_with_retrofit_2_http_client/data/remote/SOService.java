package com.example.get_started_with_retrofit_2_http_client.data.remote;

import com.example.get_started_with_retrofit_2_http_client.data.model.AnswerResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SOService {
    @GET("answers?order=desc&sort=activity&site=stackoverflow")
    Call<AnswerResponse> getAnswers();

    // https://api.stackexchange.com/2.2/answers?order=desc&sort=activity&site=stackoverflow&tagged=android
    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<List<AnswerResponse>> getAnswers(@Query("tagged") String tags);
}
