package com.example.arthur.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int myActivePlayer=0;
    int myGameState[]={2,2,2,2,2,2,2,2,2};

    public void imageTapped(View view){
        ImageView myTapped=(ImageView) view;

        //Log.i("tag is","image no. is"+myTapped.getTag().toString());
            int tappedImageTag = Integer.parseInt(myTapped.getTag().toString());
    if (myGameState[tappedImageTag]==2) {
        myGameState[tappedImageTag]=myActivePlayer;
        if (myActivePlayer == 0) {

            myTapped.setImageResource(R.drawable.cross);
            myTapped.animate().rotation(360).setDuration(1000);
            myActivePlayer = 1;
        } else {
            myTapped.setImageResource(R.drawable.circle);
            myTapped.animate().getInterpolator();
            myActivePlayer = 0;
        }

    }
    else
    {
        Toast.makeText(getApplicationContext(),"You have already tapped on it..", Toast.LENGTH_SHORT).show();
    }
    }

    public void playAgain(View view){

        myActivePlayer=0;

        for (int i=0; i<myGameState.length; i++)
        {
            myGameState[i]=2;
        }

        LinearLayout   linearLayout=(LinearLayout)findViewById(R.id.lineOne);
        for (int i=0; i < linearLayout.getChildCount(); i++)
             {
                 ((ImageView)linearLayout.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
             }
        LinearLayout   linearLayout1=(LinearLayout)findViewById(R.id.lineTwo);
        for (int i=0; i < linearLayout1.getChildCount(); i++)
        {
            ((ImageView)linearLayout1.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }
        LinearLayout   linearLayout2=(LinearLayout)findViewById(R.id.lineThree);
        for (int i=0; i < linearLayout2.getChildCount(); i++)
        {
            ((ImageView)linearLayout2.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }
     }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
