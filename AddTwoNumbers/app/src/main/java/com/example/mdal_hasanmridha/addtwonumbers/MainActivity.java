package com.example.mdal_hasanmridha.addtwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSumButtonClick(View v){
        EditText et1=(EditText) findViewById(R.id.numberField);
        EditText et2=(EditText) findViewById(R.id.numberField2);

        TextView tv1=(TextView) findViewById(R.id.resultTxt);

        int num1=Integer.parseInt(et1.getText().toString());
        int num2=Integer.parseInt(et2.getText().toString());

        int sum=num1+num2;

        tv1.setText(Integer.toString(sum));
    }
}
