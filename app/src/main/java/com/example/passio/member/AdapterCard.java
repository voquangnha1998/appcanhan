package com.example.passio.member;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.passio.R;

import java.util.ArrayList;

public class AdapterCard extends BaseAdapter {
    public ArrayList<BeanCard> arrayingListener;
    Context mContext;


    public AdapterCard(ArrayList<BeanCard> mListenerList, Context context) {
        mContext = context;
        this.arrayingListener = new ArrayList<BeanCard>();
        this.arrayingListener =mListenerList;
    }

    public class ViewHolder {
        ImageView mItemPic;
        TextView mLangName;
        TextView mHansudung;
    }

    @Override
    public int getCount() {
        return arrayingListener.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayingListener.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.row_coupon, null);
            holder = new ViewHolder();
            holder.mItemPic = (ImageView) view.findViewById(R.id.img);
            holder.mLangName=(TextView)view.findViewById(R.id.name);
            holder.mHansudung=(TextView)view.findViewById(R.id.hansudung);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

        }
        try {
            int image = arrayingListener.get(position).getImage();
            holder.mItemPic.setImageResource(image);
            holder.mLangName.setText(arrayingListener.get(position).getLangName());
        }catch (Exception ex){


        }

        return view;
    }

}
