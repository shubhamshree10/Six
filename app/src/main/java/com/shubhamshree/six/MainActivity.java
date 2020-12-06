package com.shubhamshree.six;

import androidx.appcompat.app.AppCompatActivity;
import java.time.*;
import java.util.*;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    void findDifference(LocalDate start_date,LocalDate end_date)
    {
        Period diff= Period.between(start_date, end_date);
        //Integer.toString(diff.getYears())+ Integer.toString(diff.getMonths())+
        String overs;
        if(diff.getDays()>1) {
             overs = " Overs";
        }
        else{
             overs = " Over";
        }
              String difference =  Integer.toString(diff.getDays()) + overs ;
        TextView textViewDate = findViewById(R.id.days_remaining);
        textViewDate.setText(difference);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocalDate start_date = LocalDate.now(); ;
        LocalDate end_date = LocalDate.of(2020, 12, 31);

        findDifference(start_date,end_date);

    }
}