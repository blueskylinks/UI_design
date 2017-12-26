package com.blueskylinks.sms.ui_design;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int count=0;
    int countb=0;
    int countc=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.textView4);
        textView.setText("OFF");
        final TextView textView1 = findViewById(R.id.textViewb4);
        textView1.setText("OFF");
        final TextView textView2= findViewById(R.id.textViewc4);
        textView2.setText("OFF");
    }

    public void click_one(View v) {

        final Button id1 = findViewById(R.id.id1);
        final Button id2 = findViewById(R.id.id2);
        final Button id3 = findViewById(R.id.id3);
        final Button id4 = findViewById(R.id.id4);
        final Button id5 = findViewById(R.id.id5);
        final Button id6 = findViewById(R.id.id6);
        final TextView textView = findViewById(R.id.textView4);

        if (count < 6) {
            count = count + 1;
            switch (count) {
                case 1:
                    id1.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView.setText(String.valueOf(count));
                    break;
                case 2:
                    id2.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView.setText(String.valueOf(count));
                    break;
                case 3:
                    id3.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView.setText(String.valueOf(count));
                    break;
                case 4:
                    id4.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView.setText(String.valueOf(count));
                    break;
                case 5:
                    id5.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView.setText(String.valueOf(count));
                    break;

                case 6:
                    id6.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView.setText(String.valueOf(count));
                    break;
                case 0:
                    textView.setText("OFF");

            }
        } else {
            return;
        }


    }

    public void click_two(View v1) {

        final Button id1 =  findViewById(R.id.id1);
        final Button id2 =  findViewById(R.id.id2);
        final Button id3 =  findViewById(R.id.id3);
        final Button id4 =  findViewById(R.id.id4);
        final Button id5 =  findViewById(R.id.id5);
        final Button id6 = findViewById(R.id.id6);
        final TextView textView = findViewById(R.id.textView4);

        if (count > 0) {
            count = count - 1;
            switch (count) {
                case 0:
                    id1.getBackground().clearColorFilter();
                    textView.setText("OFF");
                    break;
                case 1:
                    id2.getBackground().clearColorFilter();
                    textView.setText(String.valueOf(count));
                    break;
                case 2:
                    id3.getBackground().clearColorFilter();
                    textView.setText(String.valueOf(count));
                    break;
                case 3:
                    id4.getBackground().clearColorFilter();
                    textView.setText(String.valueOf(count));
                    break;
                case 4:
                    id5.getBackground().clearColorFilter();
                    textView.setText(String.valueOf(count));
                    break;

                case 5:
                    id6.getBackground().clearColorFilter();
                    textView.setText(String.valueOf(count));
                    break;

            }

        } else {
            return;
        }


    }
    public void click_oneb(View v2) {

        final Button i1 = findViewById(R.id.i1);
        final Button i2 = findViewById(R.id.i2);
        final Button i3 = findViewById(R.id.i3);
        final Button i4 = findViewById(R.id.i4);
        final Button i5 = findViewById(R.id.i5);
        final Button i6 = findViewById(R.id.i6);
        final TextView textView1 = findViewById(R.id.textViewb4);

        if (countb < 6) {
            countb = countb+ 1;
            switch (countb) {
                case 1:
                    i1.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView1.setText(String.valueOf(countb));
                    break;
                case 2:
                    i2.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView1.setText(String.valueOf(countb));
                    break;
                case 3:
                    i3.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView1.setText(String.valueOf(countb));
                    break;
                case 4:
                    i4.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView1.setText(String.valueOf(countb));
                    break;
                case 5:
                    i5.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView1.setText(String.valueOf(countb));
                    break;

                case 6:
                    i6.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView1.setText(String.valueOf(countb));
                    break;
                case 0:
                    textView1.setText("OFF");

            }
        } else {
            return;
        }


    }

    public void click_twob(View v1) {

        final Button i1 =  findViewById(R.id.i1);
        final Button i2 =  findViewById(R.id.i2);
        final Button i3 =  findViewById(R.id.i3);
        final Button i4 =  findViewById(R.id.i4);
        final Button i5 =  findViewById(R.id.i5);
        final Button i6 =  findViewById(R.id.i6);
        final TextView textView1 = findViewById(R.id.textViewb4);

        if (countb > 0) {
            countb = countb - 1;
            switch (countb) {
                case 0:
                    i1.getBackground().clearColorFilter();
                    textView1.setText("OFF");
                    break;
                case 1:
                    i2.getBackground().clearColorFilter();
                    textView1.setText(String.valueOf(countb));
                    break;
                case 2:
                    i3.getBackground().clearColorFilter();
                    textView1.setText(String.valueOf(countb));
                    break;
                case 3:
                    i4.getBackground().clearColorFilter();
                    textView1.setText(String.valueOf(countb));
                    break;
                case 4:
                    i5.getBackground().clearColorFilter();
                    textView1.setText(String.valueOf(countb));
                    break;

                case 5:
                    i6.getBackground().clearColorFilter();
                    textView1.setText(String.valueOf(countb));
                    break;
            }

        } else {
            return;
        }


    }
    public void click_onec(View v) {

        final Button is1 = findViewById(R.id.is1);
        final Button is2 = findViewById(R.id.is2);
        final Button is3 = findViewById(R.id.is3);
        final Button is4 = findViewById(R.id.is4);
        final Button is5 = findViewById(R.id.is5);
        final Button is6 = findViewById(R.id.is6);
        final TextView textView2 = findViewById(R.id.textViewc4);
        if (countc < 6) {
            countc= countc + 1;
            switch (countc) {
                case 1:
                    is1.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView2.setText(String.valueOf(countc));
                    break;
                case 2:
                    is2.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView2.setText(String.valueOf(countc));
                    break;
                case 3:
                    is3.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView2.setText(String.valueOf(countc));
                    break;
                case 4:
                    is4.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView2.setText(String.valueOf(countc));
                    break;
                case 5:
                    is5.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView2.setText(String.valueOf(countc));
                    break;

                case 6:
                    is6.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                    textView2.setText(String.valueOf(countc));
                    break;
                case 0:
                    textView2.setText("OFF");

            }
        } else {
            return;
        }


    }

    public void click_twoc(View v1) {


        final Button is1 =  findViewById(R.id.is1);
        final Button is2 =  findViewById(R.id.is2);
        final Button is3 =  findViewById(R.id.is3);
        final Button is4 = findViewById(R.id.is4);
        final Button is5 =  findViewById(R.id.is5);
        final Button is6 =  findViewById(R.id.is6);
        final TextView textView2 = findViewById(R.id.textViewc4);
        // isOnePressed = true;

        if (countc > 0) {
            countc = countc - 1;
            switch (countc) {
                case 0:
                    is1.getBackground().clearColorFilter();
                    textView2.setText("OFF");
                    break;
                case 1:
                    is2.getBackground().clearColorFilter();
                    textView2.setText(String.valueOf(countc));
                    break;
                case 2:
                    is3.getBackground().clearColorFilter();
                    textView2.setText(String.valueOf(countc));
                    break;
                case 3:
                    is4.getBackground().clearColorFilter();
                    textView2.setText(String.valueOf(countc));
                    break;
                case 4:
                    is5.getBackground().clearColorFilter();
                    textView2.setText(String.valueOf(countc));
                    break;

                case 5:
                    is6.getBackground().clearColorFilter();
                    textView2.setText(String.valueOf(countc));
                    break;
            }

        } else {
            return;
        }
    }

    public void set_activity(View view){
        Intent it=new Intent(this,Main2Activity.class);
        startActivity(it);

    }
}
