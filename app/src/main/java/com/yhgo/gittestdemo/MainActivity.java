package com.yhgo.gittestdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"TestGit",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"new dev",Toast.LENGTH_SHORT).show();
    }
}
