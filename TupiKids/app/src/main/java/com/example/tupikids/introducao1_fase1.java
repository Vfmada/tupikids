package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class introducao1_fase1 extends AppCompatActivity {
    int qntd_cliques = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducao1_fase1);
    }

    public void passaDialogo(View view){
        TextView fala = (TextView) findViewById(R.id.fala);
        qntd_cliques++;
        switch(qntd_cliques){
            case 1:
                fala.setText("Nosso objetivo é ajudar os animais a resolver os problemas que estão acontecendo na floresta, então vamos logo!");
                break;
            case 2:
                Intent i = new Intent(this, introducao2_fase1.class);
                startActivity(i);
                break;
            default:
                fala.setText("");
                break;
        }
    }
}
