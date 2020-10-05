package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ResturantFragment extends Fragment {


    public ResturantFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resturant, container, false);



        TextView t1 = (TextView)view.findViewById(R.id.truffles_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Activity_Resturant_Truffles.class);
                startActivity(i1);
            }
        });



        TextView t2 = (TextView)view.findViewById(R.id.byg_brewski_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), Activity_Resturant_Byg_Brewski.class);
                startActivity(i2);
            }
        });



        TextView t3 = (TextView)view.findViewById(R.id.airlines_hotel_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), Activity_Resturant_Airlines_Hotel.class);
                startActivity(i3);
            }
        });



        TextView t4 = (TextView)view.findViewById(R.id.windmill_craftworks_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), Activity_Resturant_windmill_craftworks.class);
                startActivity(i4);
            }
        });



        TextView t5 = (TextView)view.findViewById(R.id.absolute_barbecue_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), Activity_Resturant_Absolute_Barbecue.class);
                startActivity(i5);
            }
        });





        return view;
    }

}
