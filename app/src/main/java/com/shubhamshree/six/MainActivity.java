
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
            num9 ,num10 ,num11 ,num12 ,num13,
            num516,
            num517 ,num518 ,num519 ,num514 ,num515,
            num520 ,num521 ,num522 ,num523 ,num524 ,
            num525 ,num526 ,num527 ,num528 ,num529 ,
            num530 ,num531 ,num51 ,num52 ,num53 ,
            num54 ,num55 ,num56 ,num57 ,num58 ,
            num59 ,num510 ,num511 ,num512 ,num513,
            num622 ,num623 ,num624 ,
            num625 ,num626 ,num627 ,num628 ,currOver  ;
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

    public static final String pref516 = "516key";
    public static final String pref517 = "517key" ;
    public static final String pref518 = "518key" ;
    public static final String pref519 = "519key" ;
    public static final String pref520 = "520key" ;
    public static final String pref521 = "521key" ;
    public static final String pref522 = "522key" ;
    public static final String pref523 = "523key" ;
    public static final String pref524 = "524key" ;
    public static final String pref525 = "525key" ;
    public static final String pref526 = "526key" ;
    public static final String pref527 = "527key" ;
    public static final String pref528 = "528key" ;
    public static final String pref529 = "529key" ;
    public static final String pref530 = "530key";
    public static final String pref531 = "531key" ;
    public static final String pref51  = "51key" ;
    public static final String pref52  = "52key" ;
    public static final String pref53  = "53key" ;
    public static final String pref54  = "54key";
    public static final String pref55  = "55key";
    public static final String pref56  = "56key";
    public static final String pref57  = "57key";
    public static final String pref58  = "58key";
    public static final String pref59  = "59key";
    public static final String pref510 = "510key";
    public static final String pref511 = "511key";
    public static final String pref512 = "512key";
    public static final String pref513 = "513key";
    public static final String pref514 = "514key";
    public static final String pref515 = "515key";

    public static final String pref622 = "622key" ;
    public static final String pref623 = "623key" ;
    public static final String pref624 = "624key" ;
    public static final String pref625 = "625key" ;
    public static final String pref626 = "626key" ;
    public static final String pref627 = "627key" ;
    public static final String pref628 = "628key" ;

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

        num516=findViewById(R.id.num116);
        num517 = findViewById(R.id.num117) ;
        num518 = findViewById(R.id.num118) ;
        num519 = findViewById(R.id.num119) ;
        num520 = findViewById(R.id.num120) ;
        num521 = findViewById(R.id.num121) ;
        num522 = findViewById(R.id.num122) ;
        num523 = findViewById(R.id.num123) ;
        num524 = findViewById(R.id.num124) ;
        num525 = findViewById(R.id.num125) ;
        num526 = findViewById(R.id.num126) ;
        num527 = findViewById(R.id.num127) ;
        num528 = findViewById(R.id.num128) ;
        num529 = findViewById(R.id.num129) ;
        num530 = findViewById(R.id.num130);
        num531 = findViewById(R.id.num131) ;
        num51  = findViewById(R.id.num101) ;
        num52  = findViewById(R.id.num102) ;
        num53  = findViewById(R.id.num103) ;
        num54  = findViewById(R.id.num104);
        num55  = findViewById(R.id.num105);
        num56  = findViewById(R.id.num106);
        num57  = findViewById(R.id.num107);
        num58  = findViewById(R.id.num108);
        num59  = findViewById(R.id.num109);
        num510 = findViewById(R.id.num110);
        num511 = findViewById(R.id.num111);
        num512 = findViewById(R.id.num112);
        num513 = findViewById(R.id.num113);
        num514 = findViewById(R.id.num114);
        num515 = findViewById(R.id.num115);

        num622 = findViewById(R.id.num222) ;
        num623 = findViewById(R.id.num223) ;
        num624 = findViewById(R.id.num224) ;
        num625 = findViewById(R.id.num225) ;
        num626 = findViewById(R.id.num226) ;
        num627 = findViewById(R.id.num227) ;
        num628 = findViewById(R.id.num228) ;

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

        sharedPreferences=getSharedPreferences(pref516, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref517, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref518, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref519, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref520, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref521, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref522, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref523, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref524, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref525, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref526, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref527, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref528, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref529, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref530, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref531, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref51 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref52 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref53 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref54 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref55 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref56 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref57 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref58 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref59 , Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref510, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref511, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref512, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref513, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref514, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref515, Context.MODE_PRIVATE);

        sharedPreferences=getSharedPreferences(pref622, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref623, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref624, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref625, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref626, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref627, Context.MODE_PRIVATE);
        sharedPreferences=getSharedPreferences(pref628, Context.MODE_PRIVATE);

        if (sharedPreferences.contains(pref16)){ num16.setText(sharedPreferences.getString(pref16, ""));}
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

        if (sharedPreferences.contains(pref516)){ num516.setText(sharedPreferences.getString(pref516, ""));}
        if (sharedPreferences.contains(pref517)){ num517.setText(sharedPreferences.getString(pref517, ""));}
        if (sharedPreferences.contains(pref518)){ num518.setText(sharedPreferences.getString(pref518, ""));}
        if (sharedPreferences.contains(pref519)){ num519.setText(sharedPreferences.getString(pref519, ""));}
        if (sharedPreferences.contains(pref520)){ num520.setText(sharedPreferences.getString(pref520, ""));}
        if (sharedPreferences.contains(pref521)){ num521.setText(sharedPreferences.getString(pref521, ""));}
        if (sharedPreferences.contains(pref522)){ num522.setText(sharedPreferences.getString(pref522, ""));}
        if (sharedPreferences.contains(pref523)){ num523.setText(sharedPreferences.getString(pref523, ""));}
        if (sharedPreferences.contains(pref524)){ num524.setText(sharedPreferences.getString(pref524, ""));}
        if (sharedPreferences.contains(pref525)){ num525.setText(sharedPreferences.getString(pref525, ""));}
        if (sharedPreferences.contains(pref526)){ num526.setText(sharedPreferences.getString(pref526, ""));}
        if (sharedPreferences.contains(pref527)){ num527.setText(sharedPreferences.getString(pref527, ""));}
        if (sharedPreferences.contains(pref528)){ num528.setText(sharedPreferences.getString(pref528, ""));}
        if (sharedPreferences.contains(pref529)){ num529.setText(sharedPreferences.getString(pref529, ""));}
        if (sharedPreferences.contains(pref530)){ num530.setText(sharedPreferences.getString(pref530, ""));}
        if (sharedPreferences.contains(pref531)){ num531.setText(sharedPreferences.getString(pref531, ""));}
        if (sharedPreferences.contains(pref51)){ num51.setText(sharedPreferences.getString(pref51, ""));}
        if (sharedPreferences.contains(pref52)){ num52.setText(sharedPreferences.getString(pref52, ""));}
        if (sharedPreferences.contains(pref53)){ num53.setText(sharedPreferences.getString(pref53, ""));}
        if (sharedPreferences.contains(pref54)){ num54.setText(sharedPreferences.getString(pref54, ""));}
        if (sharedPreferences.contains(pref55)){ num55.setText(sharedPreferences.getString(pref55, ""));}
        if (sharedPreferences.contains(pref56)){ num56.setText(sharedPreferences.getString(pref56, ""));}
        if (sharedPreferences.contains(pref57)){ num57.setText(sharedPreferences.getString(pref57, ""));}
        if (sharedPreferences.contains(pref58)){ num58.setText(sharedPreferences.getString(pref58, ""));}
        if (sharedPreferences.contains(pref59)){ num59.setText(sharedPreferences.getString(pref59, ""));}
        if (sharedPreferences.contains(pref510)){ num510.setText(sharedPreferences.getString(pref510, ""));}
        if (sharedPreferences.contains(pref511)){ num511.setText(sharedPreferences.getString(pref511, ""));}
        if (sharedPreferences.contains(pref512)){ num512.setText(sharedPreferences.getString(pref512, ""));}
        if (sharedPreferences.contains(pref513)){ num513.setText(sharedPreferences.getString(pref513, ""));}
        if (sharedPreferences.contains(pref514)){ num514.setText(sharedPreferences.getString(pref514, ""));}
        if (sharedPreferences.contains(pref515)){ num515.setText(sharedPreferences.getString(pref515, ""));}

        if (sharedPreferences.contains(pref622)){ num622.setText(sharedPreferences.getString(pref622, ""));}
        if (sharedPreferences.contains(pref623)){ num623.setText(sharedPreferences.getString(pref623, ""));}
        if (sharedPreferences.contains(pref624)){ num624.setText(sharedPreferences.getString(pref624, ""));}
        if (sharedPreferences.contains(pref625)){ num625.setText(sharedPreferences.getString(pref625, ""));}
        if (sharedPreferences.contains(pref626)){ num626.setText(sharedPreferences.getString(pref626, ""));}
        if (sharedPreferences.contains(pref627)){ num627.setText(sharedPreferences.getString(pref627, ""));}
        if (sharedPreferences.contains(pref628)){ num628.setText(sharedPreferences.getString(pref628, ""));}

        LocalDate start_date = LocalDate.now(); ;
        LocalDate end_date = LocalDate.of(2021, 3, 1);
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

        String n516 = num516.getText().toString();
        String n517 = num517.getText().toString() ;
        String n518 = num518.getText().toString() ;
        String n519 = num519.getText().toString() ;
        String n520 = num520.getText().toString() ;
        String n521 = num521.getText().toString() ;
        String n522 = num522.getText().toString() ;
        String n523 = num523.getText().toString() ;
        String n524 = num524.getText().toString() ;
        String n525 = num525.getText().toString() ;
        String n526 = num526.getText().toString() ;
        String n527 = num527.getText().toString() ;
        String n528 = num528.getText().toString() ;
        String n529 = num529.getText().toString() ;
        String n530 = num530.getText().toString();
        String n531 = num531.getText().toString() ;
        String n51  = num51.getText().toString() ;
        String n52  = num52.getText().toString() ;
        String n53  = num53.getText().toString() ;
        String n54  = num54.getText().toString();
        String n55  = num55.getText().toString();
        String n56  = num56.getText().toString();
        String n57  = num57.getText().toString();
        String n58  = num58.getText().toString();
        String n59  = num59.getText().toString();
        String n510 = num510.getText().toString();
        String n511 = num511.getText().toString();
        String n512 = num512.getText().toString();
        String n513 = num513.getText().toString();
        String n514 = num514.getText().toString();
        String n515 = num515.getText().toString();

        String n622 = num622.getText().toString() ;
        String n623 = num623.getText().toString() ;
        String n624 = num624.getText().toString() ;
        String n625 = num625.getText().toString() ;
        String n626 = num626.getText().toString() ;
        String n627 = num627.getText().toString() ;
        String n628 = num628.getText().toString() ;
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

        editor.putString(pref516 , n516);
        editor.putString(pref517 , n517) ;
        editor.putString(pref518 , n518) ;
        editor.putString(pref519 , n519) ;
        editor.putString(pref520 , n520) ;
        editor.putString(pref521 , n521) ;
        editor.putString(pref522 , n522) ;
        editor.putString(pref523 , n523) ;
        editor.putString(pref524 , n524) ;
        editor.putString(pref525 , n525) ;
        editor.putString(pref526 , n526) ;
        editor.putString(pref527 , n527) ;
        editor.putString(pref528 , n528) ;
        editor.putString(pref529 , n529) ;
        editor.putString(pref530 , n530);
        editor.putString(pref531 , n531) ;
        editor.putString(pref51  , n51) ;
        editor.putString(pref52  , n52) ;
        editor.putString(pref53  , n53) ;
        editor.putString(pref54  , n54);
        editor.putString(pref55  , n55);
        editor.putString(pref56  , n56);
        editor.putString(pref57  , n57);
        editor.putString(pref58  , n58);
        editor.putString(pref59  , n59);
        editor.putString(pref510 , n510);
        editor.putString(pref511 , n511);
        editor.putString(pref512 , n512);
        editor.putString(pref513 , n513);
        editor.putString(pref514 , n514);
        editor.putString(pref515 , n515);

        editor.putString(pref622 , n622) ;
        editor.putString(pref623 , n623) ;
        editor.putString(pref624 , n624) ;
        editor.putString(pref625 , n625) ;
        editor.putString(pref626 , n626) ;
        editor.putString(pref627 , n627) ;
        editor.putString(pref628 , n628) ;
        editor.commit();
    }
}