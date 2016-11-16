package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FormActivity extends AppCompatActivity {
    public static final String TAG = FormActivity.class.getSimpleName();

    @Bind(R.id.btn_makeMadLib) Button mMakeMadLibButton;
    @Bind(R.id.input1) EditText mInput1;
    @Bind(R.id.input2) EditText mInput2;
    @Bind(R.id.input3) EditText mInput3;
    @Bind(R.id.input4) EditText mInput4;
    @Bind(R.id.input5) EditText mInput5;
    @Bind(R.id.input6) EditText mInput6;
    @Bind(R.id.input7) EditText mInput7;
    @Bind(R.id.input8) EditText mInput8;
    @Bind(R.id.input9) EditText mInput9;
    @Bind(R.id.input10) EditText mInput10;
    @Bind(R.id.input11) EditText mInput11;
    @Bind(R.id.input12) EditText mInput12;
    @Bind(R.id.input13) EditText mInput13;
    @Bind(R.id.input14) EditText mInput14;
    @Bind(R.id.input15) EditText mInput15;
    @Bind(R.id.input16) EditText mInput16;
    @Bind(R.id.input17) EditText mInput17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        ButterKnife.bind(this);

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
                Intent intent = new Intent(FormActivity.this, MadLibsActivity.class);
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
