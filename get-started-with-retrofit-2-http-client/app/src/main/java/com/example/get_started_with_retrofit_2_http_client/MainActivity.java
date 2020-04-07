package com.example.get_started_with_retrofit_2_http_client;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.get_started_with_retrofit_2_http_client.adapter.AnswersAdapter;
import com.example.get_started_with_retrofit_2_http_client.data.model.AnswerResponse;
import com.example.get_started_with_retrofit_2_http_client.data.model.Item;
import com.example.get_started_with_retrofit_2_http_client.data.remote.ApiUntils;
import com.example.get_started_with_retrofit_2_http_client.data.remote.SOService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private AnswersAdapter answersAdapter;
    private RecyclerView mRecyclerView;
    private SOService mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mService = ApiUntils.getSOService();
        mRecyclerView = findViewById(R.id.my_recycler_view);
//        answersAdapter = new AnswersAdapter(this, new ArrayList<Item>(0), new AnswersAdapter.PostItemListener() {
//            @Override
//            public void onPostClick(long id) {
//                Toast.makeText(MainActivity.this, "Post id is" + id, Toast.LENGTH_LONG).show();
//            }
//        });
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(layoutManager);
//        mRecyclerView.setAdapter(answersAdapter);
//        mRecyclerView.setHasFixedSize(true);
//        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);
//        mRecyclerView.addItemDecoration(itemDecoration);

        loadAnswers();
    }

    private void loadAnswers() {
        mService.getAnswers().enqueue(new Callback<AnswerResponse>() {
            @Override
            public void onResponse(Call<AnswerResponse> call, Response<AnswerResponse> response) {
                if (response.isSuccessful()) {
//                    answersAdapter.updateAnswers(response.body().getItems());
                    Log.d("MainActivity", "post loaded from API" + response.body().getItems());
                } else {
                    int statusCode = response.code();
                }
            }

            @Override
            public void onFailure(Call<AnswerResponse> call, Throwable t) {
                showErrorMessage();
                Log.d("MainActivity", "error loading from API");
            }
        });
    }

    public void showErrorMessage() {
        Toast.makeText(this, "Error loading posts", Toast.LENGTH_LONG).show();
    }
}
