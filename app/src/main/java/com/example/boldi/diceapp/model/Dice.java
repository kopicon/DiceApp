package com.example.boldi.diceapp.model;

import android.graphics.drawable.Drawable;

import com.example.boldi.diceapp.R;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by MSI GS40 6QE on 27.02.2018.
 */

public class Dice {
    int rollValue = 0;
    int relevantDrawableImage;

    public Dice()
    {
        Random rand = new Random();
        this.rollValue = rand.nextInt(6)+1;

        switch(rollValue) {
            case 1: relevantDrawableImage = R.drawable.dice1;
            break;
            case 2: relevantDrawableImage = R.drawable.dice2;
                break;
            case 3: relevantDrawableImage = R.drawable.dice3;
                break;
            case 4: relevantDrawableImage = R.drawable.dice4;
                break;
            case 5: relevantDrawableImage = R.drawable.dice5;
                break;
            case 6: relevantDrawableImage = R.drawable.dice6;
                break;
            default: relevantDrawableImage = R.drawable.maindice;
                break;
        }
    }

    public int getRelevantDrawableImage(){
        return this.relevantDrawableImage;
    }
}
