package com.example.practica2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.practica2.DB.DbContactos;
import com.example.practica2.entidades.Contactos;

public class VerActivity extends AppCompatActivity {

    EditText txtNombre, txtTelefono, txtCorreo;
    Button btnGuardar;
    Contactos contacto;
    FloatingActionButton fabEditar, fabEliminar;

    int id = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver);

        txtNombre = findViewById(R.id.txtNombre);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtCorreo = findViewById(R.id.txtCorreoElectronico);
        btnGuardar = findViewById(R.id.btnGuardar);
        fabEditar = findViewById(R.id.fab_editar);
        fabEliminar = findViewById(R.id.fabEliminar);

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
        DbContactos dbContactos = new DbContactos(VerActivity.this);
        contacto = dbContactos.verContacto(id);

        if (contacto != null){
            txtNombre.setText(contacto.getNombre());
            txtTelefono.setText(contacto.getTelefono());
            txtCorreo.setText(contacto.getCorreo());
            btnGuardar.setVisibility(View.INVISIBLE);
            //Para que no me abra el teclado
            txtNombre.setInputType(InputType.TYPE_NULL);
            txtTelefono.setInputType(InputType.TYPE_NULL);
            txtCorreo.setInputType(InputType.TYPE_NULL);
        }



        fabEliminar.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(VerActivity.this);
            builder.setMessage("¿Desea eliminar este contacto?");
            builder.setPositiveButton("SI", (dialogInterface, i) -> {

                if (dbContactos.eliminarContacto(id)) {
                    lista();
                }
            });
            builder.setNegativeButton("NO", (dialogInterface, i) -> {

            });
            AlertDialog alert = builder.create();
            alert.show();
            Button buttonColorNegative = alert.getButton(DialogInterface.BUTTON_NEGATIVE);
            buttonColorNegative.setTextColor(Color.BLACK);

            Button buttonColorPositive = alert.getButton(DialogInterface.BUTTON_POSITIVE);
            buttonColorPositive.setTextColor(Color.BLACK);

        });







    }

    private void lista(){
        Intent i = new Intent(this, ListaContactos.class);
        startActivity(i);
    }

    public void editar(View view){
        Intent i = new Intent(VerActivity.this, EditarAgenda.class);
        i.putExtra("ID", id);
        startActivity(i);
    }



}

