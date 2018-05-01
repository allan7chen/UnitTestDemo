package com.example.allan.unittest.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;

import com.example.allan.unittest.R;

public class NestedScrollActivity extends AppCompatActivity {

    NestedScrollView nestedScrollView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested);

        nestedScrollView = (NestedScrollView) findViewById(R.id.ns_container);
    }
}
