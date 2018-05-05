package com.example.rossy.calculadora;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    public TextView mostrador;
    public double operador1, operador2, resultado;
    int operacion;

    /*
    int contador;


    public void onPause(){
        super.onPause();

        SharedPreferences datos= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor miEditor=datos.edit();

        miEditor.putInt("cuenta", contador);
        miEditor.apply();
    }

    public void onResume(){
        super.onResume();

        SharedPreferences datos= PreferenceManager.getDefaultSharedPreferences(this);

        contador=datos.getInt("cuenta", 0);
        mostrador.setText("" + contador);


    }

*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrador =(TextView)findViewById(R.id.resultado);

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

        }
        else if (operacion==2){
            resultado=operador1-operador2;
        }
        else if (operacion==3){
            resultado=operador1*operador2;
        }
        else if (operacion==4){
            if (operador2==0){
                mostrador.setText("No puede dividir entre 0");
            }else {
                resultado = operador1/operador2;
            }
        }

        mostrador.setText(""+resultado);
        operador1=resultado;
    }

    public void limpiar (View view){
        mostrador.setText("");
        operador1=0.0;
        operador2=0.0;
        resultado=0.0;
    }



}
