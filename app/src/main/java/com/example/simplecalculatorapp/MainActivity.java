package com.example.simplecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etfirstvalue,etsecondvalue;
    Button btnadd,btnsubs,btnmultiply,btndivide;
    Double num1,num2;
    TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirstvalue=findViewById(R.id.etfirstvalue);
        etsecondvalue=findViewById(R.id.etsecondvalue);
        btnadd=findViewById(R.id.btnadd);
        btndivide=findViewById(R.id.btndivision);
        btnmultiply=findViewById(R.id.btnmultiply);
        btnsubs=findViewById(R.id.btnsubs);
        tvresult=findViewById(R.id.tvresult);
        Clicklistener();
    }
    public void Clicklistener(){
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               num1=Double.parseDouble(etfirstvalue.getText().toString());
               num2=Double.parseDouble(etsecondvalue.getText().toString());
               Double result=num1+num2;
               tvresult.setText(String.valueOf(result));

            }
        });
        btnsubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=num1-num2;
                tvresult.setText(String.valueOf(result));
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=num1*num2;
                tvresult.setText(String.valueOf(result));
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=num1/num2;
                tvresult.setText(String.valueOf(result));
            }
        });
    }
}