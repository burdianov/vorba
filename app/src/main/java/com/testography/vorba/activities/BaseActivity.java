package com.testography.vorba.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.testography.vorba.infrastructure.VorbaApplication;

public abstract class BaseActivity extends AppCompatActivity {
    protected VorbaApplication application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        application = (VorbaApplication) getApplication();
    }
}