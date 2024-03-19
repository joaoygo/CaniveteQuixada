package com.example.appaula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

    private TextView txtContador;
    private Button btnDecrement;
    private Button btnIncrement;

    int valueCont = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        txtContador = findViewById(R.id.tv_contador);
        btnDecrement = findViewById(R.id.btn_decrement);
        btnIncrement = findViewById(R.id.btn_increment);
        String textoDigitado = getIntent().getExtras().getString("texto");
        valueCont = Integer.parseInt(textoDigitado);
        txtContador.setText(String.valueOf(valueCont));

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valueCont > 0) {
                    valueCont--;
                    txtContador.setText(String.valueOf(valueCont));
                }
            }
        });

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueCont++;
                txtContador.setText(String.valueOf(valueCont));
            }
        });
    }
}