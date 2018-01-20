package com.example.android.foodordering.fragments;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.foodordering.R;
import com.example.android.foodordering.adapters.FoodAdapter;
import com.example.android.foodordering.models.Restaurants;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

/**
 * A placeholder fragment containing a simple view.
 */
public class RestaurantDetailActivityFragment extends Fragment {

    public RestaurantDetailActivityFragment() {
    }

    private static ViewPager viewPager;
    private static  int currentPage = 0;
    private int index = 0;
    private ArrayList<Restaurants> restaurants;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_detail, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.pager);
        viewPager.setAdapter(new FoodAdapter(getActivity(), restaurants));
        CircleIndicator circleIndicator = (CircleIndicator) view.findViewById(R.id.indicator);
        circleIndicator.setViewPager(viewPager);

        //Auto start of viewpager
//        final Handler handler = new Handler();
//        final Runnable Update = new Runnable() {
//            public void run() {
//                if (currentPage == ) {
//                    currentPage = 0;
//                }
//                viewPager.setCurrentItem(currentPage++, true);
//            }
//        };
//        Timer swipeTimer = new Timer();
//        swipeTimer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                handler.post(Update);
//            }
//        }, 2500, 2500);

        return view;
    }

}
