package com.example.android.tourguide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.tourguide.EventsFragment;
import com.example.android.tourguide.R;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView (R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace (R.id.text_container, new EventsFragment ())
                .commit();
    }
}