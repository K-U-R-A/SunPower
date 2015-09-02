package hks.sunpower;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Андрей on 31.08.2015.
 */
public class MainScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTextOnTxtField();
    }


    public void setTextOnTxtField(){
        TextView bttery = (TextView) findViewById(R.id.battery_state);
        bttery.setText("lal");
    }


   /* private int batteryStatsCheck(){
        Random random = new Random();
        int persent1 = random.nextInt(100);
        return persent1;
    }*/
}
