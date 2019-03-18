package com.example.tony.calculofacil;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Operaciones  {


    public static void Sumar(View vista){
       EditText numero1= (EditText)vista.findViewById(R.id.num1);

        EditText numero2= (EditText)vista.findViewById(R.id.num2);


        TextView resul = (TextView) vista.findViewById(R.id.txtVresultadoSuma);


        int n1 = Integer.parseInt(numero1.getText().toString());
        int n2 = Integer.parseInt(numero2.getText().toString());
        if(00000 < n1 && n2 < 100000){
            int resultado = n1 + n2;
            resul.setText("La suma es : " + "\n" + resultado);
        }else Toast.makeText(vista.getContext(),"SUPERA LIMITE DE DIGITOS ´6´ ",Toast.LENGTH_SHORT).show();

    }

    public static void Restar(View vistaResto){

        EditText numero1= (EditText)vistaResto.findViewById(R.id.num1r);
        EditText numero2= (EditText)vistaResto.findViewById(R.id.num2r);
        TextView resul  = (TextView) vistaResto.findViewById(R.id.txtVresultadoResta);

        int n1 = Integer.parseInt(numero1.getText().toString());
        int n2 = Integer.parseInt(numero2.getText().toString());
        if(00000 < n1 && n2 < 100000){
            int resultado = n1 - n2;
            resul.setText("La Resta ó diferencia es : "
                    + "\n" + resultado);
        }else Toast.makeText(vistaResto.getContext(),"SUPERA LIMITE DE DIGITOS ´6´ ",Toast.LENGTH_SHORT).show();


    }
    public static void Producto(View vistaProducto){
        EditText numero1= (EditText)vistaProducto.findViewById(R.id.num1p);
        EditText numero2= (EditText)vistaProducto.findViewById(R.id.num2p);
        TextView resul = (TextView) vistaProducto.findViewById(R.id.txtVresultado);

        int n1 = Integer.parseInt(numero1.getText().toString());
        int n2 = Integer.parseInt(numero2.getText().toString());
        if(00000 < n1 && n2 < 100000){
            int resultado = n1 * n2;
            resul.setText("La Multiplicacion" + "\n" +
                    " ó producto es : " + "\n" +
                    resultado);
        }else Toast.makeText(vistaProducto.getContext(),"SUPERA LIMITE DE DIGITOS ´6´ ",Toast.LENGTH_SHORT).show();



    }

    public static void Dividir(View vistaCociente){
        EditText numero1= (EditText)vistaCociente.findViewById(R.id.numDividendo);
        EditText numero2= (EditText)vistaCociente.findViewById(R.id.numDivisor);
        TextView resul = (TextView) vistaCociente.findViewById(R.id.resultadoCociente);
        TextView restoD = (TextView) vistaCociente.findViewById(R.id.restoCociente);

        int n1 = Integer.parseInt(numero1.getText().toString());
        int n2 = Integer.parseInt(numero2.getText().toString());
        int cociente = 0;
        int resto = 0;
        if(n2 != 0 && n1>n2){
            if(00000 < n1 && n2 < 100000){cociente = n1/ n2;
                resto = n1 % n2;
            } else Toast.makeText(vistaCociente.getContext(),"SUPERA LIMITE DE DIGITOS ´6´ ",Toast.LENGTH_SHORT).show();


        }
        resul.setText("La divicion" + "\n" +
                " ó cociente es : " + "\n" + cociente);
        restoD.setText("el resto " + "\n" +
                " ó residuo es : " + "\n" + resto);
        if (n2 == 0){
            Toast.makeText(vistaCociente.getContext(),"No se puede operar con CERO",Toast.LENGTH_SHORT).show();
        }
    }



}
