package com.example.umpire_buddy20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int Snumber;
    public int Bnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView StrikeText  = findViewById(R.id.numstrike);
        final Button pressStrike = findViewById(R.id.ClickMe);
        pressStrike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snumber = Snumber + 1;

                if (Snumber==3) {
                    pressStrike.setEnabled(false);
                    startActivity(new Intent(MainActivity.this, StrikeHit.class));
                }
                    StrikeText.setText(String.valueOf(Snumber));
            }
        });
        final TextView BallText  = findViewById(R.id.numball);
        final Button  PressBall = findViewById(R.id.BallSpeed);
        PressBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bnumber = Bnumber + 1;
                if (Bnumber==4) {
                    PressBall.setEnabled(false);
                    startActivity(new Intent(MainActivity.this, BallPOP.class));
                }

                BallText.setText(String.valueOf(Bnumber));
            }
        });

        Button PressReset = findViewById(R.id.Startover);
        PressReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snumber = 0;
                Bnumber = 0;
                StrikeText.setText(String.valueOf(Snumber));
                BallText.setText(String.valueOf(Bnumber));

                pressStrike.setEnabled(true);
                PressBall.setEnabled(true);
            }
        });
        Button PressExit = findViewById(R.id.GetOut);
        PressExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        Button AboutInfo = findViewById(R.id.About_Butt);
        AboutInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutPOP.class));
            }
        });

    }
}