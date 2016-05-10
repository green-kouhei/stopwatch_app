package com.example.kouhei.stopwatch_app;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //変数
     Chronometer chronometer;
     public TextView tv_log;
     public String s;
     public TextView tv_time;
     public Date date;
     public SimpleDateFormat sdf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //変数

    //インスタンスゾーン
        tv_time = (TextView) findViewById(R.id.time);//メーター

        Button startButton = (Button)findViewById(R.id.b1);//スタートボタン
        Button stopButton = (Button) findViewById(R.id.b2);//ストップボタン
        Button wrapButton = (Button) findViewById(R.id.b3);//ラップタイム
        Button resetButton = (Button) findViewById(R.id.b4);//ラップタイム

         tv_log = (TextView) findViewById(R.id.log);

        StringBuilder sb  = new StringBuilder();

         date = new Date();
        sdf = new SimpleDateFormat("HH:mm:ss");

    //メゾット

        startButton.setOnClickListener(new View.OnClickListener() {//スタート
            @Override
            public void onClick(View v) {
                //start
                set_time();

            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {//ストップ
            @Override
            public void onClick(View v) {
            //stop
                 }
        });

        wrapButton.setOnClickListener(new View.OnClickListener() {//ラップタイム
            @Override
            public void onClick(View v) {
             //ラップ処理


            }

        });

        resetButton.setOnClickListener(new View.OnClickListener() {//リセット
            @Override
            public void onClick(View v) {
               //reset
                reset_time();
            }
        });


    }

     void reset_time() {
         tv_time.setText("00:00:00");

     }


    public void set_time(){

    tv_time.setText(sdf.format(date));
}

}