package com.example.mdal_hasanmridha.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static SeekBar seekBar;
    private static TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar();
    }

    public void seekBar(){
        seekBar=(SeekBar)findViewById(R.id.seekBar);
        textView=(TextView)findViewById(R.id.textView);
        textView.setText("Covered :" +seekBar.getProgress() + " / "+seekBar.getMax());



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress_value;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress_value=progress;
                textView.setText("Covered :"+ progress +" / "+seekBar.getMax());
                Toast.makeText(MainActivity.this,"SeekBar in Progress",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"SeekBar in Start Tracking",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView.setText("Covered :"+ progress_value +" / "+seekBar.getMax());
                Toast.makeText(MainActivity.this,"SeekBar in Stop Tracking",Toast.LENGTH_LONG).show();
            }
        });
    }
}
