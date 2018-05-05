package com.example.rossy.calculadora;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    public TextView mostrador;
    public TextView historialLabel1;
    public TextView historialLabel2;
    public TextView historialLabel3;
    public TextView historialLabel4;
    public TextView historialLabel5;
    public double operador1, operador2, resultado;
    int operacion;
    int i;
    int size;
    int fiveValues;
    List<String> history= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrador =findViewById(R.id.resultado);
        historialLabel1 = findViewById(R.id.historialLabel1);
        historialLabel2 = findViewById(R.id.historialLabel2);
        historialLabel3 = findViewById(R.id.historialLabel3);
        historialLabel4 = findViewById(R.id.historialLabel4);
        historialLabel5 = findViewById(R.id.historialLabel5);
        for(i = 0; i < 6 ; i++) {
            history.add(i," ");
        }
    }

    public void uno (View view){
        String cap= mostrador.getText().toString();
        cap=cap+"1";
        mostrador.setText(cap);
    }

    public void dos (View view){
        String cap= mostrador.getText().toString();
        cap=cap+"2";
        mostrador.setText(cap);
    }

    public void tres (View view){
        String cap= mostrador.getText().toString();
        cap=cap+"3";
        mostrador.setText(cap);
    }

    public void cuatro (View view){
        String cap= mostrador.getText().toString();
        cap=cap+"4";
        mostrador.setText(cap);
    }

    public void cinco (View view){
        String cap= mostrador.getText().toString();
        cap=cap+"5";
        mostrador.setText(cap);
    }

    public void seis (View view){
        String cap= mostrador.getText().toString();
        cap=cap+"6";
        mostrador.setText(cap);
    }

    public void siete (View view){
        String cap= mostrador.getText().toString();
        cap=cap+"7";
        mostrador.setText(cap);
    }

    public void ocho (View view){
        String cap= mostrador.getText().toString();
        cap=cap+"8";
        mostrador.setText(cap);
    }

    public void nueve (View view){
        String cap= mostrador.getText().toString();
        cap=cap+"9";
        mostrador.setText(cap);
    }

    public void cero (View view){
        String cap= mostrador.getText().toString();
        cap=cap+"0";
        mostrador.setText(cap);
    }

    public void punto (View view){
        String cap= mostrador.getText().toString();
        cap=cap+".";
        mostrador.setText(cap);
    }


    public void suma (View view){
        try {
            String aux1= mostrador.getText().toString();
            operador1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        mostrador.setText("");
        operacion=1;
    }

    public void resta (View view){
        try {
            String aux1= mostrador.getText().toString();
            operador1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        mostrador.setText("");
        operacion=2;
    }

    public void por (View view){
        try {
            String aux1= mostrador.getText().toString();
            operador1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        mostrador.setText("");
        operacion=3;
    }

    public void entre (View view){
        try {
            String aux1= mostrador.getText().toString();
            operador1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        mostrador.setText("");
        operacion=4 ;
    }

    public void igual (View view){
        try {
            String aux2= mostrador.getText().toString();
            operador2=Double.parseDouble(aux2);
        }catch (NumberFormatException nfe){}
        mostrador.setText("");

        if (operacion==1){
            resultado=operador1+operador2;
            history.add(String.valueOf(operador1 + " + " + operador2 + " = " + resultado));

        }
        else if (operacion==2){
            resultado=operador1-operador2;
            history.add(String.valueOf(operador1 + " - " + operador2 + " = " + resultado));
        }
        else if (operacion==3){
            resultado=operador1*operador2;
            history.add(String.valueOf(operador1 + " x " + operador2 + " = " + resultado));
        }
        else if (operacion==4){
            if (operador2==0){
                mostrador.setText("No puede dividir entre 0");
            }else {
                resultado = operador1/operador2;
                history.add(String.valueOf(operador1 + " / " + operador2 + " = " + resultado));
            }
        }

        mostrador.setText(""+resultado);
        operador1=resultado;
        size = history.size() - 1;
        fiveValues = size - 5;
    }

    public void limpiar (View view){
        mostrador.setText("");
        operador1=0.0;
        operador2=0.0;
        resultado=0.0;
        historialLabel1.setText("");
        historialLabel2.setText("");
        historialLabel3.setText("");
        historialLabel4.setText("");
        historialLabel5.setText("");
    }

    public void historial (View view){
        historialLabel1.setText(history.get(size));
        historialLabel2.setText(history.get(size-1));
        historialLabel3.setText(history.get(size-2));
        historialLabel4.setText(history.get(size-3));
        historialLabel5.setText(history.get(size-4));
    }

}
