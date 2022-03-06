package com.example.enhancedveroffontsizecolorbgcolor;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    TextView txt;
    Button btn,btn1,btn2;
    Float textSize,diff=5.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(TextView) findViewById(R.id.txtview);
        btn=(Button) findViewById(R.id.btn1);
        btn1=(Button) findViewById(R.id.btn3);
        btn2=(Button) findViewById(R.id.btn2);


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textSize = txt.getTextSize();
                if(textSize <= 50){
                textSize = textSize + diff;
                }
                else {
                    textSize=textSize- diff;
                }
                txt.setTextSize(textSize);

            }

        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt.setBackgroundColor(Color.parseColor("#ff0000"));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt.setTextColor(Color.parseColor("#04AF0A"));

            }
        });


    }
}