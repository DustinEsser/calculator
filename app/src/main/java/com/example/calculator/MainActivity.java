package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view) {
        EditText firstNum = findViewById(R.id.firstNumber);
        EditText secondNum = findViewById(R.id.secondNumber);

        String str = firstNum.getText().toString();
        double first = Double.parseDouble(str);

        str = secondNum.getText().toString();
        double second = Double.parseDouble(str);

        double answer = first + second;
        goToActivity2(answer + "");
    }

    public void subtract(View view) {
        EditText firstNum = findViewById(R.id.firstNumber);
        EditText secondNum = findViewById(R.id.secondNumber);

        String str = firstNum.getText().toString();
        double first = Double.parseDouble(str);

        str = secondNum.getText().toString();
        double second = Double.parseDouble(str);

        double answer = first - second;
        goToActivity2(answer + "");
    }

    public void multiply(View view) {
        EditText firstNum = findViewById(R.id.firstNumber);
        EditText secondNum = findViewById(R.id.secondNumber);

        String str = firstNum.getText().toString();
        double first = Double.parseDouble(str);

        str = secondNum.getText().toString();
        double second = Double.parseDouble(str);

        double answer = first * second;
        goToActivity2(answer + "");
    }

    public void divide(View view) {
        EditText firstNum = findViewById(R.id.firstNumber);
        EditText secondNum = findViewById(R.id.secondNumber);

        String str = firstNum.getText().toString();
        double first = Double.parseDouble(str);

        str = secondNum.getText().toString();
        double second = Double.parseDouble(str);

        double answer = first / second;
        goToActivity2(answer + "");
    }
    public void goToActivity2(String s) {

        Intent intent =new Intent( this, MainActivity2.class );
        intent.putExtra("message", s);
        startActivity(intent);

    }
}