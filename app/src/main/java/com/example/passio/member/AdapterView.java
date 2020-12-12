package com.example.passio.member;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.passio.order.BanChayFragment;

public class AdapterView extends FragmentStatePagerAdapter {

    public AdapterView(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new GreenFragment();
            case 1:
                return new GreenFragment();
            case 2:
                return new GreenFragment();
            case 3:
                return new GreenFragment();

            default:
                return  new GreenFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){

            case 0:
                title ="Green";
                break;
            case 1:
                title ="Silver";
                break;
            case 2:
                title ="Gold";
                break;
            case 3:
                title ="Platium";
                break;
        }
        return title;
    }
}