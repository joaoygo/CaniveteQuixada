package com.example.appaula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {
    private EditText firstTxt;
    private EditText lastTxt;
    private TextView resultTxt;
    private Button btnSoma;
    private Button btnSub;
    private Button btnmult;
    private Button btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        firstTxt = findViewById(R.id.firstEditText);
        lastTxt = findViewById(R.id.lastEditText);
        resultTxt = findViewById(R.id.textViewResult);
        btnSoma = findViewById(R.id.btn_soma);
        btnSub = findViewById(R.id.btn_sub);
        btnmult = findViewById(R.id.btn_multi);
        btndiv = findViewById(R.id.btn_div);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!firstTxt.getText().toString().isEmpty() && !lastTxt.getText().toString().isEmpty()){
                float result = Float.valueOf(firstTxt.getText().toString()) + Float.valueOf(lastTxt.getText().toString());
                resultTxt.setText(String.valueOf(result));
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Preencha os campos", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!firstTxt.getText().toString().isEmpty() && !lastTxt.getText().toString().isEmpty()){
                float result = Float.valueOf(firstTxt.getText().toString()) - Float.valueOf(lastTxt.getText().toString());
                resultTxt.setText(String.valueOf(result));
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Preencha os campos", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(!firstTxt.getText().toString().isEmpty() && !lastTxt.getText().toString().isEmpty()){
                float result = Float.valueOf(firstTxt.getText().toString()) * Float.valueOf(lastTxt.getText().toString());
                resultTxt.setText(String.valueOf(result));
                    }else{
                        Toast toast = Toast.makeText(getApplicationContext(), "Preencha os campos", Toast.LENGTH_LONG);
                        toast.show();
                    }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!firstTxt.getText().toString().isEmpty() && !lastTxt.getText().toString().isEmpty()){
                float result = Float.valueOf(firstTxt.getText().toString()) / Float.valueOf(lastTxt.getText().toString());
                resultTxt.setText(String.valueOf(result));
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Preencha os campos", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}