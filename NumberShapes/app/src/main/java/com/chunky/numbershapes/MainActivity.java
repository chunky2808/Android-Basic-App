package com.chunky.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        int no;

        public boolean isTriangular()
        {
            int x = 1;

            int triangularnumber = 1;

            while(triangularnumber < no)
            {
                x++;
                triangularnumber = triangularnumber +x;
            }
            if(triangularnumber==no)
                return true;
            else
                return false;
        }
        public boolean isSquare()
        {
            double squareRoot = Math.sqrt(no);
            if(squareRoot == Math.floor(squareRoot))
            {
                return  true;
            }
            else
                return false;
        }
    }

    public void testNumber(View view)
    {
        EditText number = (EditText) findViewById(R.id.editText);

        int non = Integer.parseInt(number.getText().toString());

        Number p = new Number();
        p.no = non;

        if(p.isTriangular() && p.isSquare())
            Toast.makeText(MainActivity.this, non +" is Both Triangular and Square number", Toast.LENGTH_SHORT).show();
        else if(p.isSquare())
            Toast.makeText(MainActivity.this, non + " is Square Number", Toast.LENGTH_SHORT).show();
        else if(p.isTriangular())
            Toast.makeText(MainActivity.this, non + " is Triangular Number", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(MainActivity.this, non + "is Niether Triangular nor Square number", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
