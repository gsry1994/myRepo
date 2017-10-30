package com.example.awesomefat.csc537_fall2017_hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private ViewGroup svLayout;
    private EditText inputET;
    private TextView[] theTextViews = new TextView[1000];
    private int numTextViews = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.svLayout = (ViewGroup)this.findViewById(R.id.svLayout);
        this.inputET = (EditText)this.findViewById(R.id.inputET);
    }

    public void onRemoveElementButtonPressed(View v)
    {
        if(this.svLayout.getChildCount() > 0)
        {
            this.svLayout.removeViewAt(0);
        }
        else
        {
            Toast.makeText(this, "Nothing To Remove", Toast.LENGTH_SHORT).show();
        }
    }

    public void onSortButtonPressed(View v)
    {
        Toast.makeText(this, "Sort the stuff and refill scrollview", Toast.LENGTH_SHORT).show();
    }

    public void onAddElementButtonPressed(View v)
    {
        if(this.inputET.getText().length() > 0)
        {
            TextView tv = new TextView(this);
            tv.setText(this.inputET.getText().toString());
            this.svLayout.addView(tv);
            //this.sum = this.sum + Integer.parseInt(this.inputET.getText().toString());
            this.theTextViews[this.numTextViews] = tv;
            this.numTextViews++;
            this.inputET.setText("");
        }
        else
        {
            //System.out.println("***** Need to enter a number!!!!!");
            Toast.makeText(this, "Need to enter a number!!!!!", Toast.LENGTH_SHORT).show();
        }

    }
}
