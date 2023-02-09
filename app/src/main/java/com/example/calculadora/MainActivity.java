package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText txtOperando1, txtOperando2;
    public TextView lbResultado;
    public String dividirPor0, valorInicial;
    public int operando1, operando2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOperando1 = findViewById(R.id.txtOperando1);
        txtOperando2 = findViewById(R.id.txtOperando2);
        lbResultado = findViewById(R.id.lbResultado);
        dividirPor0 = getString(R.string.lbResultadoError);
        valorInicial = getString(R.string.lbResultado);
    }

    public void sumar(View view) {
        if (!String.valueOf(txtOperando1.getText()).matches("")){
            operando1 = Integer.parseInt(String.valueOf(txtOperando1.getText()));
        }else{operando1 = 0;}
        if (!String.valueOf(txtOperando2.getText()).matches("")){
            operando2 = Integer.parseInt(String.valueOf(txtOperando2.getText()));
        }else{operando2 = 0;}
        resultado = operando1 + operando2;
        lbResultado.setText(String.valueOf(resultado));
    }

    public void restar(View view) {
        if (!String.valueOf(txtOperando1.getText()).matches("")){
            operando1 = Integer.parseInt(String.valueOf(txtOperando1.getText()));
        }else{operando1 = 0;}
        if (!String.valueOf(txtOperando2.getText()).matches("")){
            operando2 = Integer.parseInt(String.valueOf(txtOperando2.getText()));
        }else{operando2 = 0;}
        resultado = operando1 - operando2;
        lbResultado.setText(String.valueOf(resultado));
    }

    public void multiplicar(View view) {
        if (!String.valueOf(txtOperando1.getText()).matches("")){
            operando1 = Integer.parseInt(String.valueOf(txtOperando1.getText()));
        }else{operando1 = 0;}
        if (!String.valueOf(txtOperando2.getText()).matches("")){
            operando2 = Integer.parseInt(String.valueOf(txtOperando2.getText()));
        }else{operando2 = 0;}
        resultado = operando1 * operando2;
        lbResultado.setText(String.valueOf(resultado));
    }

    public void dividir(View view) {
        if (!String.valueOf(txtOperando1.getText()).matches("")){
            operando1 = Integer.parseInt(String.valueOf(txtOperando1.getText()));
        }else{operando1 = 0;}
        if (!String.valueOf(txtOperando2.getText()).matches("")){
            operando2 = Integer.parseInt(String.valueOf(txtOperando2.getText()));
        }else{operando2 = 0;}
        if (operando2 == 0) {
            lbResultado.setText(dividirPor0);
        } else {
            resultado = operando1 / operando2;
            lbResultado.setText(String.valueOf(resultado));
        }
    }

    public void limpiar(View view) {
        txtOperando1.setText("");
        txtOperando2.setText("");
        lbResultado.setText(valorInicial);
    }

}