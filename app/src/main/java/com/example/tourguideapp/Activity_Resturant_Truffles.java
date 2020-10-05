package com.example.tourguideapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Activity_Resturant_Truffles extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId())
        {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__resturant__truffles);

        ImageView i1 = (ImageView)findViewById(R.id.call_icon_image);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Intent.ACTION_DIAL);
                i1.setData(Uri.parse("tel: 080 4153 6565"));
                if(i1.resolveActivity(getPackageManager()) != null) {
                    startActivity(i1);
                }
            }
        });

        ImageView i2 = (ImageView)findViewById(R.id.web_search_image);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "http://truffles.co.in/";
                Intent i2 = new Intent(Intent.ACTION_WEB_SEARCH);
                i2.putExtra(SearchManager.QUERY, info);
                if (i2.resolveActivity(getPackageManager()) != null) {
                    startActivity(i2);
                }
            }
        });

        ImageView i3 = (ImageView)findViewById(R.id.google_map_search_image);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Truffles/@12.9336352,77.614235,15z/data=!4m5!3m4!1s0x0:0x6297032c180f2bbd!8m2!3d12.9336352!4d77.614235");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if(mapIntent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(mapIntent);
                }

            }
        });



        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
