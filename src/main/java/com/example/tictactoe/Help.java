package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Help extends AppCompatActivity {

    public void back(View view){
        this.finish();

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView tv1=(TextView)findViewById(R.id.textView);
        TextView tv2=(TextView)findViewById(R.id.textView2);
        TextView tv3=(TextView)findViewById(R.id.textView3);
        TextView tv4=(TextView)findViewById(R.id.textView4);
        TextView tv5=(TextView)findViewById(R.id.textView5);
        TextView tv6=(TextView)findViewById(R.id.textView6);
        TextView tv7=(TextView)findViewById(R.id.textView7);
        TextView tv8=(TextView)findViewById(R.id.textView8);
        TextView tv9=(TextView)findViewById(R.id.textView9);
        TextView tv10=(TextView)findViewById(R.id.textView10);
        TextView tv11=(TextView)findViewById(R.id.textView11);
        TextView tv12=(TextView)findViewById(R.id.textView12);
        Button b1=(Button)findViewById(R.id.button2);

        tv1.setAlpha(0);
        tv2.setAlpha(0);
        tv3.setAlpha(0);
        tv4.setAlpha(0);
        tv5.setAlpha(0);
        tv6.setAlpha(0);
        tv7.setAlpha(0);
        tv8.setAlpha(0);
        tv9.setAlpha(0);
        tv10.setAlpha(0);
        tv11.setAlpha(0);
        tv12.setAlpha(0);
        b1.setAlpha(0);


        tv1.animate().alpha(1).setDuration(2000);
        tv2.animate().alpha(1).setDuration(2000);
        tv3.animate().alpha(1).setDuration(2000);
        tv4.animate().alpha(1).setDuration(2000);
        tv5.animate().alpha(1).setDuration(2000);
        tv6.animate().alpha(1).setDuration(2000);
        tv7.animate().alpha(1).setDuration(2000);
        tv8.animate().alpha(1).setDuration(2000);
        tv9.animate().alpha(1).setDuration(2000);
        tv10.animate().alpha(1).setDuration(2000);
        tv11.animate().alpha(1).setDuration(2000);
        tv12.animate().alpha(1).setDuration(2000);
        b1.animate().alpha(1).setDuration(2000);








    }
}
