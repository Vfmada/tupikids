package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void mostrarCreditos(View view){
        Toast.makeText(this, "Desenvolvido por:\n\nVinícius F. Madalena,\nLuiz Rosar,\nGabrielle Garcia,\nYuri Adami,\nIsadora Dutra,\nMatheus Lopes.", Toast.LENGTH_LONG).show();
    }

    public void jogar(View view){
        Intent i = new Intent(this, PrimeiraFase.class);
        startActivity(i);
    }
}