package com.example.anew.intentprj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView tv=findViewById(R.id.tv1);
        tv.setText("welcome to"+getIntent().getStringExtra("uname")+getIntent().getStringExtra("pword"));
    }
}
