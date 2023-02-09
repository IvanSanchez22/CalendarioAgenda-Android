package com.example.practica2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Calendar;

public class SemanaActivity extends AppCompatActivity {

    private Calendar fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semana);
        fecha = Calendar.getInstance();

    }

    public void verLunes(View view) {
        if(fecha.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            fecha.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        } else {
            fecha.add(Calendar.DAY_OF_YEAR, -6);
        }
        int[] afecha = {fecha.get(Calendar.DATE), fecha.get(Calendar.MONTH), fecha.get(Calendar.YEAR)};
        Intent intent = new Intent(SemanaActivity.this, DiaActivity.class);
        intent.putExtra("fecha", afecha);
        startActivity(intent);
    }

    public void verMartes(View view) {
        if(fecha.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            fecha.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        } else {
            fecha.add(Calendar.DAY_OF_YEAR, -5);
        }
        int[] afecha = {fecha.get(Calendar.DATE), fecha.get(Calendar.MONTH), fecha.get(Calendar.YEAR)};
        Intent intent = new Intent(SemanaActivity.this, DiaActivity.class);
        intent.putExtra("fecha", afecha);
        startActivity(intent);
    }

    public void verMiercoles(View view) {
        if(fecha.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            fecha.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        } else {
            fecha.add(Calendar.DAY_OF_YEAR, -4);
        }
        int[] afecha = {fecha.get(Calendar.DATE), fecha.get(Calendar.MONTH), fecha.get(Calendar.YEAR)};
        Intent intent = new Intent(SemanaActivity.this, DiaActivity.class);
        intent.putExtra("fecha", afecha);
        startActivity(intent);
    }

    public void verJueves(View view) {
        if(fecha.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            fecha.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
        } else {
            fecha.add(Calendar.DAY_OF_YEAR, -3);
        }
        int[] afecha = {fecha.get(Calendar.DATE), fecha.get(Calendar.MONTH), fecha.get(Calendar.YEAR)};
        Intent intent = new Intent(SemanaActivity.this, DiaActivity.class);
        intent.putExtra("fecha", afecha);
        startActivity(intent);
    }

    public void verViernes(View view) {
        if(fecha.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            fecha.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        } else {
            fecha.add(Calendar.DAY_OF_YEAR, -2);
        }
        int[] afecha = {fecha.get(Calendar.DATE), fecha.get(Calendar.MONTH), fecha.get(Calendar.YEAR)};
        Intent intent = new Intent(SemanaActivity.this, DiaActivity.class);
        intent.putExtra("fecha", afecha);
        startActivity(intent);
    }

    public void verSabado(View view) {
        if(fecha.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            fecha.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        } else {
            fecha.add(Calendar.DAY_OF_YEAR, -1);
        }
        int[] afecha = {fecha.get(Calendar.DATE), fecha.get(Calendar.MONTH), fecha.get(Calendar.YEAR)};
        Intent intent = new Intent(SemanaActivity.this, DiaActivity.class);
        intent.putExtra("fecha", afecha);
        startActivity(intent);
    }

    public void verDomingo(View view) {
        if(fecha.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            fecha.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
            fecha.add(Calendar.DAY_OF_YEAR, 1);
        }
        int[] afecha = {fecha.get(Calendar.DATE), fecha.get(Calendar.MONTH), fecha.get(Calendar.YEAR)};
        Intent intent = new Intent(SemanaActivity.this, DiaActivity.class);
        intent.putExtra("fecha", afecha);
        startActivity(intent);
    }
}