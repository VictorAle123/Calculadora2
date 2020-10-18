package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btncero, btnuno, btndos, btntres, btncuatro, btncinco, btnseis, btnsiete, btnocho,
            btnnueve, btnigual, btnsuma, btnresta, btnmulti, btndiv, btnlimpiar;

    EditText etproceso, etconcatenar;

    double numero1, numero2, resultado;

    String operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncero = (Button) findViewById(R.id.btncero);
        btnuno = (Button) findViewById(R.id.btnuno);
        btndos = (Button) findViewById(R.id.btndos);
        btntres = (Button) findViewById(R.id.btntres);
        btncuatro = (Button) findViewById(R.id.btncuatro);
        btncinco = (Button) findViewById(R.id.btncinco);
        btnseis = (Button) findViewById(R.id.bntseis);
        btnsiete = (Button) findViewById(R.id.btnsiete);
        btnocho = (Button) findViewById(R.id.btnocho);
        btnnueve = (Button) findViewById(R.id.btnnueve);
        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btnmulti = (Button) findViewById(R.id.btnmulti);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnigual = (Button) findViewById(R.id.btnigual);
        etproceso = (EditText) findViewById(R.id.etproceso);


        btnlimpiar = (Button) findViewById(R.id.btnlimpiar);
        etproceso = (EditText) findViewById(R.id.etproceso);

        btncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                etproceso.setText(etconcatenar.getText().toString() + "0");
            }
        });

        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                etproceso.setText(etconcatenar.getText().toString() + "1");
            }
        });

        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                etproceso.setText(etconcatenar.getText().toString() + "2");
            }
        });

        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                etproceso.setText(etconcatenar.getText().toString() + "3");
            }
        });

        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                etproceso.setText(etconcatenar.getText().toString() + "4");
            }
        });

        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                etproceso.setText(etconcatenar.getText().toString() + "5");
            }
        });


        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                etproceso.setText(etconcatenar.getText().toString() + "6");
            }
        });
        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                etproceso.setText(etconcatenar.getText().toString() + "7");
            }
        });

        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                etproceso.setText(etconcatenar.getText().toString() + "8");
            }
        });

        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                etproceso.setText(etconcatenar.getText().toString() + "9");
            }
        });

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etproceso.setText("");

            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etproceso.setText("");

            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etproceso.setText("");

            }
        });


        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                etconcatenar = (EditText) findViewById(R.id.etproceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etproceso.setText("");
            }
        });

        btnlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etproceso.setText("");
            }
        });


        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etconcatenar = (EditText) findViewById(R.id.etproceso);

                numero2 = Double.parseDouble(etconcatenar.getText().toString());
                if (operador.equals("+")) {
                    etproceso.setText("");
                    resultado = numero1 + numero2;

                }

                if (operador.equals("-")) {

                    etproceso.setText("");
                    resultado = numero1 - numero2;

                }
                if (operador.equals("*")) {
                    etproceso.setText("");
                    resultado = numero1 * numero2;
                }

                if (operador.equals("/")) {
                    etproceso.setText("");
                    resultado = numero1 / numero2;

                }


                etproceso.setText(String.valueOf(resultado));

            }
        });


    }

}
