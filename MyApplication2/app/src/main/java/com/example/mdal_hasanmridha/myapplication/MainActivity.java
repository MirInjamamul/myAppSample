package com.example.mdal_hasanmridha.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String My_Tag ="the_custom_message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(My_Tag,"onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(My_Tag,"onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(My_Tag,"onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(My_Tag,"onPasuse");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(My_Tag,"onStop");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(My_Tag,"onRestart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(My_Tag,"onDestroy");
    }
}
