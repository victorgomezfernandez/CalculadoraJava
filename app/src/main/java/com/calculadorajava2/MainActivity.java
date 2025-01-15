package com.calculadorajava2;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void addNumbers(View view){
        EditText firstNumberField = (EditText)findViewById(R.id.firstNumberField);
        String firstNumberString = String.valueOf(firstNumberField.getText());
        int firstNumber;
        if(firstNumberString.length()>0){
            firstNumber = Integer.parseInt(String.valueOf(firstNumberField.getText()));
        } else {
            firstNumber = 0;
        }
        EditText secondNumberField = (EditText)findViewById(R.id.secondNumberField);
        String secondNumberString = String.valueOf(secondNumberField.getText());
        int secondNumber;
        if(secondNumberString.length()>0){
            secondNumber = Integer.parseInt(String.valueOf(secondNumberField.getText()));
        } else {
            secondNumber = 0;
        }
        TextView resultLabel = (TextView)findViewById(R.id.resultLabel);
        int resultNumber = firstNumber + secondNumber;
        String resultString = String.valueOf(resultNumber);
        resultLabel.setText(resultString);
    }

}