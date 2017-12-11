package com.example.wanli_smile.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /**master添加一个a*/
    int a = 10;
    /**branch 添加的*/
    int b = 11;
    /**branch也来修改*/
    int c = 15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
