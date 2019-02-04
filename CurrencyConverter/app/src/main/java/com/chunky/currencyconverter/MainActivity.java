package com.chunky.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText rs = (EditText) findViewById(R.id.NumberBox);
        Double rsamount =  Double.parseDouble(rs.getText().toString());
        Double dollar = rsamount/71;
        Toast.makeText(MainActivity.this,"$" + dollar.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
