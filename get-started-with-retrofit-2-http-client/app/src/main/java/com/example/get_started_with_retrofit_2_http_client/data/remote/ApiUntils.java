package com.example.get_started_with_retrofit_2_http_client.data.remote;

public class ApiUntils {
    private static final String BASE_URL = "https://api.stackexchange.com/2.2/";
    public static SOService getSOService(){
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
