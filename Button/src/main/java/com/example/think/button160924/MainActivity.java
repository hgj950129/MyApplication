package com.example.think.button160924;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonclick(View v){
        Toast.makeText(this,"我爱安卓开发 一红实验室",Toast.LENGTH_LONG).show();
    }
}
