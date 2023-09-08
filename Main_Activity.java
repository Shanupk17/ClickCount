package com.example.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText resultview;
    Button start,reset;

    public int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultview=(EditText) findViewById(R.id.resultview);
        start=(Button) findViewById(R.id.start);
        reset=(Button) findViewById((R.id.reset));
        start.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                clickCount++;
                resultview.setText("Count:\t"+clickCount);
            }
        });
        reset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                clickCount--;
                resultview.setText("Count:\t"+clickCount);
            }
        });
    }
}
