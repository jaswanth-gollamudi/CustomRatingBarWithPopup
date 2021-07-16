package com.example.ratingbar;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.iarcuschin.simpleratingbar.SimpleRatingBar;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    TextView HiddenText;
    Button btnSubmit;
    SimpleRatingBar rating_bar;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HiddenText = findViewById(R.id.HiddenText);
        rating_bar = findViewById(R.id.rating_bar);

/*
        rating_bar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
*/
/*
                Log.i(TAG, "onTouch:1111111 " +rating_bar.getRating());
*//*

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    // TODO perform your action here
                    String StarPosition = String.valueOf(rating_bar.getRating());
                    if (StarPosition.equalsIgnoreCase("1.0")) {
                        HiddenText.setText("Poor");
                        HiddenText.setTextColor(Color.parseColor("#2F8E33"));

                    } else if (StarPosition.equalsIgnoreCase("2.0")) {
                        HiddenText.setText("Bad");
                        HiddenText.setTextColor(Color.parseColor("#2F8E33"));
                    } else if (StarPosition.equalsIgnoreCase("3.0")) {
                        HiddenText.setText("Average");
                        HiddenText.setTextColor(Color.parseColor("#2F8E33"));

                    } else if (StarPosition.equalsIgnoreCase("4.0")) {
                        HiddenText.setText("Good");
                        HiddenText.setTextColor(Color.parseColor("#2F8E33"));
                    } else if (StarPosition.equalsIgnoreCase("5.0")) {
                        HiddenText.setText("Excellent");
                        HiddenText.setTextColor(Color.parseColor("#2F8E33"));

                    } else {
                        HiddenText.setText("");

                    }

                    Log.i(TAG, "onTouch:2222222222 " + rating_bar.getRating());
                }
                return false;
            }
        });
*/

/*
        rating_bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                //your code in here
                String StarPosition = String.valueOf(rating_bar.getRating());
                if (StarPosition.equalsIgnoreCase("1.0")) {
                    HiddenText.setText("Poor");
                    HiddenText.setTextColor(Color.parseColor("#2F8E33"));

                } else if (StarPosition.equalsIgnoreCase("2.0")) {
                    HiddenText.setText("Bad");
                    HiddenText.setTextColor(Color.parseColor("#2F8E33"));

                } else if (StarPosition.equalsIgnoreCase("3.0")) {
                    HiddenText.setText("Average");
                    HiddenText.setTextColor(Color.parseColor("#2F8E33"));



                } else if (StarPosition.equalsIgnoreCase("4.0")) {
                    HiddenText.setText("Good");
                    HiddenText.setTextColor(Color.parseColor("#2F8E33"));

                } else if (StarPosition.equalsIgnoreCase("5.0")) {
                    HiddenText.setText("Excellent");
                    HiddenText.setTextColor(Color.parseColor("#2F8E33"));



                } else {
                    HiddenText.setText("");

                }

            }
        });
*/

        rating_bar.setOnRatingBarChangeListener(new SimpleRatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(SimpleRatingBar rating_bar, float rating, boolean fromUser) {

                String StarPosition = String.valueOf(rating_bar.getRating());
                Log.i(TAG, "onRatingChanged: ---" + StarPosition);

                if (StarPosition.equalsIgnoreCase("1.0")) {
                    HiddenText.setText("Poor");
                    HiddenText.setTextColor(Color.parseColor("#2F8E33"));
                    AlertEdit();

                } else if (StarPosition.equalsIgnoreCase("2.0")) {
                    HiddenText.setText("Bad");
                    HiddenText.setTextColor(Color.parseColor("#2F8E33"));
                    AlertEdit();

                } else if (StarPosition.equalsIgnoreCase("3.0")) {
                    HiddenText.setText("Average");
                    HiddenText.setTextColor(Color.parseColor("#2F8E33"));
                    AlertEdit();
                } else if (StarPosition.equalsIgnoreCase("4.0")) {
                    HiddenText.setText("Good");
                    HiddenText.setTextColor(Color.parseColor("#2F8E33"));

                } else if (StarPosition.equalsIgnoreCase("5.0")) {
                    HiddenText.setText("Excellent");
                    HiddenText.setTextColor(Color.parseColor("#2F8E33"));


                } else {
                    HiddenText.setText("");

                }

            }
        });


    }

    private void AlertEdit() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        //alertDialog.setTitle("please mention the reason?");
        alertDialog.setMessage("Please mention the reason?");
        alertDialog.setCancelable(false);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(30,30,10,10);
        layout.setBackgroundColor(Color.parseColor("#55EAE3E3"));

        CheckBox FeedBackOption1 = new CheckBox(this);
        FeedBackOption1.setText("Technical difficulties while doing transaction");
        CheckBox FeedBackOption2 = new CheckBox(this);
        FeedBackOption2.setText("Long-time taken to resolve the issue/issue not resolved or pending");
        CheckBox FeedBackOption3 = new CheckBox(this);
        FeedBackOption3.setText("Agent’s behaviour was rude or inappropriate");
        CheckBox FeedBackOption4 = new CheckBox(this);
        FeedBackOption4.setText("Agent was inattentive or busy with something else");
        CheckBox FeedBackOption5 = new CheckBox(this);
        FeedBackOption5.setText("There was a lot of rush in the outlet");
        CheckBox FeedBackOption6 = new CheckBox(this);
        FeedBackOption6.setText("Displayed services were not available");

        EditText FeedBackOption7 = new EditText(this);
        FeedBackOption7.setHint("Tell us More");




        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        //input.setLayoutParams(lp);
        FeedBackOption1.setLayoutParams(lp);
        FeedBackOption2.setLayoutParams(lp);
        FeedBackOption3.setLayoutParams(lp);
        FeedBackOption4.setLayoutParams(lp);
        FeedBackOption5.setLayoutParams(lp);
        FeedBackOption6.setLayoutParams(lp);
        FeedBackOption7.setLayoutParams(lp2);

        layout.addView(FeedBackOption1);
        layout.addView(FeedBackOption2);
        layout.addView(FeedBackOption3);
        layout.addView(FeedBackOption4);
        layout.addView(FeedBackOption5);
        layout.addView(FeedBackOption6);
        layout.addView(FeedBackOption7);

        alertDialog.setView(layout);


        alertDialog.setPositiveButton("Submit",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });

/*        alertDialog.setNegativeButton("NO",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });*/

        alertDialog.show();

    }

}

