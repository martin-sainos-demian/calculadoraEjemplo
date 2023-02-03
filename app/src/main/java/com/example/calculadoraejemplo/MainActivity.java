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

    public void UpdateRes(){
        tvResultado.setText(String.valueOf(res));
    }

    public void Escribir(int num) {
        ram = ram * 10;
        ram += num;
    }

    public void AC(){
        res = 0;
        UpdateRes();
    }

    public void Percent(){

    }
    public void Change(){

    }
    public void Plus(){

    }
    public void Minus(){

    }
    public void Div(){

    }
    public void Times(){

    }
    public void Equals(){
        res = ram;
        UpdateRes();
    }

    public void Escribir0(View view) {
        Escribir(0);
    }
    public void Escribir1(View view) {
        Escribir(1);
    }
    public void Escribir2(View view) {
        Escribir(2);
    }
    public void Escribir3(View view) {
        Escribir(3);
    }
    public void Escribir4(View view) {
        Escribir(4);
    }
    public void Escribir5(View view) {
        Escribir(5);
    }
    public void Escribir6(View view) {
        Escribir(6);
    }
    public void Escribir7(View view) {
        Escribir(7);
    }
    public void Escribir8(View view) {
        Escribir(8);
    }
    public void Escribir9(View view) {
        Escribir(9);
    }
}