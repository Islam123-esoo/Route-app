package com.islam.ruotapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button_a ;
Button button_i ;
Button button_f ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_a=findViewById(R.id.but_android);
        button_i=findViewById(R.id.but_ios);
        button_f=findViewById(R.id.but_fullstack);

        button_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,CourseActivity.class);
                intent.putExtra("txt",R.string.android_content);
                intent.putExtra("im",R.drawable.android);
                startActivity(intent);
            }
        });
        button_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,CourseActivity.class);
                intent.putExtra("txt",R.string.ios_content);
                intent.putExtra("im",R.drawable.ios);
                startActivity(intent);
            }
        });
        button_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,CourseActivity.class);
                intent.putExtra("txt",R.string.fullstack_content);
                intent.putExtra("im",R.drawable.fullstack);
                startActivity(intent);
            }
        });
    }
}