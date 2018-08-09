package com.example.mdal_hasanmridha.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static EditText userName;
    private static EditText passWord;
    private static TextView attempts;
    private static Button login_button;
    int attempt_counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        onClickLoginButtonListner();
    }

    public void onClickLoginButtonListner(){
        userName=(EditText)findViewById(R.id.user_name_txt);
        passWord=(EditText)findViewById(R.id.password_Txt);
        attempts=(TextView)findViewById(R.id.attempts_Counts_Txt);
        login_button=(Button)findViewById(R.id.button_Login);
        attempts.setText(Integer.toString(attempt_counter));

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userName.getText().toString().equals("username") && passWord.getText().toString().equals("password")){
                    Toast.makeText(Login.this,"Username and Password is Correct",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent("com.example.mdal_hasanmridha.login.UserActivity");
                    startActivity(intent);
                }
                else{
                    Toast.makeText(Login.this,"Username and Password is not Correct",Toast.LENGTH_SHORT).show();
                    attempt_counter--;
                    attempts.setText(Integer.toString(attempt_counter));
                    if(attempt_counter==0){
                        login_button.setEnabled(false);
                    }
                }
            }
        });
    }
}
