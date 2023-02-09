package com.example.practica2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ReproductorMusica extends AppCompatActivity {

    Button play_pause, btn_repetir;
    MediaPlayer mp;
    ImageView iv;
    int repetir = 2, position = 0;

    MediaPlayer[] vectormp = new MediaPlayer[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor_musica);

         play_pause = (Button) findViewById(R.id.btn_play);
         btn_repetir = (Button) findViewById(R.id.btn_repetir);
         iv = (ImageView) findViewById(R.id.portada);

         vectormp[0] = MediaPlayer.create(this, R.raw.first_song);
         vectormp[1] = MediaPlayer.create(this, R.raw.second_song);
         vectormp[2] = MediaPlayer.create(this, R.raw.third_song);
         vectormp[3] = MediaPlayer.create(this, R.raw.fourth_song);
         vectormp[4] = MediaPlayer.create(this, R.raw.fifth_song);
    }


    public void onBackPressed(){
        if(vectormp[position] != null){
            vectormp[position].stop();
            vectormp[0] = MediaPlayer.create(this, R.raw.first_song);
            vectormp[1] = MediaPlayer.create(this, R.raw.second_song);
            vectormp[2] = MediaPlayer.create(this, R.raw.third_song);
            vectormp[3] = MediaPlayer.create(this, R.raw.fourth_song);
            vectormp[4] = MediaPlayer.create(this, R.raw.fifth_song);
            position = 0;
            play_pause.setBackgroundResource(R.drawable.reproducir);
            iv.setImageResource(R.drawable.portada1);
            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();

        }
        Intent i = new Intent(ReproductorMusica.this, MainActivity.class);
        startActivity(i);
    }


    public void playPause(View view){
        if (vectormp[position].isPlaying()){
            vectormp[position].pause();
            play_pause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this, "Canción Pausada", Toast.LENGTH_SHORT).show();
        }else{
            vectormp[position].start();
            play_pause.setBackgroundResource(R.drawable.pausa);
            Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
        }
    }

    public void stop(View view){
        if(vectormp[position] != null){
            vectormp[position].stop();
            vectormp[0] = MediaPlayer.create(this, R.raw.first_song);
            vectormp[1] = MediaPlayer.create(this, R.raw.second_song);
            vectormp[2] = MediaPlayer.create(this, R.raw.third_song);
            vectormp[3] = MediaPlayer.create(this, R.raw.fourth_song);
            vectormp[4] = MediaPlayer.create(this, R.raw.fifth_song);
            position = 0;
            play_pause.setBackgroundResource(R.drawable.reproducir);
            iv.setImageResource(R.drawable.portada1);
            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();

        }

    }

    public void Repetir(View view){
        if(repetir == 1){
            btn_repetir.setBackgroundResource(R.drawable.no_repetir);
            Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show();
            vectormp[position].setLooping(false);
            repetir = 2;
        }else{
            btn_repetir.setBackgroundResource(R.drawable.repetir);
            Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show();
            vectormp[position].setLooping(true);
            repetir = 1;

        }
    }

    public void siguiente(View view){
        if(position < vectormp.length - 1){
            if(vectormp[position].isPlaying()){
                vectormp[position].stop();
                position++;
                vectormp[position].start();
               switch (position){
                   case 0: iv.setImageResource(R.drawable.portada1);
                           break;
                   case 1: iv.setImageResource(R.drawable.portada2);
                           break;
                   case 2: iv.setImageResource(R.drawable.portada3);
                           break;
                   case 3: iv.setImageResource(R.drawable.portada4);
                           break;
                   case 4: iv.setImageResource(R.drawable.portada5);
                           break;
               }
            }else{
                position++;
                switch (position){
                    case 0: iv.setImageResource(R.drawable.portada1);
                        break;
                    case 1: iv.setImageResource(R.drawable.portada2);
                        break;
                    case 2: iv.setImageResource(R.drawable.portada3);
                        break;
                    case 3: iv.setImageResource(R.drawable.portada4);
                        break;
                    case 4: iv.setImageResource(R.drawable.portada5);
                        break;
                }

            }

        }else{
            Toast.makeText(this, "No hay más canciones disponibles", Toast.LENGTH_SHORT).show();
        }
    }

    public void  anterior(View view){
        if(position != 0){
            if(vectormp[position].isPlaying()){
                vectormp[position].stop();
                vectormp[0] = MediaPlayer.create(this, R.raw.first_song);
                vectormp[1] = MediaPlayer.create(this, R.raw.second_song);
                vectormp[2] = MediaPlayer.create(this, R.raw.third_song);
                vectormp[3] = MediaPlayer.create(this, R.raw.fourth_song);
                vectormp[4] = MediaPlayer.create(this, R.raw.fifth_song);
                position--;

                switch (position){
                    case 0: iv.setImageResource(R.drawable.portada1);
                        break;
                    case 1: iv.setImageResource(R.drawable.portada2);
                        break;
                    case 2: iv.setImageResource(R.drawable.portada3);
                        break;
                    case 3: iv.setImageResource(R.drawable.portada4);
                        break;
                    case 4: iv.setImageResource(R.drawable.portada5);
                        break;
                }
                vectormp[position].start();

            }else{
                position--;
                switch (position){
                    case 0: iv.setImageResource(R.drawable.portada1);
                        break;
                    case 1: iv.setImageResource(R.drawable.portada2);
                        break;
                    case 2: iv.setImageResource(R.drawable.portada3);
                        break;
                    case 3: iv.setImageResource(R.drawable.portada4);
                        break;
                    case 4: iv.setImageResource(R.drawable.portada5);
                        break;
                }

            }

        }else{
            Toast.makeText(this, "No hay más canciones disponibles", Toast.LENGTH_SHORT).show();
        }
    }

}