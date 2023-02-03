package com.example.calculadoraejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;
    float res = 0.0f;
    float ram = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void UpdateRes(View view){
        tvResultado.setText(String.valueOf(res));
    }

    public void Escribir(View view, int num) {
        res = res * 10;
        res += num;
        UpdateRes(view);
    }

    public void Escribir1(View view) {
        Escribir(view, 1);
    }
    public void Escribir2(View view) {
        Escribir(view, 2);
    }
    public void Escribir3(View view) {
        Escribir(view, 3);
    }
    public void Escribir4(View view) {
        Escribir(view, 4);
    }
    public void Escribir5(View view) {
        Escribir(view, 5);
    }
    public void Escribir6(View view) {
        Escribir(view, 6);
    }
    public void Escribir7(View view) {
        Escribir(view, 7);
    }
    public void Escribir8(View view) {
        Escribir(view, 8);
    }
    public void Escribir9(View view) {
        Escribir(view, 9);
    }
    public void Escribir0(View view) {
        Escribir(view, 0);
    }
}