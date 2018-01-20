package com.example.android.foodordering.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.foodordering.R;
import com.example.android.foodordering.models.Restaurants;

import java.util.List;

/**
 * Created by Princess on 1/19/2018.
 */

public class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.RestaurantsViewHolder> {

    private Context context;
    private List<Restaurants> restaurantsList;
    private final ListItemClickListener listItemClickListener;

    public RestaurantsAdapter(Context context, List<Restaurants> restaurantsList, ListItemClickListener listItemClickListener) {
        this.context = context;
        this.restaurantsList = restaurantsList;
        this.listItemClickListener = listItemClickListener;
    }

    @Override
    public RestaurantsAdapter.RestaurantsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurants_list, parent, false);
        return new RestaurantsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RestaurantsAdapter.RestaurantsViewHolder holder, int position) {
        Restaurants logo = restaurantsList.get(position);
        String logo_url = logo.getRestaurantLogo();
        Glide.with(context)
                .load(logo_url)
                .into(holder.logoView);
    }

    @Override
    public int getItemCount() {
        if(restaurantsList == null)
            return 0;
        return restaurantsList.size();
    }

    public interface ListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }

    public class RestaurantsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView logoView;
        TextView restaurantName;


        public RestaurantsViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            logoView = (ImageView) itemView.findViewById(R.id.restaurant_logo);
            restaurantName = (TextView) itemView.findViewById(R.id.restaurant_name);

        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            listItemClickListener.onListItemClick(clickedPosition);
        }
    }
}
