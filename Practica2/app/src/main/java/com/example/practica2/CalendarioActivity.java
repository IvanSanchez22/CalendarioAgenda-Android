package com.example.practica2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;

public class CalendarioActivity extends AppCompatActivity {

    CalendarView cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calendario);
        cal = findViewById(R.id.calendarView);

        cal.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            int[] fechaArr = {dayOfMonth, month, year};
            Intent intent = new Intent(CalendarioActivity.this, DiaActivity.class);
            intent.putExtra("fecha", fechaArr);
            startActivity(intent);
        });
    }
}