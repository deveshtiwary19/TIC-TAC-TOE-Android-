package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer song;
    public void playHelp(View view){
        Intent intent=new Intent(this,Help.class);
        startActivity(intent);
        this.finish();
        song.stop();

    }

public void developer(View view){
        Intent intent=new Intent(this,Developer.class);
        startActivity(intent);
        song.stop();
        this.finish();
}

public void Start(View view){
        Intent i=new Intent(this,Game.class);
        startActivity(i);
        song.stop();
        this.finish();
}




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song=MediaPlayer.create(this,R.raw.song);
        song.setLooping(true);
        song.start();








    }
}
