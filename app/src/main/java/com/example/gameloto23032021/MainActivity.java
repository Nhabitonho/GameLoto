package com.example.gameloto23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Math
        //1: Làm tròn
//        float st1 = 0.5f;
//        // round : dưới thì xuống 0, trên thì lên 1
//        float valueSt1 = Math.round(st1);
//        // làm tròn thành 1 hết
//        double valueSt2 = Math.ceil(Double.parseDouble(st1 + ""));
//        // làm tròn về 0
//        double valueSt3 = Math.floor(Double.parseDouble(st1 + ""));
//
//        Log.d("AAA",valueSt1 + "" );
//        Log.d("BBB",valueSt2 + "" );
//        Log.d("CCC",valueSt3 + "" );
        double value = Math.floor(Math.random()*6);
        Log.d("AAA", value + "");
    }
}