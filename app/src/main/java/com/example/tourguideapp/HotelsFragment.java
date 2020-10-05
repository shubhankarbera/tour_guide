package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HotelsFragment extends Fragment {

    public HotelsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotels, container, false);



        TextView t1 = (TextView)view.findViewById(R.id.taj_vivanta_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), activity_Hotels_taj_vivanta.class);
                startActivity(i1);
            }
        });




        TextView t2 = (TextView)view.findViewById(R.id.ritz_carlton_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), activity_hotels_Ritz_Carlton.class);
                startActivity(i2);
            }
        });





        TextView t3 = (TextView)view.findViewById(R.id.sheraton_grand_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), activity_Hotels_sheraton_grand.class);
                startActivity(i3);
            }
        });



        TextView t4 = (TextView)view.findViewById(R.id.the_leela_palace_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), activity_Hotels_the_leela_palace.class);
                startActivity(i4);
            }
        });



        TextView t5 = (TextView)view.findViewById(R.id.conrad_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), activity_hotels_conrad.class);
                startActivity(i5);
            }
        });





        return view;
    }


}
