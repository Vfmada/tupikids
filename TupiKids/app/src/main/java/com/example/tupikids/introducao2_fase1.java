package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class introducao2_fase1 extends AppCompatActivity {
    int qntd_cliques = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducao2_fase1);
    }

    public void passaDialogo(View view){
        TextView fala = (TextView) findViewById(R.id.fala);
        qntd_cliques++;
        switch(qntd_cliques){
            case 1:
                fala.setText("Ele precisa chegar até a foz para encontrar sua família, me ajude a retirar a poluição para que o Bob possa se soltar!");
                break;
            case 2:
                Intent i = new Intent(this, PrimeiraFase.class);
                startActivity(i);
                break;
            default:
                fala.setText("");
                break;
        }
    }
}