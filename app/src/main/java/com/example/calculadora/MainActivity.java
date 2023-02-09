package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtOperando1, txtOperando2;
    private TextView lbResultado;
    private String dividirPor0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOperando1 = findViewById(R.id.txtOperando1);
        txtOperando2 = findViewById(R.id.txtOperando2);
        lbResultado = findViewById(R.id.lbResultado);
        dividirPor0 = getString(R.string.lbResultadoError);
    }

    public void sumar(View view) {
        int operando1 = Integer.parseInt(String.valueOf(txtOperando1.getText()));
        int operando2 = Integer.parseInt(String.valueOf(txtOperando2.getText()));
        int resultado = operando1 + operando2;
        lbResultado.setText(String.valueOf(resultado));
    }

    public void restar(View view) {
        int operando1 = Integer.parseInt(String.valueOf(txtOperando1.getText()));
        int operando2 = Integer.parseInt(String.valueOf(txtOperando2.getText()));
        int resultado = operando1 - operando2;
        lbResultado.setText(String.valueOf(resultado));
    }

    public void multiplicar(View view) {
        int operando1 = Integer.parseInt(String.valueOf(txtOperando1.getText()));
        int operando2 = Integer.parseInt(String.valueOf(txtOperando2.getText()));
        int resultado = operando1 * operando2;
        lbResultado.setText(String.valueOf(resultado));
    }

    public void dividir(View view) {
        int operando1 = Integer.parseInt(String.valueOf(txtOperando1.getText()));
        int operando2 = Integer.parseInt(String.valueOf(txtOperando2.getText()));
        int resultado;
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
        lbResultado.setText("0");
    }

}