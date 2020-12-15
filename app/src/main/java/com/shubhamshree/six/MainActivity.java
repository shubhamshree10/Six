
package com.shubhamshree.six;

import androidx.appcompat.app.AppCompatActivity;
import java.time.*;
import java.time.temporal.ChronoUnit;

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
    long noOfDaysBetween;
    private TextView run_scored;
    private TextView runs ;
    private TextView req_run_rate ;
    public static final String PREFS_NAME = "SixDataFile";

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