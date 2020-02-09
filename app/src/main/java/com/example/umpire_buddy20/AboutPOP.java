package com.example.umpire_buddy20;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class AboutPOP extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_about);
        DisplayMetrics AboutCM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(AboutCM);

        int Width = AboutCM.widthPixels;
        int Height = AboutCM.heightPixels;
        getWindow().setLayout(Width, Height);

        Button BallClose = findViewById(R.id.Butt_ID3);
        BallClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}