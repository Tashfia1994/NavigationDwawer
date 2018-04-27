package com.tashfia.navigationdwawer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyMenuFragment extends Fragment {

    Button btnclick;
    public MyMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_my_menu, container, false);
        btnclick=(Button)v.findViewById(R.id.button);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),DetailsActivity.class);//getactivity = choose default activity because it is a fharment cant use this activity
                startActivity(intent);
            }
        });

    return  v;

    }

}
