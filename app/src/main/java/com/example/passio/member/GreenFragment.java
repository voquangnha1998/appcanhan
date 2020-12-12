package com.example.passio.member;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.passio.R;
import com.example.passio.order.GirdViewBaseAdapter;
import com.example.passio.order.GirdViewBean;

import java.util.ArrayList;

public class GreenFragment extends Fragment {
    Context context;
    View v;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_green,container,false);

        context = this.getActivity();

        return v;
        ///////


    }


}