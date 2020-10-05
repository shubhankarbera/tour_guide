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
import android.widget.Toast;

public class Activity_Resturant_Absolute_Barbecue extends AppCompatActivity {


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
        setContentView(R.layout.activity__resturant__absolute_barbecue);

        ImageView i1 = (ImageView)findViewById(R.id.call_icon_image);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity_Resturant_Absolute_Barbecue.this,"ALERT!.\n This is an IN_EQUIRY number", Toast.LENGTH_LONG).show();
                Intent i1 = new Intent(Intent.ACTION_DIAL);
                i1.setData(Uri.parse("tel: 073373 36712 "));
                if(i1.resolveActivity(getPackageManager()) != null) {
                    startActivity(i1);
                }
            }
        });

        ImageView i2 = (ImageView)findViewById(R.id.web_search_image);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "https://www.absolutebarbecues.com/";
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
                Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/21.2372225,81.6541913/ABSOLUTE+BARBEQUE+bangalore/@17.0495272,75.1214292,6z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3bae13caaa6d13bb:0x2a73a4f1aca33551!2m2!1d77.6991266!2d12.9498301");
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
