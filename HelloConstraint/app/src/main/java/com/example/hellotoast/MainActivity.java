package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    Button button2,button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        //setContentView(R.layout.linearlayout);
      //  setContentView(R.layout.relativelayout);
        mShowCount =  findViewById(R.id.show_count);

        button2 =  findViewById(R.id.button_count);
         button1 = findViewById(R.id.button2);
    }


    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if(mCount%2==0){
            button2.setBackgroundColor(Color.DKGRAY);
        }
        else {
            button2.setBackgroundColor(Color.GREEN);
        }
    }

    public void show_zero(View view) {
        mCount = 0;
        String StringmShowCount;
        int intmShowCount;
        StringmShowCount = mShowCount.getText().toString();
        intmShowCount = Integer.parseInt(StringmShowCount);
        if(mShowCount != null) {
            if(intmShowCount == 0){
                button1.setBackgroundColor(Color.DKGRAY);
            }
            else{
                button1.setBackgroundColor(Color.BLUE);
            }

            button1.setBackgroundColor(Color.DKGRAY);

            mShowCount.setText(Integer.toString(mCount));
        }
    }
}