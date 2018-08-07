package com.example.mdal_hasanmridha.wrapcontent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText pass_word;
    private Button button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pass_word=(EditText)findViewById(R.id.editText);
        button_sbm=(Button)findViewById(R.id.button);

    }
}
