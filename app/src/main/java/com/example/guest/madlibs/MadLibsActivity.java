package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibsActivity extends AppCompatActivity {
    private TextView mOutputOne;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs);
        mOutputOne = (TextView) findViewById(R.id.output1);
        Intent intent = getIntent();
        String output1 = intent.getStringExtra("input1");
        String output2 = intent.getStringExtra("input2");
        String output3 = intent.getStringExtra("input3");
        String output4 = intent.getStringExtra("input4");
        String output5 = intent.getStringExtra("input5");
        String output6 = intent.getStringExtra("input6");
        String output7 = intent.getStringExtra("input7");
        String output8 = intent.getStringExtra("input8");
        String output9 = intent.getStringExtra("input9");
        String output10 = intent.getStringExtra("input10");
        String output11 = intent.getStringExtra("input11");
        String output12 = intent.getStringExtra("input12");
        String output13 = intent.getStringExtra("input13");
        String output14 = intent.getStringExtra("input14");
        String output15 = intent.getStringExtra("input15");
        String output16 = intent.getStringExtra("input16");
        String output17 = intent.getStringExtra("input17");
        mOutputOne.setText("Dear " + output1 + ",\n\nI am having a(n) " + output2 + " time at camp. The counselor is " + output3 + " and the food is " + output4 + ". I met "  + output5 + " and we became " + output6 + " friends. Unfortunately, " + output5 + " is " + output7 + " and I " + output8 + " my " + output9 + " so we couldn’t go " + output10 + " like everybody else. I need more " + output11 + " and a " + output12 + " sharpener, so please " + output13 + " " + output14 + " more when you " + output15 + " back.\n\nYour " + output16 + ",\n" + output17);
    }
}
