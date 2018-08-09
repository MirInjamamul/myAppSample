package com.example.mdal_hasanmridha.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static ImageView imgView;
    private static Button button_sbm;

    private int current_image_index;
    int [] images={R.mipmap.ic_launcher_new1,R.mipmap.ic_launcher_view2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClickListner();
    }

    public void onButtonClickListner(){
        imgView = (ImageView)findViewById(R.id.imageView2);
        button_sbm=(Button)findViewById(R.id.button_switch);

        button_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image_index++;
                current_image_index=current_image_index%images.length;

                imgView.setImageResource(images[current_image_index]);
            }
        });
    }
}
