package com.example.maket;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regis);

    }
    public void Login (View v){
        startActivity(new Intent(this,Auto.class));
    }

    public void Regist(View v){
        startActivity(new Intent(this,LogIn.class));
    }
}
