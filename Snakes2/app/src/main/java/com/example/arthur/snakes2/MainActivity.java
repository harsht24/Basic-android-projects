package com.example.arthur.snakes2;
import java.util.Random;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int[] dices={R.drawable.one,
            R.drawable.two,R.drawable.three,
            R.drawable.four,R.drawable.five,
            R.drawable.six};

    public void rollTapped(View view){
        Log.i("BUTTON","button tapped");


        Random ran = new Random();

       int randomNumber=ran.nextInt(6);
        Log.i("Random","Random Number is "+randomNumber);
        ImageView dice=(ImageView)findViewById(R.id.dice);
        dice.setImageResource(dices[randomNumber]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
