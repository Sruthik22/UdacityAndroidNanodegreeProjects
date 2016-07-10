package com.example.android.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button popular_movies, stock_hawk, build_it_bigger, make_your_app_material, go_ubiquitous, capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popular_movies = (Button) findViewById(R.id.popular_movies);
        popular_movies.setOnClickListener(this);

        stock_hawk = (Button) findViewById(R.id.stock_hawk);
        stock_hawk.setOnClickListener(this);

        build_it_bigger = (Button) findViewById(R.id.build_it_bigger);
        build_it_bigger.setOnClickListener(this);

        make_your_app_material = (Button) findViewById(R.id.make_your_app_material);
        make_your_app_material.setOnClickListener(this);

        go_ubiquitous = (Button) findViewById(R.id.popular_movies);
        go_ubiquitous.setOnClickListener(this);

        capstone = (Button) findViewById(R.id.capstone);
        capstone.setOnClickListener(this);
    }

    private void showToastMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.popular_movies:
                showToastMessage("This button will launch my popular movies app!");
                break;

            case R.id.stock_hawk:
                showToastMessage("This button will launch my stock hawk app!");
                break;

            case R.id.build_it_bigger:
                showToastMessage("This button will launch my build it bigger app!");
                break;

            case R.id.make_your_app_material:
                showToastMessage("This button will launch my make your app material app!");
                break;
            case R.id.go_ubiquitous:
                showToastMessage("This button will launch my go ubiquitous app!");
                break;
            case R.id.capstone:
                showToastMessage("This button will launch my capstone app!");
                break;
        }

    }
}
