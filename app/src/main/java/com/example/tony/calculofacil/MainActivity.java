package com.example.tony.calculofacil;

import android.app.FragmentManager;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button bSumar, bRestar, bProducto, bCociente;
    android.support.v4.app.FragmentManager manejador = getSupportFragmentManager();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bSumar    = (Button)findViewById(R.id.botonSumar);
        bRestar   = (Button)findViewById(R.id.botonRestar);
        bProducto = (Button)findViewById(R.id.botonProducto);
        bCociente = (Button)findViewById(R.id.botonCociente);


        bSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calculos cal = new Calculos();
                manejador.beginTransaction().replace(R.id.pantallaPrincipal, cal).addToBackStack(null).commit();
                            }
        });
        bRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragResto resto = new FragResto();
                manejador.beginTransaction().replace(R.id.pantallaPrincipal, resto).addToBackStack(null).commit();
            }
        });

        bProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentProducto prod = new FragmentProducto();
                manejador.beginTransaction().replace(R.id.pantallaPrincipal, prod).addToBackStack(null).commit();
            }
        });

        bCociente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CocienteFragment divi = new CocienteFragment();
                manejador.beginTransaction().replace(R.id.pantallaPrincipal, divi).addToBackStack(null).commit();
            }
        });


    }




}
