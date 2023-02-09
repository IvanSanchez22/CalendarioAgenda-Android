package com.example.practica2;

import android.widget.SearchView;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.example.practica2.DB.DbContactos;
import com.example.practica2.adaptadores.ListaContactosAdapter;
import com.example.practica2.entidades.Contactos;

import java.util.ArrayList;

public class ListaContactos extends AppCompatActivity implements SearchView.OnQueryTextListener {

    SearchView txtBuscar;
    RecyclerView listaContactos;
    ArrayList<Contactos> listaArrayContactos;
    ListaContactosAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listacontactos);

        txtBuscar = findViewById(R.id.txtBuscar);
        listaContactos = findViewById(R.id.listaContactos);
        listaContactos.setLayoutManager(new LinearLayoutManager(this));

        DbContactos dbContactos = new DbContactos(ListaContactos.this);
        listaArrayContactos = new ArrayList<>();

        adapter = new ListaContactosAdapter(dbContactos.mostrarProfesores());
        listaContactos.setAdapter(adapter);

        txtBuscar.setOnQueryTextListener(this);
    }


    public void onBackPressed(){
        Intent i = new Intent(ListaContactos.this, MainActivity.class);
        startActivity(i);
    }

    public void registrar(View view){
        Intent i = new Intent(ListaContactos.this, AgendaProfesores.class);
        startActivity(i);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        adapter.buscarProfesor(s);
        return false;
    }
}
