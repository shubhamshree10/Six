
package com.shubhamshree.six;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String difference;
    Period diff;
    private Button button_plus , button_minus ;
    int count = 0;
//    String num16 = "",num17 = "",num18 = "",num19 = "",
//            num20 = "",num21 = "",num22 = "",num23 = "",num24 = "",
//            num25 = "",num26 = "",num27 = "",num28 = "",num29 = "",
//            num30 = "",num31 = "",num1 = "",num2 = "",num3 = "",
//            num4 = "",num5 = "",num6 = "",num7 = "",num8 = "",
//            num9 = "",num10 = "",num11 = "",num12 = "",num13 = "",
//            num14 = "",num15 = "" ;
    long noOfDaysBetween;
    private TextView run_scored,runs,req_run_rate,num16;
    SharedPreferences sharedPreferences ;

    public static final String PREFS_NAME = "SixDataFile";
    public static final String pref16 = "16key";

    void findDifference(LocalDate start_date,LocalDate end_date)
    {
         diff= Period.between(start_date, end_date);
        noOfDaysBetween = ChronoUnit.DAYS.between(start_date, end_date);
        String overs;
        if(noOfDaysBetween>1) {
             overs = " Overs";}
        else{
             overs = " Over";}
        difference =  Long.toString(noOfDaysBetween) + overs ;
        TextView textViewDate = findViewById(R.id.days_remaining);
        textViewDate.setText(difference);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME,0) ;


        button_plus = findViewById(R.id.button_plus);
        button_minus = findViewById(R.id.button_minus);
        run_scored = findViewById(R.id.run_scored);
        runs = findViewById(R.id.runs) ;
        req_run_rate = findViewById(R.id.req_run_rate) ;

        num16=findViewById(R.id.num16);
        sharedPreferences=getSharedPreferences(pref16, Context.MODE_PRIVATE);
        if (sharedPreferences.contains(pref16)){
            num16.setText(sharedPreferences.getString(pref16,""));
        }
        //String val16= num16.getText().toString();

        LocalDate start_date = LocalDate.now(); ;
        LocalDate end_date = LocalDate.of(2021, 1, 15);
        findDifference(start_date,end_date);

        count = settings.getInt("count",count) ;


        int rek = 200 - count;
        float rrk = (float)rek/(float)noOfDaysBetween;
        double roundOfk = (double) Math.round(rrk * 100) / 100;
        run_scored.setText(Integer.toString(count));
        runs.setText(Integer.toString(rek));
        req_run_rate.setText(Double.toString(roundOfk) + "/Over");

        button_plus.setOnClickListener(view -> {
            count++;
            int req = 200 - count;
            float rrr = (float)req/(float)noOfDaysBetween;
            double roundOff = (double) Math.round(rrr * 100) / 100;
            run_scored.setText(Integer.toString(count));
            runs.setText(Integer.toString(req));
            req_run_rate.setText(Double.toString(roundOff) + "/Over");

            SharedPreferences.Editor editor = settings.edit() ;
            editor.putInt("count",count);
            editor.commit();
        });
        button_minus.setOnClickListener(view -> {
            count--;
            int req = 200 - count;
            float rrr = (float)req/(float)noOfDaysBetween;
            double roundOff = (double) Math.round(rrr * 100) / 100;
            run_scored.setText(Integer.toString(count));
            runs.setText(Integer.toString(req));
            req_run_rate.setText(Double.toString(roundOff)+ "/Over");

            SharedPreferences.Editor editor = settings.edit() ;
            editor.putInt("count",count);
            editor.commit();
        });

    }
}