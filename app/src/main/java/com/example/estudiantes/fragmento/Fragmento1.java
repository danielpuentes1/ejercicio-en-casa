package com.example.estudiantes.fragmento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
public class Fragmento1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmento1);

        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion = miManejador.beginTransaction();
        FragmentoMaster miFragmento = new FragmentoMaster();
        miTransaccion.add(R.id.menu111, miFragmento);

        miTransaccion.commit();

    }
    public void agregarFragmento(View view){
        FragmentManager miManejador =getFragmentManager();
        FragmentTransaction miTransaccion = miManejador.beginTransaction();
        FragmentoMaster miFragmento = new FragmentoMaster();


        miTransaccion.add(R.id.menu111, miFragmento);

        miTransaccion.commit();

    }
    public void agregarFragmento2(View view){
        FragmentManager miManejador =getFragmentManager();
        FragmentTransaction miTransaccion = miManejador.beginTransaction();
        FragmentoMaster miFragmento = new FragmentoMaster();


        miTransaccion.add(R.id.menu111, miFragmento);

        miTransaccion.commit();
}
}
