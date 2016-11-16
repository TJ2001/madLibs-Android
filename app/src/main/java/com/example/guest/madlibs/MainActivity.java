package com.example.guest.madlibs;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButtonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonPlay = (Button) findViewById(R.id.btn_play);
        Typeface coiny = Typeface.createFromAsset(getAssets(), "fonts/coiny.ttf");
        mButtonPlay.setTypeface(coiny);

        mButtonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormActivity.class);
                Log.i("MainActivity", "Clicked!");
                startActivity(intent);

            }
        });
    }
}
