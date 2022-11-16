package com.example.maket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Auto extends AppCompatActivity{

private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto);
         checkBox=this.findViewById(R.id.checkBox);
    }


    public void Log(View v){
        Intent reg = new Intent(this,LogIn.class);
        startActivity(reg);
    }

    public void Register(View v){
        Intent reg = new Intent(Auto.this,Register.class);
        startActivity(reg);
    }

}
