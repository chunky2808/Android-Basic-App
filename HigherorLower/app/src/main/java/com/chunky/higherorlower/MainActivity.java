package com.chunky.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void onClicks(View view)
    {
         EditText no = (EditText) findViewById(R.id.editText);
         String ch = no.getText().toString();
         int number = Integer.parseInt(ch);
         if(number==randomNumber)
         {
             Toast.makeText(MainActivity.this,"Correct! Try Again!" , Toast.LENGTH_SHORT).show();
             Random rand = new Random();
             randomNumber = rand.nextInt(20)+1;
         }
         else if(number>randomNumber)
         {
             Toast.makeText(MainActivity.this,"Greater" , Toast.LENGTH_SHORT).show();
         }
         else
         {
             Toast.makeText(MainActivity.this,"Less" , Toast.LENGTH_SHORT).show();
         }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
}
