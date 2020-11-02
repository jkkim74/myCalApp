package com.example.tutorial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClick(View v){
        EditText num1 = findViewById(Integer.parseInt(Integer.toString(R.id.number1)));
        EditText num2 = findViewById(Integer.parseInt(Integer.toString(R.id.number2)));
        TextView result = findViewById(Integer.parseInt(Integer.toString(R.id.result)));
        System.out.println(num1.getText() +","+num2.getText());
        result.setText(Integer.toString(Integer.parseInt(num1.getText().toString()) + Integer.parseInt( num2.getText().toString())));
    }

    public void subClick(View v){
        EditText num1 = findViewById(Integer.parseInt(Integer.toString(R.id.number1)));
        EditText num2 = findViewById(Integer.parseInt(Integer.toString(R.id.number2)));
        TextView result = findViewById(Integer.parseInt(Integer.toString(R.id.result)));
        result.setText(Integer.toString(Integer.parseInt(num1.getText().toString()) - Integer.parseInt( num2.getText().toString())));
    }

    public void multiClick(View v){
        EditText num1 = findViewById(Integer.parseInt(Integer.toString(R.id.number1)));
        EditText num2 = findViewById(Integer.parseInt(Integer.toString(R.id.number2)));
        TextView result = findViewById(Integer.parseInt(Integer.toString(R.id.result)));
        result.setText(Integer.toString(Integer.parseInt(num1.getText().toString()) * Integer.parseInt( num2.getText().toString())));
    }

    public void divClick(View v){
        EditText num1 = findViewById(Integer.parseInt(Integer.toString(R.id.number1)));
        EditText num2 = findViewById(Integer.parseInt(Integer.toString(R.id.number2)));
        TextView result = findViewById(Integer.parseInt(Integer.toString(R.id.result)));
        result.setText(Integer.toString(Integer.parseInt(num1.getText().toString()) / Integer.parseInt( num2.getText().toString())));
    }
}