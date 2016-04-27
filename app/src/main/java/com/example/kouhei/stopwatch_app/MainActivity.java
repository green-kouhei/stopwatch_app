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

     Chronometer chronometer;
            ArrayList<Long> logview = new ArrayList<Long>();
          // Chronometer chronometer = (Chronometer) findViewById(R.id.time);//メーター


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//変数
       // ArrayList<Long> i = new ArrayList<Long>();
         final long[] textl = new long[1];

//インスタンスゾーン
         chronometer = (Chronometer) findViewById(R.id.time);//メーター

        Button startButton = (Button)findViewById(R.id.b1);//スタートボタン
        Button stopButton = (Button) findViewById(R.id.b2);//ストップボタン
        Button WrapButton = (Button) findViewById(R.id.b3);//ラップタイム

         TextView tv = (TextView) findViewById(R.id.log);

        final ArrayList<Long> logview = new ArrayList<Long>();

        startButton.setOnClickListener(new View.OnClickListener() {//スタート
            @Override
            public void onClick(View v) {
                chronometer.start();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {//ストップ
            @Override
            public void onClick(View v) {
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.stop();
            }
        });

//        WrapButton.setOnClickListener(new View.OnClickListener() {//ラップタイム
//            @Override
//            public void onClick(View v) {
////                logview.add(chronometer.getBase());
////                System.out.println(chronometer.getBase());
////                System.out.println("ぽいふる");
////                logview.get(0);
//
//               // tv =
//            }
//
//        });


    }

}