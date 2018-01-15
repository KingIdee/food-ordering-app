package com.example.android.foodordering.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.foodordering.R;
import com.example.android.foodordering.views.RestaurantsActivity;

public class OnBoadingActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boading);

        textView = (TextView) findViewById(R.id.splash_screen_tv);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/ShortStack-Regular.ttf");
        textView.setTypeface(custom_font);

        button = (Button) findViewById(R.id.splash_button);
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/ShortStack-Regular.ttf");
        button.setTypeface(custom_font1);
    }

    public void entryButton(View view) {
        Intent intent = new Intent(this, RestaurantsActivity.class);
        startActivity(intent);
    }
}
