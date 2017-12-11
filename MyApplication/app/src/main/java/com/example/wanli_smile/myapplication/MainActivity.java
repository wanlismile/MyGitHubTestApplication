package com.example.wanli_smile.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /**master添加一个a*/
    int a = 10;
    /**branch 添加的*/
    int b = 11;
    /**master首先修改*/
    int c =12;
    /**branche的d*/
    int d = 10;
    /**branche的e*/
    int e = 11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
