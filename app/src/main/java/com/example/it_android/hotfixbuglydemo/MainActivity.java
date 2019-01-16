package com.example.it_android.hotfixbuglydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tencent.bugly.Bugly;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bugly.init(getApplicationContext(), "59a5100f3e", false);
    }
}
