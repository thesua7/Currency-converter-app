package com.Thesua7.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    boolean flagOne = true;

    public void fade(View view){

        Log.i("Info","Image view is tapped");

        ImageView pictureOne = (ImageView) findViewById(R.id.iveiw);
        ImageView pictureTwo = (ImageView) findViewById(R.id.iveiw1);



        if(flagOne){
            flagOne = false;
            pictureOne.animate().alpha(0).setDuration(2000); //Millisecond
            pictureTwo.animate().alpha(1).setDuration(2000);
        }

        else {
            flagOne = true;
            pictureTwo.animate().alpha(0).setDuration(2000);
            pictureOne.animate().alpha(1).setDuration(2000);
        }




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}