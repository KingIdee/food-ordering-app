package com.example.android.foodordering.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.foodordering.R;
import com.example.android.foodordering.models.Restaurants;

import java.util.ArrayList;

/**
 * Created by Princess on 1/19/2018.
 */

public class FoodAdapter extends PagerAdapter {

    private LayoutInflater inflater;
    private Context context;
    private ArrayList<Restaurants> foodList;


    public FoodAdapter(Context context, ArrayList<Restaurants> foodList) {
        this.context = context;
        this.foodList = foodList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View myCardLayout = inflater.inflate(R.layout.food_lists, view, false);
        ImageView myImage = (ImageView) myCardLayout.findViewById(R.id.food_list);

        String image_url = foodList.get(position).getRestaurantUrl();
        Glide.with(context)
                .load(image_url)
                .into(myImage);
        view.addView(myCardLayout, 0);

        TextView foodName = (TextView) myCardLayout.findViewById(R.id.food_name);
        foodName.setText((CharSequence) foodList.get(position).getFoodTypes());
        return myCardLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}
