package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ShoppingPlacesFragment extends Fragment {


    public ShoppingPlacesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_shopping_places, container, false);



        TextView t1 = (TextView)view.findViewById(R.id.commercial_street_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), acivity_shoppingPlaces_commercial_street.class);
                startActivity(i1);
            }
        });



        TextView t2 = (TextView)view.findViewById(R.id.Forum_mall_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), activity_shoppingPlaces_forum_mall.class);
                startActivity(i2);
            }
        });




        TextView t3 = (TextView)view.findViewById(R.id.national_market_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), activity_shoppingPlaces_national_market.class);
                startActivity(i3);
            }
        });



        TextView t4 = (TextView)view.findViewById(R.id.Safina_Plaza_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), activity_shoppingPlaces_Safina_Plaza.class);
                startActivity(i4);
            }
        });



        TextView t5 = (TextView)view.findViewById(R.id.cauvery_handicrafts_emporium_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), activity_shoppingPlaces_cauvery_handicrafts_emporium.class);
                startActivity(i5);
            }
        });




        return view;
    }


}
