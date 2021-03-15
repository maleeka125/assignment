package com.example.a2ndlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class lifecycle_activity extends AppCompatActivity {
    public static int oncreate;
    public static int onstart;
    public static int onresume;
    public static int onrestart;
    public static int onpause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle_activity);
        TextView create=findViewById(R.id.tv1);
        oncreate++;
        create.setText("oncreate() calls:"+oncreate);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView start=findViewById(R.id.tv2);
        onstart++;
        start.setText("onstart() calls:"+onstart);
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView resume=findViewById(R.id.tv3);
        onresume++;
        resume.setText("onresume() calls:"+onresume);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        TextView restart=findViewById(R.id.tv4);
        onrestart++;
        restart.setText("onrestart() calls:"+onrestart);
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextView pause=findViewById(R.id.tv5);
        onpause++;
        pause.setText("onpause() calls:"+onpause);
    }
}