package e.arthur.newyeartimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView mnumber = (TextView) findViewById(R.id.mnumber);
        final ImageView result = (ImageView) findViewById(R.id.done);
       result.setVisibility(result.INVISIBLE);
        new CountDownTimer(10000,1000)
        {
            public void onTick(long millisecondsUntilDone){

                mnumber.setText("Time: "+String.valueOf(millisecondsUntilDone/1000));
            }
            public void onFinish()
            {
                result.setVisibility(result.VISIBLE);
            }
        }.start();
    }
}
