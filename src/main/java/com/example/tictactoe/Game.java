package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity {
    // 0:Yellow(Player1)
    // 1:Red(Player2)
    // 2:Empty
    //3: Game won,,needs Redraw
    int WinningPosition[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{2,4,6},{0,4,8}};
    int[] GameStatus={2,2,2,2,2,2,2,2,2};
    int counter=0;

    int p1=0,p2=0; //following are the variables to store points
    public void Tapped(View view) {

        ImageView v = (ImageView) view;
        TextView v1=(TextView)findViewById(R.id.textView4);
        TextView v2=(TextView)findViewById(R.id.textView5);

        MediaPlayer  m1=MediaPlayer.create(this,R.raw.win);
        MediaPlayer m2=MediaPlayer.create(this,R.raw.moves);


        int tag = Integer.parseInt(v.getTag().toString());

        if (GameStatus[tag] == 2) {
            v.setTranslationY(-2000f);
            GameStatus[tag] = counter;
            if (counter == 0) {
                counter = 1;
                v.setImageResource(R.drawable.yellow);
            } else {
                counter = 0;
                v.setImageResource(R.drawable.red);
            }

            v.animate().translationYBy(2000f).rotation(3600).setDuration(200);
            m2.start();

            //Here Detecting that a player has won
            for (int[] winningPosition : WinningPosition) {
                if (GameStatus[winningPosition[0]] == GameStatus[winningPosition[1]] && GameStatus[winningPosition[1]] == GameStatus[winningPosition[2]] && GameStatus[winningPosition[0]] != 2) {
                    //Dection for winner will be done.
                    m1.start();
                    GameStatus = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3};
                    if (counter == 1) {
                        Toast.makeText(this, "PONITS!! Player 1", Toast.LENGTH_SHORT).show();
                        p1++;
                        String score=String.valueOf(p1);
                        v1.setText(score);
                    } else {
                        Toast.makeText(this, "POINTS!! Player 2", Toast.LENGTH_SHORT).show();
                        p2++;
                        String score1=String.valueOf(p2);

                        v2.setText("           " + score1);
                    }

                }

            }
        }
        else if(GameStatus[tag] == 3){
            Toast.makeText(this, "Match Over!! ReDraw the Board!!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Invalid Move!!", Toast.LENGTH_SHORT).show();
            MediaPlayer m =MediaPlayer.create(this,R.raw.invalid);
            m.start();
        }
    }

    public void redraw(View view){

        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.redraw);
        mediaPlayer.start();
        GameStatus= new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2};
        ImageView view1=(ImageView)findViewById(R.id.imageView1);
        ImageView view2=(ImageView)findViewById(R.id.imageView2);
        ImageView view3=(ImageView)findViewById(R.id.imageView3);

        ImageView view4=(ImageView)findViewById(R.id.imageView4);
        ImageView view5=(ImageView)findViewById(R.id.imageView5);
        ImageView view6=(ImageView)findViewById(R.id.imageView6);

        ImageView view7=(ImageView)findViewById(R.id.imageView7);
        ImageView view8=(ImageView)findViewById(R.id.imageView8);
        ImageView view9=(ImageView)findViewById(R.id.imageView9);

        view1.setImageDrawable(null);
        view2.setImageDrawable(null);
        view3.setImageDrawable(null);
        view4.setImageDrawable(null);
        view5.setImageDrawable(null);
        view6.setImageDrawable(null);
        view7.setImageDrawable(null);
        view8.setImageDrawable(null);
        view9.setImageDrawable(null);



    }

    public void NewGame(View view){
        MediaPlayer mediaPlayer= MediaPlayer.create(this,R.raw.newgame);
        mediaPlayer.start();
        GameStatus= new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2};
        ImageView view1=(ImageView)findViewById(R.id.imageView1);
        ImageView view2=(ImageView)findViewById(R.id.imageView2);
        ImageView view3=(ImageView)findViewById(R.id.imageView3);

        ImageView view4=(ImageView)findViewById(R.id.imageView4);
        ImageView view5=(ImageView)findViewById(R.id.imageView5);
        ImageView view6=(ImageView)findViewById(R.id.imageView6);

        ImageView view7=(ImageView)findViewById(R.id.imageView7);
        ImageView view8=(ImageView)findViewById(R.id.imageView8);
        ImageView view9=(ImageView)findViewById(R.id.imageView9);

        view1.setImageDrawable(null);
        view2.setImageDrawable(null);
        view3.setImageDrawable(null);
        view4.setImageDrawable(null);
        view5.setImageDrawable(null);
        view6.setImageDrawable(null);
        view7.setImageDrawable(null);
        view8.setImageDrawable(null);
        view9.setImageDrawable(null);

        p1=0;
        p2=0;

        TextView v1=(TextView)findViewById(R.id.textView4);
        TextView v2=(TextView)findViewById(R.id.textView5);

        v1.setText(""+p1);
        v2.setText("           "+p2);

        counter=0;
    }
public void  back(View view){
        this.finish();
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        MediaPlayer mediaPlayer= MediaPlayer.create(this,R.raw.newgame);
        mediaPlayer.start();

        p1=0;
        p2=0;
        GameStatus=new int[]{2,2,2,2,2,2,2,2,2};
        counter=0;
    }
}
