package com.example.practica2;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.practica2.DB.DbContactos;
import com.example.practica2.entidades.Contactos;

public class EditarAgenda extends AppCompatActivity {

    EditText txtNombre, txtTelefono, txtCorreo;
    Button btnGuardar;
    FloatingActionButton fabEditar, fabEliminar;
    Contactos contacto;
    boolean correcto = false;
    int id = 0;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver);

        txtNombre = findViewById(R.id.txtNombre);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtCorreo = findViewById(R.id.txtCorreoElectronico);
        btnGuardar = findViewById(R.id.btnGuardar);
        fabEditar = findViewById(R.id.fab_editar);
        fabEditar.setVisibility(View.INVISIBLE);
        fabEliminar = findViewById(R.id.fabEliminar);
        fabEliminar.setVisibility(View.INVISIBLE);

        if (savedInstanceState == null){
            Bundle extras = getIntent().getExtras();
            if (extras == null){
                id = Integer.parseInt(null);
            }else{
                id = extras.getInt("ID");
            }
        }else{
            id = (int) savedInstanceState.getSerializable("ID");
        }
        DbContactos dbContactos = new DbContactos(EditarAgenda.this);
        contacto = dbContactos.verContacto(id);

        if (contacto != null){
            txtNombre.setText(contacto.getNombre());
            txtTelefono.setText(contacto.getTelefono());
            txtCorreo.setText(contacto.getCorreo());

        }

        btnGuardar.setOnClickListener(view -> {
            if(!txtNombre.getText().toString().equals("") && !txtTelefono.getText().toString().equals("")){
                correcto = dbContactos.editarContacto(id, txtNombre.getText().toString(), txtTelefono.getText().toString(), txtCorreo.getText().toString());
                if (correcto){
                    Toast.makeText(EditarAgenda.this, "Contacto Modificado", Toast.LENGTH_SHORT).show();
                    verRegistro();
                }else{
                    Toast.makeText(EditarAgenda.this, "Error al modificar Contacto", Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(EditarAgenda.this, "Los campos nombre y teléfono son obligatorios", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void verRegistro(){
        Intent i = new Intent(this, ListaContactos.class );
        i.putExtra("ID", id);
        startActivity(i);
    }

}
