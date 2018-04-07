package com.example.android_user.belle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Number_one, Number_two;
    private Button etButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        Number_one = findViewById(R.id.Number_one);
        Number_two = findViewById(R.id.Number_two);
        etButton = findViewById(R.id.etButton);
        etButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Num1 = Integer.parseInt(Number_one.getText().toString());
                int Num2 = Integer.parseInt(Number_two.getText().toString());
                int sum = Num1 + Num2;
                Toast.makeText(MainActivity.this, "The Sum of the two number is " +String.valueOf(sum).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
