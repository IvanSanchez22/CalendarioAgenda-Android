package com.example.practica2;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        File file = new File(getFilesDir(), "calendario.bin");
        Calendario calendario = Calendario.getInstance(file);

    }

    public void abrirCalendario(View view) {
        Intent i = new Intent(MainActivity.this, CalendarioActivity.class);
        startActivity(i);
    }

    public void verSemana(View view) {
        Intent i = new Intent(MainActivity.this, SemanaActivity.class);
        startActivity(i);
    }

    public void anadirTarea(View view) {
        Intent i = new Intent(MainActivity.this, NewTareaActivity.class);
        startActivity(i);
    }

    public void abrirHorario(View view) {
        Intent i = new Intent(MainActivity.this, HorarioActivity.class);
        startActivity(i);
    }

    public void verListado(View view) {
        Intent i = new Intent(MainActivity.this, ListaContactos.class);
        startActivity(i);
    }

    public void reproductorMusica(View view){
        Intent i = new Intent(MainActivity.this, ReproductorMusica.class);
        startActivity(i);

    }

    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode == event.KEYCODE_BACK){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("¿Desea salir de Calendar Urjc?")
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_MAIN);
                            intent.addCategory(Intent.CATEGORY_HOME);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();
            Button buttonColorNegative = alert.getButton(DialogInterface.BUTTON_NEGATIVE);
            buttonColorNegative.setTextColor(Color.BLACK);

            Button buttonColorPositive = alert.getButton(DialogInterface.BUTTON_POSITIVE);
            buttonColorPositive.setTextColor(Color.BLACK);
        }
        return super.onKeyDown(keyCode, event);
    }


    public void showHelp(View view) {
        ContextThemeWrapper newContext = new ContextThemeWrapper(this, R.style.Theme_practica2_Dialog);
        AlertDialog.Builder builderAD = new AlertDialog.Builder(newContext);
        builderAD.setTitle("AYUDA");
        builderAD.setMessage(R.string.texto_ayuda);
        builderAD.setPositiveButton("OK", null);
        builderAD.create().show();
    }

}