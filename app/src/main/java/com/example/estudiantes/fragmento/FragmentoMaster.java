package com.example.estudiantes.fragmento;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentoMaster extends Fragment {


    public FragmentoMaster() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento_master, container, false);
    }


    public void agregarFragmento2(View view){
        FragmentManager miManejador =getFragmentManager();
        FragmentTransaction miTransaccion = miManejador.beginTransaction();
        FragmentoMaster miFragmento = new FragmentoMaster();


        miTransaccion.replace(R.id.menu111, miFragmento);

        miTransaccion.commit();
    }
    public void agregarFragmento(View view){
        FragmentManager miManejador =getFragmentManager();
        FragmentTransaction miTransaccion = miManejador.beginTransaction();
        FragmentoMaster miFragmento = new FragmentoMaster();


        miTransaccion.replace(R.id.menu111, miFragmento);

        miTransaccion.commit();

    }
}
