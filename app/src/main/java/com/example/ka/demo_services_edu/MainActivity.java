package com.example.ka.demo_services_edu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;


import static com.example.ka.demo_services_edu.MyServices.song;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnStop, btnStart, btnPrevious, btnNext;
    private SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);
        seekBar = findViewById(R.id.seekBar);

        btnStop.setOnClickListener(this);
        btnStart.setOnClickListener(this);
        btnPrevious.setOnClickListener(this);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnStart:
                startService(new Intent(this, MyServices.class));
                break;
            case R.id.btnStop:
                song.pause();
                break;

        }

    }
}
