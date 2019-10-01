package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Creating Objects

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnSubtract, btnDivide, btnMultiply, btnEqualTo, btnClear;
     EditText etName;
    Float Value1, Value2;
    Boolean Addition, Subtraction, Divide, Multiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnEqualTo = findViewById(R.id.btnEqualTo);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnClear = findViewById(R.id.btnClear);
        etName = findViewById(R.id.etName);


        //Fetching Values
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText(etName.getText()+ "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText(etName.getText()+ "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText(etName.getText()+ "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText(etName.getText()+ "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText(etName.getText()+ "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText(etName.getText()+ "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText(etName.getText()+ "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText(etName.getText()+ "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText(etName.getText()+ "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText(etName.getText()+ "9");
            }
        });


        //Changing edit text value
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etName == null){
                    etName.setText("");
                }else {
                    Value1 = Float.parseFloat(etName.getText() + "");
                    Addition = true;
                    etName.setText(null);
                }
            }
        });

        //Functional Buttons
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Value1 = Float.parseFloat(etName.getText()+ "");
                Subtraction = true;
                etName.setText(null);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Value1 = Float.parseFloat(etName.getText()+ "");
                Divide = true;
                etName.setText(null);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Value1 = Float.parseFloat(etName.getText()+ "");
                Multiply = true;
                etName.setText(null);
            }
        });


        btnEqualTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Value2 = Float.parseFloat(etName.getText()+ "");

                if (Addition == true){
                    etName.setText(Value1 + Value2 + "");
                    Addition = false;
                }

                else if (Subtraction == true){
                    etName.setText(Value1 - Value2 + "");
                    Subtraction = false;
                }

               else if (Divide == true){
                    etName.setText(Value1 / Value2 + "");
                    Divide = false;
                }

               else if (Multiply == true){
                    etName.setText(Value1 * Value2 + "");
                    Multiply = false;
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.setText("");
            }
        });
    }


   }
