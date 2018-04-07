package com.example.android_user.belle;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class ImageActivity extends AppCompatActivity {

    private Button Button1, Button2, Button3;
    private ImageView imagelah;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        initView();
    }

    private void initView(){
        imagelah = findViewById(R.id.imagelah);
        Button1 = findViewById(R.id.Button1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagelah.setImageDrawable(getDrawable(R.drawable.maxresdefault));
            }
        });

        Button2 = findViewById(R.id.Button2);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagelah.setImageDrawable(getDrawable(R.drawable.tumblr));
            }
        });

        Button3 = findViewById(R.id.Button3);
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagelah.setImageDrawable(getDrawable(R.drawable.y));
            }
        });
    }
}
