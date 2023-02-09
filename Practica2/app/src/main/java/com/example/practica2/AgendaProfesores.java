package com.example.practica2;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.practica2.DB.DbContactos;


public class AgendaProfesores extends AppCompatActivity{
    private EditText et_nombre, et_numero, et_correo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        et_nombre = findViewById(R.id.TxtNombre);
        et_numero =  findViewById(R.id.TxtPhone);
        et_correo = findViewById(R.id.TxtCorreo);

    }

     public void guardar(View view){
        DbContactos dbContactos = new DbContactos(AgendaProfesores.this);
         if (!et_nombre.getText().toString().isEmpty() && !et_numero.getText().toString().isEmpty()) {
             long id = dbContactos.insertarContacto(et_nombre.getText().toString(), et_numero.getText().toString(), et_correo.getText().toString());
             if (id > 0){
                 Toast.makeText(this, "Registro guardado", Toast.LENGTH_SHORT).show();
                 limpiarEditTexts();
             }else{
                 Toast.makeText(this, "Ha ocurrido algún problema", Toast.LENGTH_SHORT).show();
             }
         } else{
            Toast.makeText(this, "Los campos nombre y numero son obligatorios", Toast.LENGTH_SHORT).show();
        }

     }

    public void onBackPressed(){
        Intent i = new Intent(AgendaProfesores.this, ListaContactos.class);
        startActivity(i);
    }

    public void abrirListado(View view) {
        Intent i = new Intent(AgendaProfesores.this, ListaContactos.class);
        startActivity(i);
    }

     private void limpiarEditTexts(){
        et_nombre.setText("");
        et_numero.setText("");
        et_correo.setText("");
     }


}
