package com.example.it_android.hotfixbuglydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tencent.bugly.Bugly;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bugly.init(getApplicationContext(), "e7a748ede4", true);
    }
}
