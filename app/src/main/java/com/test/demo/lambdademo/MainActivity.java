package com.test.demo.lambdademo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
//        r1.run();
//        r2.run();
//        new Thread(r1).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Log.d("xxx","old method!");
//            }
//        }).start();
//        new Thread(()->Log.d("xxx","new method")).start();
        List<String> list = Arrays.asList("android", "php", "ios", "java");
        //java8之前
//        for (String s : list) {
//            Log.d("xxx","java8之前遍历s=="+s);
//        }
        //java8
//        list.forEach(s -> Log.d("xxx",s));

    }

    private void initView() {
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(v -> {
            Toast.makeText(this, "hahaha", Toast.LENGTH_LONG).show();
        });

    }

    Runnable r1 = () -> Log.d("xxx", "runable1");
    Runnable r2=()->Log.d("xxx","runnable2");
}
