package com.example.tony.calculofacil;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class CocienteFragment extends Fragment {

    private Button calcular;
    public CocienteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View vistaCociente = inflater.inflate(R.layout.fragment_cociente, container, false);
        Button calcular = (Button)vistaCociente.findViewById(R.id.bCalcularCociente);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operaciones.Dividir(vistaCociente);
            }
        });


        return vistaCociente;
    }

}
