package com.example.it_android.hotfixbuglydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tencent.bugly.Bugly;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bugly.init(getApplicationContext(), "e7a748ede4", false);
    }
}
