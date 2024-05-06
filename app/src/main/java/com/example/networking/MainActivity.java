package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        List<Mountain> mountains = new ArrayList<Mountain>();
       // mountains.add(new Mountain("Alp","France", R.drawable.a));
        // mountains.add(new Mountain("zero","Sweden",R.drawable.b));
        // mountains.add(new Mountain("One","Germany",R.drawable.f));
        // mountains.add(new Mountain("Two","",R.drawable.d));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),mountains));

        new JsonFile(this, this).execute(JSON_FILE);
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", ""+json);
        Gson gson = new Gson();
        Type type = new TypeToken<List<Mountain>>(){}.getType();
         List<Mountain> mountains= gson.fromJson(json, type);

         RecyclerView recyclerView = findViewById(R.id.recycler_view);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));
         recyclerView.setAdapter(new MyAdapter(getApplicationContext(), mountains));

    }
    private void getJson() {
        new JsonFile(this, this).execute(JSON_FILE);
    }

}
