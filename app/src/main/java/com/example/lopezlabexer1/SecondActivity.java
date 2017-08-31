package com.example.lopezlabexer1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv_RA;
        TextView tv_FG;
        Button btn_Back;

        tv_RA = (TextView) findViewById(R.id.tvRA);
        tv_FG = (TextView) findViewById(R.id.tvFG);
        btn_Back = (Button) findViewById(R.id.btnBack);

        double q1 = Double.parseDouble(getIntent().getStringExtra("quiz1"));
        double q2 = Double.parseDouble(getIntent().getStringExtra("quiz2"));
        double sw = Double.parseDouble(getIntent().getStringExtra("sw"));
        double le = Double.parseDouble(getIntent().getStringExtra("labexer"));
        double mj = Double.parseDouble(getIntent().getStringExtra("mj"));

        double RA = (q1 * .1) + (q2 *.1) + (sw * .1) + (le * .4) + (mj * .3);

        String finalG;

        if (RA < 60){
            finalG = "Failed";
        } else if ((RA >= 60) && (RA <= 65)) {
            finalG = "3.0";
        } else if ((RA >= 66) && (RA <= 70)) {
            finalG = "2.75";
        } else if ((RA >= 71) && (RA <= 75)) {
            finalG = "2.50";
        } else if ((RA >= 76) && (RA <= 80)) {
            finalG = "2.25";
        } else if ((RA >= 81) && (RA <= 85)) {
            finalG = "2.00";
        } else if ((RA >= 86) && (RA <= 90)) {
            finalG = "1.75";
        } else if ((RA >= 91) && (RA <= 92)) {
            finalG = "1.50";
        } else if ((RA >= 93) && (RA <= 94)) {
            finalG = "1.25";
        } else if ((RA >= 95) && (RA <= 100)) {
            finalG = "1.00";
        } else {
            finalG = "INVALID";
        }

        tv_RA.setText("Your RA is " + RA);
        tv_FG.setText("Your Final Grade is " + finalG);
    }

    public void goBackToMain (View view) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
