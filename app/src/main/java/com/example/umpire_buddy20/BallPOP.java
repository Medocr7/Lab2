package com.example.umpire_buddy20;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;


public class BallPOP extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_ball);
        DisplayMetrics BallCM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(BallCM);

        int Width = BallCM.widthPixels;
        int Height = BallCM.heightPixels;
        getWindow().setLayout(Width, Height);

        Button BallClose = findViewById(R.id.Butt_ID2);
        BallClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}