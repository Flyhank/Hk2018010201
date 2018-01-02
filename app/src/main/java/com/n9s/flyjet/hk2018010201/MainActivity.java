package com.n9s.flyjet.hk2018010201;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn3=(Button) findViewById(R.id.button3);
        //MyListener listener = new MyListener();
        //btn3.setOnClickListener(listener);
        btn3.setOnClickListener(new View.OnClickListener() //用匿名類別取代
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Hi, Man!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void click1(View v)
    {
        switch (v.getId())
        {
            case R.id.button:
                Toast.makeText(MainActivity.this, "Hi, friend!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "Hi! there!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /*
        class MyListener implements View.OnClickListener
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Hi! man!", Toast.LENGTH_SHORT).show();

            }
        }
    */
}
