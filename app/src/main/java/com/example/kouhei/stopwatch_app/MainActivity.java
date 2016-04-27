package com.example.kouhei.stopwatch_app;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //変数
     Chronometer chronometer;
     public TextView tv;
     public String s;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //変数
        final long[] l = {0};
    //インスタンスゾーン
        chronometer = (Chronometer) findViewById(R.id.time);//メーター

        Button startButton = (Button)findViewById(R.id.b1);//スタートボタン
        Button stopButton = (Button) findViewById(R.id.b2);//ストップボタン
        Button wrapButton = (Button) findViewById(R.id.b3);//ラップタイム
        Button resetButton = (Button) findViewById(R.id.b4);//ラップタイム

         tv = (TextView) findViewById(R.id.log);

        StringBuilder sb  = new StringBuilder();

        //テキスト
        //tv.setText("team ironman");

        startButton.setOnClickListener(new View.OnClickListener() {//スタート
            @Override
            public void onClick(View v) {
                chronometer.start();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {//ストップ
            @Override
            public void onClick(View v) {
                chronometer.stop();
            }
        });

        wrapButton.setOnClickListener(new View.OnClickListener() {//ラップタイム
            @Override
            public void onClick(View v) {
             //ラップ処理
                s = settime(chronometer.getBase());
                tv.setText(s);


            }

        });

        resetButton.setOnClickListener(new View.OnClickListener() {//リセット
            @Override
            public void onClick(View v) {
                chronometer.setBase(SystemClock.elapsedRealtime());

            }
        });


    }


    //メゾピアノ
    public String settime(long v){
        String vv = Long.toString(v);
        return vv;
    }

}