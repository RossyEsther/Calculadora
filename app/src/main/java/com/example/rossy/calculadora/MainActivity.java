package com.example.rossy.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    public TextView mostrador;
    public TextView historicalFirstPosition;
    public TextView historicalSecondPosition;
    public TextView historicalThirdPosition;
    public TextView historicalFourthPosition;
    public TextView historicalFifthPosition;
    public double operator1, operator2, resultant;
    int operation,index,size,fiveValues;
    List<String> historical = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrador =findViewById(R.id.resultado);
        historicalFirstPosition = findViewById(R.id.historialLabel1);
        historicalSecondPosition = findViewById(R.id.historialLabel2);
        historicalThirdPosition = findViewById(R.id.historialLabel3);
        historicalFourthPosition = findViewById(R.id.historialLabel4);
        historicalFifthPosition = findViewById(R.id.historialLabel5);
        for(index = 0; index < 6 ; index++) {
            historical.add(index," ");
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
            operator1 =Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        mostrador.setText("");
        operation =1;
    }

    public void resta (View view){
        try {
            String aux1= mostrador.getText().toString();
            operator1 =Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        mostrador.setText("");
        operation =2;
    }

    public void por (View view){
        try {
            String aux1= mostrador.getText().toString();
            operator1 =Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        mostrador.setText("");
        operation =3;
    }

    public void entre (View view){
        try {
            String aux1= mostrador.getText().toString();
            operator1 =Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        mostrador.setText("");
        operation =4 ;
    }

    public void igual (View view){
        try
        {
            String aux2= mostrador.getText().toString();
            operator2 = Double.parseDouble(aux2);
        }
        catch (NumberFormatException nfe){}

        mostrador.setText("");

        if (operation == 1){
            resultant = operator1 + operator2;
            historical.add(String.valueOf(operator1 + " + " + operator2 + " = " + resultant));

        }
        else if (operation == 2){
            resultant = operator1 - operator2;
            historical.add(String.valueOf(operator1 + " - " + operator2 + " = " + resultant));
        }
        else if (operation == 3){
            resultant = operator1 * operator2;
            historical.add(String.valueOf(operator1 + " x " + operator2 + " = " + resultant));
        }
        else if (operation == 4){

            if (operator2 == 0){
                mostrador.setText("No puede dividir entre 0");
            }else {
                resultant = operator1 / operator2;
                historical.add(String.valueOf(operator1 + " / " + operator2 + " = " + resultant));
            }
        }

        mostrador.setText(""+ resultant);
        operator1 = resultant;
        size = historical.size() - 1;
        fiveValues = size - 5;
    }

    public void limpiar (View view){
        mostrador.setText("");
        operator1 =0.0;
        operator2 =0.0;
        resultant =0.0;
        historicalFirstPosition.setText("");
        historicalSecondPosition.setText("");
        historicalThirdPosition.setText("");
        historicalFourthPosition.setText("");
        historicalFifthPosition.setText("");
    }

    public void historial (View view){
        historicalFirstPosition.setText(historical.get(size));
        historicalSecondPosition.setText(historical.get(size-1));
        historicalThirdPosition.setText(historical.get(size-2));
        historicalFourthPosition.setText(historical.get(size-3));
        historicalFifthPosition.setText(historical.get(size-4));
    }

}
