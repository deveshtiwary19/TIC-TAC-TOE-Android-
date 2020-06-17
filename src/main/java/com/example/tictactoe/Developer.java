package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Developer extends AppCompatActivity {

    public void back(View view){
        Intent inte=new Intent(this,MainActivity.class);
        startActivity(inte);
        this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        TextView tv=(TextView)findViewById(R.id.textView15);
        TextView tv2=(TextView)findViewById(R.id.textView16);
        TextView tv3=(TextView)findViewById(R.id.textView17);
        ListView list1=(ListView)findViewById(R.id.listView);

        tv.setTranslationX(-2000);
        tv2.setTranslationX(2000);
        tv3.setAlpha(0);

        tv.animate().translationXBy(2000).setDuration(2000);
        tv2.animate().translationXBy(-2000).setDuration(2000);
        tv3.animate().alpha(1).setDuration(2500);

        ArrayList<String> list=new ArrayList<String>();
        list.add("A developers Group,BCET Durgapur");
        list.add("Contact: 7491036593");
        list.add("Email: codefreaksdevelopers@gmail.com");
        list.add("Devesh Tiwary,CodeFreaks");

        ArrayAdapter<String> Adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        list1.setAdapter(Adapter);

        list1.animate().alpha(1).setDuration(3500);


    }
}
