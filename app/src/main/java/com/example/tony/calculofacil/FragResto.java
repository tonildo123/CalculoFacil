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
public class FragResto extends Fragment {


    public FragResto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View vistaResto =inflater.inflate(R.layout.fragment_frag_resto, container, false);

        Button bCalculoRestar = (Button)vistaResto.findViewById(R.id.bRestar);
        bCalculoRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operaciones.Restar(vistaResto);
            }
        });
        return vistaResto;
    }

}
