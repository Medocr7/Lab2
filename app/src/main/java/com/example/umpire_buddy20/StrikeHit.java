package com.example.umpire_buddy20;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class StrikeHit extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_strike);
        DisplayMetrics StrikeCM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(StrikeCM);

        int Width = StrikeCM.widthPixels;
        int Height = StrikeCM.heightPixels;
        getWindow().setLayout( Width, Height);

        Button StrikeClose = findViewById(R.id.Butt_ID);
        StrikeClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
