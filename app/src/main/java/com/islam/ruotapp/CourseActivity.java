package com.islam.ruotapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        textView=findViewById(R.id.t_v);
        imageView=findViewById(R.id.imageV);
        getIntent().getIntExtra("txt",-1);
        getIntent().getIntExtra("im",-1);
        imageView.setImageResource(getIntent().getIntExtra("im",-1));
        textView.setText(getIntent().getIntExtra("txt",-1));
    }
}