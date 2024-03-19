package com.example.appaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtContador;
    private Button btnCalc;
    private Button btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtContador = findViewById(R.id.editText);
        btnCalc = findViewById(R.id.btn_calc);
        btnCount = findViewById(R.id.btn_count);

        btnCalc.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CalcActivity.class);
            startActivity(intent);
        });

        btnCount.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CountActivity.class);
            String textoDigitado = txtContador.getText().toString();
            intent.putExtra("texto", textoDigitado);
            startActivity(intent);
        });

    }
}