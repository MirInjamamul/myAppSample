package com.example.mdal_hasanmridha.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static TextView textView;
    private static RatingBar rating_b;
    private static Button button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listnerOnRatingBar();
        onButtonClickListner();

    }

    public void listnerOnRatingBar(){
        rating_b=(RatingBar)findViewById(R.id.ratingBar);
        textView=(TextView)findViewById(R.id.textView);

        rating_b.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        textView.setText(String.valueOf(rating));
                    }
                }
        );
    }

    public void onButtonClickListner(){
        rating_b=(RatingBar)findViewById(R.id.ratingBar);
        button_sbm=(Button)findViewById(R.id.buttonSubmit);

        button_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, String.valueOf(rating_b.getRating()),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
