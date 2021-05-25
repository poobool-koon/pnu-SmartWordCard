package com.example.swordcard;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.List;

public class WordListActivity extends AppCompatActivity {
    public Button btn;
    public Button btn2;
    public ListView listview;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordlist);

        btn = (Button)findViewById(R.id.Close);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
/*
        btn2 = (Button)findViewById(R.id.query);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println("hello");
            }
        });
*/
        System.out.println("Works");
        WordModule wordModule = new WordModule(this);
        List<WordEntry> test_list = wordModule.getAllWords();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, test_list);
        listview = (ListView)findViewById(R.id.wordlist);
        listview.setAdapter(adapter);

//        volley();
    }
    void volley(){
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="127.0.0.1:80";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        System.out.println("VOLLEY:: Response is: "+ response.substring(0,500));
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("VOLLEY:: WRONG WORKS");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}