package com.example.kouhei.stopwatch_app;

//めっちゃインポート

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.ArrayList;////

public class MainActivity extends AppCompatActivity {//メインクラス

//     Chronometer chronometer;

    //インスタンスゾーン
    //        Chronometer chronometer = (Chronometer) findViewById(R.id.time);//メーター
    Button startButton = (Button) findViewById(R.id.b1);//スタートボタン
    Button stopButton = (Button) findViewById(R.id.b2);//ストップボタン
    Button WrapButton = (Button) findViewById(R.id.b3);//ラップタイム
    TextView tv = (TextView) findViewById(R.id.log);
    ArrayList<Long> logview = new ArrayList<Long>();
    Chronometer chronometer = (Chronometer) findViewById(R.id.time);//メーター

    //変数と愉快な仲間たち
    // ArrayList<Long> i = new ArrayList<Long>();
    final long[] textl = new long[1];


    @Override
    protected void onCreate(Bundle savedInstanceState) {//最初に呼ばれる！
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startButton.setOnClickListener(new View.OnClickListener() {//タイマースタート
            @Override
            public void onClick(View v) {
                chronometer.start();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {//タイマーストップ
            @Override
            public void onClick(View v) {
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.stop();
            }
        });

        WrapButton.setOnClickListener//ラップタイム（作成中）
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                logview.add(chronometer.getBase());
//                System.out.println(chronometer.getBase());
//                System.out.println("ぽいふる");
//                logview.get(0);

                        // tv =
                    }

                });


    }

}