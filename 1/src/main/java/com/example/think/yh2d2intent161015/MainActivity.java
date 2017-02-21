package com.example.think.yh2d2intent161015;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void intentclick(View v){
        Intent intent=new Intent();
        intent.setClass(MainActivity.this,ItentActivity.class);
        startActivity(intent);
    }
}
