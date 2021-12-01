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

        hideNavigationBar();
    }

    public void hideNavigationBar(){
        this.getWindow().getDecorView()
                .setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE

                );
    }

    public void passaDialogo(View view){
        TextView fala = (TextView) findViewById(R.id.fala1);
        qntd_cliques++;
        switch(qntd_cliques){
            case 1:
                fala.setText("Ele precisa chegar até a foz para encontrar sua família, nos ajude retirando a poluição para que o Bob possa se soltar!");
                break;
            case 2:
                Intent i = new Intent(this, PrimeiraFase.class);
                startActivity(i);
                finish();
                break;
            default:
                fala.setText("");
                break;
        }
    }
}
