package com.anothercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter<String> resultsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList());
        ListView resultsListView = (ListView) findViewById(R.id.resultsListView);
        resultsListView.setAdapter(resultsAdapter);
    }

    public void calculateButtonClick(View v){
        EditText firstNumberEditText = (EditText) findViewById(R.id.firstNumberEditText);
        EditText secondNumberEditText = (EditText) findViewById(R.id.secondNumberEditText);

        int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
        int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

        RadioButton addRadioButton = (RadioButton) findViewById(R.id.addRadioButton);
        RadioButton subtractRadioButton = (RadioButton) findViewById(R.id.subtractRadioButton);
        RadioButton multiplyRadioButton = (RadioButton) findViewById(R.id.multiplyRadioButton);
        RadioButton divideRadioButton = (RadioButton) findViewById(R.id.divideRadioButton);

        int result = 0;

        if(addRadioButton.isChecked()){
            result = firstNumber + secondNumber;
        }else if(subtractRadioButton.isChecked()){
            result = firstNumber - secondNumber;
        }else if(multiplyRadioButton.isChecked()){
            result = firstNumber * secondNumber;
        }else if(divideRadioButton.isChecked()){
            result = firstNumber / secondNumber;
        }

        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        resultTextView.setText("Result : " + result);

        CheckBox recordResultCheckbox = (CheckBox) findViewById(R.id.recordResultCheckBox);

        if(recordResultCheckbox.isChecked()){
            if(addRadioButton.isChecked()){
                resultsAdapter.add(firstNumber + " + " + secondNumber + " = " + result);
            }else if(subtractRadioButton.isChecked()){
                resultsAdapter.add(firstNumber + " - " + secondNumber + " = " + result);
            }else if(multiplyRadioButton.isChecked()){
                resultsAdapter.add(firstNumber + " x " + secondNumber + " = " + result);
            }else if(divideRadioButton.isChecked()){
                resultsAdapter.add(firstNumber + " : " + secondNumber + " = " + result);
            }
        }
    }
}