package com.example.lopezlabexer1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_Quiz1;
    EditText et_Quiz2;
    EditText et_Seatworks;
    EditText et_LabExercises;
    EditText et_MajorExam;
    Button btn_Compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Quiz1 = (EditText) findViewById(R.id.etQuiz1);
        et_Quiz2 = (EditText) findViewById(R.id.etQuiz2);
        et_Seatworks = (EditText) findViewById(R.id.etSeatworks);
        et_LabExercises = (EditText) findViewById(R.id.etLabExercises);
        et_MajorExam = (EditText) findViewById(R.id.etMajorExam);
        btn_Compute = (Button) findViewById(R.id.btnCompute);

    }

    public void callComputationResults(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("quiz1", et_Quiz1.getText().toString());
        intent.putExtra("quiz2", et_Quiz2.getText().toString());
        intent.putExtra("sw", et_Seatworks.getText().toString());
        intent.putExtra("labexer", et_LabExercises.getText().toString());
        intent.putExtra("mj", et_MajorExam.getText().toString());
        startActivity(intent);
    }
}
