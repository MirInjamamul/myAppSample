package com.example.mdal_hasanmridha.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1,checkBox2,checkBox3;
    private Button button_Select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnCheckBox();
        addListnerOnButton();

    }

    public void addListnerOnButton(){
        checkBox1=(CheckBox)findViewById(R.id.checkBox_Dog);
        checkBox2=(CheckBox)findViewById(R.id.checkBox_Cat);
        checkBox3=(CheckBox)findViewById(R.id.checkBox_Cow);
        button_Select=(Button)findViewById(R.id.Select_Button);

        button_Select.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        StringBuffer result=new StringBuffer();

                        result.append("Dog : ").append(checkBox1.isChecked());
                        result.append("\nCat : ").append(checkBox2.isChecked());
                        result.append("\nCow :").append(checkBox3.isChecked());

                        Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void addListnerOnCheckBox(){
        checkBox1=(CheckBox)findViewById(R.id.checkBox_Dog);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isSelected()){
                    Toast.makeText(MainActivity.this,"Dog is Selected",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Dog is Not Selected",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
