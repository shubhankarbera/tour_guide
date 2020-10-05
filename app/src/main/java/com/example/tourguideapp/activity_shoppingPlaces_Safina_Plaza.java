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

public class activity_shoppingPlaces_Safina_Plaza extends AppCompatActivity {

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
        setContentView(R.layout.activity_shopping_places__safina_plaza);

        ImageView i1 = (ImageView)findViewById(R.id.call_icon_image);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Intent.ACTION_DIAL);
                i1.setData(Uri.parse("tel: 080 2559 8882 "));
                if(i1.resolveActivity(getPackageManager()) != null) {
                    startActivity(i1);
                }
            }
        });

        ImageView i2 = (ImageView)findViewById(R.id.web_search_image);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmaps.mapmyindia.com%2Fplace-safina%2Bplaza%2Binfantry%2Broad-shivaji%2Bnagar%2Bbengaluru-CS1C34%40RRzdata%3DMTIuOTc5MzYwKzc3LjYwNjg0NisxNytDUzFDMzQ%3Ded&psig=AOvVaw33T-BQQzXkpj0B6uAlJ3iE&ust=1601997631560000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIDmv7HgnewCFQAAAAAdAAAAABAD";
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
                Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Safina+Plaza/@12.979628,77.606999,15z/data=!4m5!3m4!1s0x0:0x8ec3f41f664e9f8d!8m2!3d12.979628!4d77.606999");
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
