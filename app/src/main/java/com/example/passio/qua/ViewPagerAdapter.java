package com.example.passio.qua;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new ChuaSuDungFragment();
            case 1:
                return new ChuaSuDungFragment();
            case 2:
                return new ChuaSuDungFragment();
            default:
                return  new ChuaSuDungFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){

            case 0:
                title ="Chưa sử dụng";
                break;
            case 1:
                title ="Đã sử dụng";
                break;
            case 2:
                title ="Đã hết hạn";
                break;
        }
        return title;
    }
}