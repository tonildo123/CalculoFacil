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
public class FragmentProducto extends Fragment {


    public FragmentProducto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View vistaProducto =  inflater.inflate(R.layout.fragment_fragment_producto, container, false);
        Button bCalculoProducto = (Button)vistaProducto.findViewById(R.id.bProducto);
        bCalculoProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operaciones.Producto(vistaProducto);
            }
        });

        return vistaProducto;
    }

}
