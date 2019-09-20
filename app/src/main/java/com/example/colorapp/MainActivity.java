package com.example.colorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    //1,initialize components ->

    private SeekBar sbrRed =Null;
    private SeekBar sbrGreen =Null;
    private SeekBar sbrBlue =Null;
    private SeekBar sbrAlpha =Null;
    private View vieColors =Null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbrRed = findViewById(R.id.sbrRed);
        sbrGreen = findViewById(R.id.sbrGreen);
        sbrBlue = findViewById(R.id.sbrBlue);
        sbrAlpha = findViewById(R.id.sbrAlpha);
        vieColors = findViewById(R.id.vieColors);

        //3. Enable view component as ContextMenu.

        registerForContextMenu(vieColors);



    }
}
