package com.himanshu.sg0.dhabahim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class orderactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderactivity2);

        Intent intent = getIntent();
        String message= intent.getStringExtra(MainActivity.MSG);

        TextView textView =findViewById(R.id.ordertext);
        textView.setText(message);
    }
}
