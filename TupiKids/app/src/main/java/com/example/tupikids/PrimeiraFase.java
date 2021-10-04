package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

public class PrimeiraFase extends AppCompatActivity {
    private Animal boto = new Animal("Boto");
    private Captcha captcha = new Captcha();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_fase);
    }

    public void mostraTutorial(View view){

    }
}