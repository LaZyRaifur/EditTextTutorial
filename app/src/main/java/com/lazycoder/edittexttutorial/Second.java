package com.lazycoder.edittexttutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView TvReceive;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TvReceive = (TextView)findViewById(R.id.showText);

        TvReceive.setText(getIntent().getStringExtra("rakib"));
    }
}
