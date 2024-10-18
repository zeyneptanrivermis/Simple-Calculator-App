package com.zeyneptanrivermis.firstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.editTextNumber1);
        number2 = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.editTextText3);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sum(View view) {

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter number!");
        }
        else {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());

            int res = num1 + num2;

            result.setText("Result: " + res);
        }
    }

    public void substraction(View view) {

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter number!");
        }
        else {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());

            int res = num1 - num2;

            result.setText("Result: " + res);
        }
    }

    public void multiplication(View view) {

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter number!");
        }
        else {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());

            int res = num1 * num2;

            result.setText("Result: " + res);
        }
    }

    public void partition(View view) {

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter number!");
        }
        else {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());

            int res = num1 / num2;

            result.setText("Result: " + res);
        }
    }
}