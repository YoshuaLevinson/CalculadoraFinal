package com.example.calculadora;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  String number ="";
    private double num1 = 0;
    private double num2 = 0;
    protected String symbol ="";


    private TextView solucion;
    private Button num_cero,num_uno,num_dos,num_tres,num_cuatro,num_cinco,num_seis,num_siete,num_ocho,num_nueve;
    private Button division,resta,multiplicacion,suma,igual,CE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solucion =  findViewById(R.id.solucion);

        num_cero = findViewById(R.id.num_cero);
        num_uno = findViewById(R.id.num_uno);
        num_dos = findViewById(R.id.num_dos);
        num_tres = findViewById(R.id.num_tres);
        num_cuatro = findViewById(R.id.num_cuatro);
        num_cinco = findViewById(R.id.num_cinco);
        num_seis = findViewById(R.id.num_seis);
        num_siete = findViewById(R.id.num_siete);
        num_ocho = findViewById(R.id.num_ocho);
        num_nueve = findViewById(R.id.num_nueve);

        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        division = findViewById(R.id.division);
        multiplicacion = findViewById(R.id.multiplicacion);
        CE = findViewById(R.id.CE);
        igual =findViewById(R.id.igual);
        //listener for button

        num_cero.setOnClickListener(this);
        num_uno.setOnClickListener(this);
        num_dos.setOnClickListener(this);
        num_tres.setOnClickListener(this);
        num_cuatro.setOnClickListener(this);
        num_cinco.setOnClickListener(this);
        num_seis.setOnClickListener(this);
        num_siete.setOnClickListener(this);
        num_ocho.setOnClickListener(this);
        num_nueve.setOnClickListener(this);

        suma.setOnClickListener(this);
        division.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);
        CE.setOnClickListener(this);
        igual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.num_cero:
                number = number + "0";
                solucion.setText(number);
                break;

            case R.id.num_uno:
                number = number + "1";
                solucion.setText(number);
                break;

            case R.id.num_dos:
                number = number + "2";
                solucion.setText(number);
                break;

            case R.id.num_tres:
                number = number + "3";
                solucion.setText(number);
                break;

            case R.id.num_cuatro:
                number = number + "4";
                solucion.setText(number);
                break;

            case R.id.num_cinco:
                number = number + "5";
                solucion.setText(number);
                break;

            case R.id.num_seis:
                number = number + "6";
                solucion.setText(number);
                break;

            case R.id.num_siete:
                number = number + "7";
                solucion.setText(number);
                break;

            case R.id.num_ocho:
                number = number + "8";
                solucion.setText(number);
                break;

            case R.id.num_nueve:
                number = number + "9";
                solucion.setText(number);
                break;

            case R.id.suma:
                symbol = "+";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.resta:
                symbol = "-";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.division:
                symbol = "/";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.multiplicacion:
                symbol = "X";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.igual:
                num2 = Integer.parseInt(number);

                switch (symbol){
                    case "+":
                        solucion.setText(" "+(num1 + num2));
                        break;
                    case "-":
                        solucion.setText(" "+(num1 - num2));
                        break;
                    case "/":
                        solucion.setText(" "+(num1 / num2));
                        break;
                    case "X":
                        solucion.setText(" "+(num1 * num2));
                        break;
                }

                num1 = 0;
                num2 = 0;
                number = "";

                break;

            case R.id.CE:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                solucion.setText("");
                break;


        }
    }
}
