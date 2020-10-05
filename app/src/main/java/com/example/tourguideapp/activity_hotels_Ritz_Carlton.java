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

public class activity_hotels_Ritz_Carlton extends AppCompatActivity {

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
        setContentView(R.layout.activity_hotels__ritz_carlton);

        ImageView i1 = (ImageView)findViewById(R.id.call_icon_image);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Intent.ACTION_DIAL);
                i1.setData(Uri.parse("tel:(080 4914 8000 "));
                if(i1.resolveActivity(getPackageManager()) != null) {
                    startActivity(i1);
                }
            }
        });

        ImageView i2 = (ImageView)findViewById(R.id.web_search_image);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "https://www.ritzcarlton.com/en/hotels/india/bangalore?scid=bb1a189a-fec3-4d19-a255-54ba596febe2&y_source=1_MzgxMzg2OC03MTUtbG9jYXRpb24uZ29vZ2xlX3dlYnNpdGVfb3ZlcnJpZGU%3D";
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
                Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/The+Ritz-Carlton,+Bangalore/@12.9679703,77.6016427,15z/data=!4m2!3m1!1s0x0:0xfe8ae8000ba8c87f?sa=X&ved=2ahUKEwiiq-3c-53sAhVCX30KHXNABacQ_BIwH3oECCEQBQ");
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
