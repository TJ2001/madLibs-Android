package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mMakeMadLibButton;
    private EditText mInput1;
    private EditText mInput2;
    private EditText mInput3;
    private EditText mInput4;
    private EditText mInput5;
    private EditText mInput6;
    private EditText mInput7;
    private EditText mInput8;
    private EditText mInput9;
    private EditText mInput10;
    private EditText mInput11;
    private EditText mInput12;
    private EditText mInput13;
    private EditText mInput14;
    private EditText mInput15;
    private EditText mInput16;
    private EditText mInput17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInput1 = (EditText) findViewById(R.id.input1);
        mInput2 = (EditText) findViewById(R.id.input2);
        mInput3 = (EditText) findViewById(R.id.input3);
        mInput4 = (EditText) findViewById(R.id.input4);
        mInput5 = (EditText) findViewById(R.id.input5);
        mInput6 = (EditText) findViewById(R.id.input6);
        mInput7 = (EditText) findViewById(R.id.input7);
        mInput8 = (EditText) findViewById(R.id.input8);
        mInput9 = (EditText) findViewById(R.id.input9);
        mInput10 = (EditText) findViewById(R.id.input10);
        mInput11 = (EditText) findViewById(R.id.input11);
        mInput12 = (EditText) findViewById(R.id.input12);
        mInput13 = (EditText) findViewById(R.id.input13);
        mInput14 = (EditText) findViewById(R.id.input14);
        mInput15 = (EditText) findViewById(R.id.input15);
        mInput16 = (EditText) findViewById(R.id.input16);
        mInput17 = (EditText) findViewById(R.id.input17);
        mMakeMadLibButton = (Button) findViewById(R.id.btn_makeMadLib);

        mMakeMadLibButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = mInput1.getText().toString();
                String input2 = mInput2.getText().toString();
                String input3 = mInput3.getText().toString();
                String input4 = mInput4.getText().toString();
                String input5 = mInput5.getText().toString();
                String input6 = mInput6.getText().toString();
                String input7 = mInput7.getText().toString();
                String input8 = mInput8.getText().toString();
                String input9 = mInput9.getText().toString();
                String input10 = mInput10.getText().toString();
                String input11 = mInput11.getText().toString();
                String input12 = mInput12.getText().toString();
                String input13 = mInput13.getText().toString();
                String input14 = mInput14.getText().toString();
                String input15 = mInput15.getText().toString();
                String input16 = mInput16.getText().toString();
                String input17 = mInput17.getText().toString();
                Log.d(TAG, input1);
                Intent intent = new Intent(MainActivity.this, MadLibsActivity.class);
                intent.putExtra("input1", input1);
                intent.putExtra("input2", input2);
                intent.putExtra("input3", input3);
                intent.putExtra("input4", input4);
                intent.putExtra("input5", input5);
                intent.putExtra("input6", input6);
                intent.putExtra("input7", input7);
                intent.putExtra("input8", input8);
                intent.putExtra("input9", input9);
                intent.putExtra("input10", input10);
                intent.putExtra("input11", input11);
                intent.putExtra("input12", input12);
                intent.putExtra("input13", input13);
                intent.putExtra("input14", input14);
                intent.putExtra("input15", input15);
                intent.putExtra("input16", input16);
                intent.putExtra("input17", input17);
                startActivity(intent);
            }

        });
    }
}
