package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculateScore(boolean addKaranArjun,boolean addZero)
    {
        if(addKaranArjun && addZero)
            score += 1;
    }
    public void calculateScore(String name)
    {
        if(name.equals("tuffy"))
            score += 1;
    }

    public void submit(View view) {
        score=0;
        CheckBox raceCheckBox = (CheckBox) findViewById(R.id.race_checkbox);
        boolean hasRace = raceCheckBox.isChecked();

        CheckBox donCheckBox = (CheckBox) findViewById(R.id.don_checkbox);
        boolean hasDon = donCheckBox.isChecked();

        CheckBox karanArjunCheckBox = (CheckBox) findViewById(R.id.karan_arjun_checkbox);
        boolean hasKaranArjun = karanArjunCheckBox.isChecked();

        CheckBox zeroCheckBox = (CheckBox) findViewById(R.id.zero_checkbox);
        boolean hasZero= zeroCheckBox.isChecked();

        calculateScore(hasKaranArjun,hasZero);

        EditText text = (EditText) findViewById(R.id.name_editText);
        String name = text.getText().toString();

        calculateScore(name);

        RadioButton one = (RadioButton) findViewById(R.id.radio_1_1);
        boolean oneButton = one.isChecked();
        if(oneButton)
            score += 1;

        RadioButton two = (RadioButton) findViewById(R.id.radio_2_2);
        boolean twoButton = two.isChecked();
        if(twoButton)
            score += 1;

        RadioButton three = (RadioButton) findViewById(R.id.radio_3_1);
        boolean threeButton = three.isChecked();
        if(threeButton)
            score += 1;

        if(score == 5)
            Toast.makeText(this, "Well Done !! You score is " + score ,Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Congratulations !! You score is " + score ,Toast.LENGTH_SHORT).show();
    }

}
