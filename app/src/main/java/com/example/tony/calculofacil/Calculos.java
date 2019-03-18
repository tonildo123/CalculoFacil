package com.example.tony.calculofacil;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Calculos extends Fragment {



    private Button bCalculoSuma;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View vistaSuma = inflater.inflate(R.layout.fragment_calculos, container, false);

        bCalculoSuma = (Button)vistaSuma.findViewById(R.id.bSumar);
        bCalculoSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operaciones.Sumar(vistaSuma);


            }
        });

        return vistaSuma;
    }

}
