package com.example.smartland.drowerlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,
            btn_clear,btn_add,btn_mult,btn_div,btn_minus, btn_equal;
    private TextView tv_numbers;
    private double num1;
    private double num2;

    private boolean add,sub, mul, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        tv_numbers = findViewById(R.id.tv_numbers);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_clear = findViewById(R.id.btn_clear);
        btn_add = findViewById(R.id.btn_add);
        btn_mult = findViewById(R.id.btn_mult);
        btn_div = findViewById(R.id.btn_div);
        btn_minus = findViewById(R.id.btn_minus);
        btn_equal = findViewById(R.id.btn_equal);


        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText("");
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText().toString() + "0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText().toString() + "1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText().toString() + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText().toString() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText().toString() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText().toString() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText().toString() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText().toString() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText().toString() + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText().toString() + "9");
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(tv_numbers.getText()+"");
                add =true;
                tv_numbers.setText(null);
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(tv_numbers.getText()+"");
                sub =true;
                tv_numbers.setText(null);
            }
        });
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(tv_numbers.getText()+"");
                mul =true;
                tv_numbers.setText(null);
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(tv_numbers.getText()+"");
                div =true;
                tv_numbers.setText(null);
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Double.parseDouble(tv_numbers.getText() + "");

                if (add ==true){
                    tv_numbers.setText(num1+num2+"");
                    add=false;
                }
                if (sub ==true){
                    tv_numbers.setText(num1-num2+"");
                    sub=false;
                }
                if (mul ==true){
                    tv_numbers.setText(num1*num2+"");
                    mul=false;
                }
                if (div ==true){
                    tv_numbers.setText(num1/num2+"");
                    div=false;
                }
            }
        });
    }
}
