package com.example.boldi.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.content.Intent;


public class SelectActivity extends AppCompatActivity {

    ImageButton btn_history;
    Button btn_roll;
    NumberPicker numbPick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        btn_history = (ImageButton)findViewById(R.id.btn_history);
        btn_roll = (Button)findViewById(R.id.btn_roll);
        numbPick = (NumberPicker)findViewById(R.id.numbPick);
        setNumbPick();

       /* btn_history.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                SelectActivity.this.onClickNext();
            }

        });*/
    }
    public void setNumbPick()
    {
        numbPick.setMaxValue(6);
        if(numbPick.getValue()==1)
        {

        }else if(numbPick.getValue()==2)
        {

        }else if(numbPick.getValue()==3)
        {

        }else if(numbPick.getValue()==4)
        {

        }else if(numbPick.getValue()==5)
        {

        }else if(numbPick.getValue()==6)
        {

        }
    }
    /*public void onClickNext()
    {
        Intent intent = new Intent();
        intent.setClass(this,HistoryActivity.class);
        startActivity(intent);

    }*/
}
