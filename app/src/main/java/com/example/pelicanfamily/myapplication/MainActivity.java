package com.example.pelicanfamily.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public String Feeling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Question1 = (TextView) findViewById(R.id.Q1);
        Button ButtonA = (Button)findViewById(R.id.aButton);
        Button ButtonB = (Button) findViewById(R.id.ButtonB);
        ButtonA.setOnClickListener(new GoodClass());
        ButtonB.setOnClickListener(new BadClass());
    }
public String SetFeeling (String A){
        Feeling = A;
        return Feeling;
}
public void OnSetContentView (Button a, Button b, TextView c){

}

    public class GoodClass implements View.OnClickListener {
        public void onClick (View v) {
            SetFeeling("Good");
            setContentView(R.layout.welcome);

        }
    }
    public class BadClass implements View.OnClickListener {
        public void onClick (View v) {
            SetFeeling("Bad");
            setContentView(R.layout.welcome);

        }
    }

}
