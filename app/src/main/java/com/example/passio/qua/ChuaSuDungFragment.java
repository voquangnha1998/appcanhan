package com.example.passio.qua;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.passio.R;
import com.example.passio.home.ListViewBaseAdapter;
import com.example.passio.home.ListViewBean;

import java.util.ArrayList;

public class ChuaSuDungFragment extends Fragment {
    Context context;
    View v;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_chuasudung,container,false);

        context = this.getActivity();

        return v;
        ///////


    }



}