package com.example.mdal_hasanmridha.radiobutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static RadioGroup radio_g;
    private static RadioButton radio_select;
    private static Button button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListnerButton();
    }

    public void onClickListnerButton(){
        radio_g=(RadioGroup)findViewById(R.id.rg_animals);
        button_sbm=(Button)findViewById(R.id.buttonSubmit);

        button_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_id=radio_g.getCheckedRadioButtonId();
                radio_select=(RadioButton)findViewById(selected_id);

                Toast.makeText(MainActivity.this,radio_select.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
