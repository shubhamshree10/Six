
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
    private Button button_plus , button_minus , onePlus, reset ;
    int count = 0,dailyCount = 0;

    long noOfDaysBetween;
    private TextView run_scored,runs,req_run_rate,num16,
            num17 ,num18 ,num19 ,num14 ,num15,
            num20 ,num21 ,num22 ,num23 ,num24 ,
            num25 ,num26 ,num27 ,num28 ,num29 ,
            num30 ,num31 ,num1 ,num2 ,num3 ,
            num4 ,num5 ,num6 ,num7 ,num8 ,
            num9 ,num10 ,num11 ,num12 ,num13, currOver  ;
    SharedPreferences sharedPreferences ;

    public static final String PREFS_NAME = "SixDataFile";
    public static final String PREFS_NAME2 = "SixDataFile2";
    public static final String pref16 = "16key";
    public static final String pref17 = "17key" ;
    public static final String pref18 = "18key" ;
    public static final String pref19 = "19key" ;
    public static final String pref20 = "20key" ;
    public static final String pref21 = "21key" ;
    public static final String pref22 = "22key" ;
    public static final String pref23 = "23key" ;
    public static final String pref24 = "24key" ;
    public static final String pref25 = "25key" ;
    public static final String pref26 = "26key" ;
    public static final String pref27 = "27key" ;
    public static final String pref28 = "28key" ;
    public static final String pref29 = "29key" ;
    public static final String pref30 = "30key";
    public static final String pref31 = "31key" ;
    public static final String pref1  = "1key" ;
    public static final String pref2  = "2key" ;
    public static final String pref3  = "3key" ;
    public static final String pref4  = "4key";
    public static final String pref5  = "5key";
    public static final String pref6  = "6key";
    public static final String pref7  = "7key";
    public static final String pref8  = "8key";
    public static final String pref9  = "9key";
    public static final String pref10 = "10key";
    public static final String pref11 = "11key";
    public static final String pref12 = "12key";
    public static final String pref13 = "13key";
    public static final String pref14 = "14key";
    public static final String pref15 = "15key";

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
        SharedPreferences settings2 = getSharedPreferences(PREFS_NAME2,0) ;
        button_plus = findViewById(R.id.button_plus);
        button_minus = findViewById(R.id.button_minus);
        run_scored = findViewById(R.id.run_scored);
        runs = findViewById(R.id.runs) ;
        req_run_rate = findViewById(R.id.req_run_rate) ;
        currOver = findViewById(R.id.currOver) ;
        onePlus = findViewById(R.id.onePlus);
        reset = findViewById(R.id.reset);

          num16=findViewById(R.id.num16);
          num17 = findViewById(R.id.num17) ;
          num18 = findViewById(R.id.num18) ;
          num19 = findViewById(R.id.num19) ;
          num20 = findViewById(R.id.num20) ;
          num21 = findViewById(R.id.num21) ;
          num22 = findViewById(R.id.num22) ;
          num23 = findViewById(R.id.num23) ;
          num24 = findViewById(R.id.num24) ;
          num25 = findViewById(R.id.num25) ;
          num26 = findViewById(R.id.num26) ;
          num27 = findViewById(R.id.num27) ;
          num28 = findViewById(R.id.num28) ;
          num29 = findViewById(R.id.num29) ;
          num30 = findViewById(R.id.num30);
          num31 = findViewById(R.id.num31) ;
          num1  = findViewById(R.id.num1) ;
          num2  = findViewById(R.id.num2) ;
          num3  = findViewById(R.id.num3) ;
          num4  = findViewById(R.id.num4);
          num5  = findViewById(R.id.num5);
          num6  = findViewById(R.id.num6);
          num7  = findViewById(R.id.num7);
          num8  = findViewById(R.id.num8);
          num9  = findViewById(R.id.num9);
          num10 = findViewById(R.id.num10);
          num11 = findViewById(R.id.num11);
          num12 = findViewById(R.id.num12);
          num13 = findViewById(R.id.num13);
          num14 = findViewById(R.id.num14);
          num15 = findViewById(R.id.num15);

        sharedPreferences=getSharedPreferences(pref16, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref17, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref18, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref19, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref20, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref21, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref22, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref23, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref24, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref25, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref26, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref27, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref28, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref29, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref30, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref31, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref1 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref2 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref3 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref4 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref5 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref6 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref7 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref8 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref9 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref10, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref11, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref12, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref13, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref14, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref15, Context.MODE_PRIVATE);

        if (sharedPreferences.contains(pref16)){
            num16.setText(sharedPreferences.getString(pref16,""));
        }
        if (sharedPreferences.contains(pref17)){ num17.setText(sharedPreferences.getString(pref17, ""));}
        if (sharedPreferences.contains(pref18)){ num18.setText(sharedPreferences.getString(pref18, ""));}
        if (sharedPreferences.contains(pref19)){ num19.setText(sharedPreferences.getString(pref19, ""));}
        if (sharedPreferences.contains(pref20)){ num20.setText(sharedPreferences.getString(pref20, ""));}
        if (sharedPreferences.contains(pref21)){ num21.setText(sharedPreferences.getString(pref21, ""));}
        if (sharedPreferences.contains(pref22)){ num22.setText(sharedPreferences.getString(pref22, ""));}
        if (sharedPreferences.contains(pref23)){ num23.setText(sharedPreferences.getString(pref23, ""));}
        if (sharedPreferences.contains(pref24)){ num24.setText(sharedPreferences.getString(pref24, ""));}
        if (sharedPreferences.contains(pref25)){ num25.setText(sharedPreferences.getString(pref25, ""));}
        if (sharedPreferences.contains(pref26)){ num26.setText(sharedPreferences.getString(pref26, ""));}
        if (sharedPreferences.contains(pref27)){ num27.setText(sharedPreferences.getString(pref27, ""));}
        if (sharedPreferences.contains(pref28)){ num28.setText(sharedPreferences.getString(pref28, ""));}
        if (sharedPreferences.contains(pref29)){ num29.setText(sharedPreferences.getString(pref29, ""));}
        if (sharedPreferences.contains(pref30)){ num30.setText(sharedPreferences.getString(pref30, ""));}
        if (sharedPreferences.contains(pref31)){ num31.setText(sharedPreferences.getString(pref31, ""));}
        if (sharedPreferences.contains(pref1)){ num1.setText(sharedPreferences.getString(pref1, ""));}
        if (sharedPreferences.contains(pref2)){ num2.setText(sharedPreferences.getString(pref2, ""));}
        if (sharedPreferences.contains(pref3)){ num3.setText(sharedPreferences.getString(pref3, ""));}
        if (sharedPreferences.contains(pref4)){ num4.setText(sharedPreferences.getString(pref4, ""));}
        if (sharedPreferences.contains(pref5)){ num5.setText(sharedPreferences.getString(pref5, ""));}
        if (sharedPreferences.contains(pref6)){ num6.setText(sharedPreferences.getString(pref6, ""));}
        if (sharedPreferences.contains(pref7)){ num7.setText(sharedPreferences.getString(pref7, ""));}
        if (sharedPreferences.contains(pref8)){ num8.setText(sharedPreferences.getString(pref8, ""));}
        if (sharedPreferences.contains(pref9)){ num9.setText(sharedPreferences.getString(pref9, ""));}
        if (sharedPreferences.contains(pref10)){ num10.setText(sharedPreferences.getString(pref10, ""));}
        if (sharedPreferences.contains(pref11)){ num11.setText(sharedPreferences.getString(pref11, ""));}
        if (sharedPreferences.contains(pref12)){ num12.setText(sharedPreferences.getString(pref12, ""));}
        if (sharedPreferences.contains(pref13)){ num13.setText(sharedPreferences.getString(pref13, ""));}
        if (sharedPreferences.contains(pref14)){ num14.setText(sharedPreferences.getString(pref14, ""));}
        if (sharedPreferences.contains(pref15)){ num15.setText(sharedPreferences.getString(pref15, ""));}

        LocalDate start_date = LocalDate.now(); ;
        LocalDate end_date = LocalDate.of(2021, 1, 22);
        findDifference(start_date,end_date);
        count = settings.getInt("count",count) ;
        dailyCount = settings2.getInt("dailyCount",dailyCount) ;

        int rek = 200 - count;
        float rrk = (float)rek/(float)noOfDaysBetween;
        double roundOfk = (double) Math.round(rrk * 100) / 100;
        run_scored.setText(Integer.toString(count)+"/200");
        runs.setText(Integer.toString(rek));
        req_run_rate.setText(Double.toString(roundOfk) + "/Over");
        currOver.setText(Integer.toString(dailyCount));

        button_plus.setOnClickListener(view -> {
            count++;
            int req = 200 - count;
            float rrr = (float)req/(float)noOfDaysBetween;
            double roundOff = (double) Math.round(rrr * 100) / 100;
            run_scored.setText(Integer.toString(count)+"/200");
            runs.setText(Integer.toString(req));
            req_run_rate.setText(Double.toString(roundOff) + "/Over");

            SharedPreferences.Editor editor = settings.edit() ;
            editor.putInt("count",count);
            editor.commit();
        });
        onePlus.setOnClickListener(view -> {
            dailyCount++;
            currOver.setText(Integer.toString(dailyCount));

            SharedPreferences.Editor editor = settings2.edit() ;
            editor.putInt("dailyCount",dailyCount);
            editor.commit();
        });
        reset.setOnClickListener(view -> {
            dailyCount = 0;
            currOver.setText(Integer.toString(dailyCount));

            SharedPreferences.Editor editor = settings2.edit() ;
            editor.putInt("dailyCount",dailyCount);
            editor.commit();
        });
        button_minus.setOnClickListener(view -> {
            count--;
            int req = 200 - count;
            float rrr = (float)req/(float)noOfDaysBetween;
            double roundOff = (double) Math.round(rrr * 100) / 100;
            run_scored.setText(Integer.toString(count)+"/200");
            runs.setText(Integer.toString(req));
            req_run_rate.setText(Double.toString(roundOff)+ "/Over");

            SharedPreferences.Editor editor = settings.edit() ;
            editor.putInt("count",count);
            editor.commit();
        });

    }
    public void Save(View view) {
        String n16 = num16.getText().toString();
        String n17 = num17.getText().toString() ;
        String n18 = num18.getText().toString() ;
        String n19 = num19.getText().toString() ;
        String n20 = num20.getText().toString() ;
        String n21 = num21.getText().toString() ;
        String n22 = num22.getText().toString() ;
        String n23 = num23.getText().toString() ;
        String n24 = num24.getText().toString() ;
        String n25 = num25.getText().toString() ;
        String n26 = num26.getText().toString() ;
        String n27 = num27.getText().toString() ;
        String n28 = num28.getText().toString() ;
        String n29 = num29.getText().toString() ;
        String n30 = num30.getText().toString();
        String n31 = num31.getText().toString() ;
        String n1  = num1.getText().toString() ;
        String n2  = num2.getText().toString() ;
        String n3  = num3.getText().toString() ;
        String n4  = num4.getText().toString();
        String n5  = num5.getText().toString();
        String n6  = num6.getText().toString();
        String n7  = num7.getText().toString();
        String n8  = num8.getText().toString();
        String n9  = num9.getText().toString();
        String n10 = num10.getText().toString();
        String n11 = num11.getText().toString();
        String n12 = num12.getText().toString();
        String n13 = num13.getText().toString();
        String n14 = num14.getText().toString();
        String n15 = num15.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(pref16, n16);
        editor.putString(pref17 , n17) ;
        editor.putString(pref18 , n18) ;
        editor.putString(pref19 , n19) ;
        editor.putString(pref20 , n20) ;
        editor.putString(pref21 , n21) ;
        editor.putString(pref22 , n22) ;
        editor.putString(pref23 , n23) ;
        editor.putString(pref24 , n24) ;
        editor.putString(pref25 , n25) ;
        editor.putString(pref26 , n26) ;
        editor.putString(pref27 , n27) ;
        editor.putString(pref28 , n28) ;
        editor.putString(pref29 , n29) ;
        editor.putString(pref30 , n30);
        editor.putString(pref31 , n31) ;
        editor.putString(pref1  , n1) ;
        editor.putString(pref2  , n2) ;
        editor.putString(pref3  , n3) ;
        editor.putString(pref4  , n4);
        editor.putString(pref5  , n5);
        editor.putString(pref6  , n6);
        editor.putString(pref7  , n7);
        editor.putString(pref8  , n8);
        editor.putString(pref9  , n9);
        editor.putString(pref10 , n10);
        editor.putString(pref11 , n11);
        editor.putString(pref12 , n12);
        editor.putString(pref13 , n13);
        editor.putString(pref14 , n14);
        editor.putString(pref15 , n15);
        editor.commit();
    }
}