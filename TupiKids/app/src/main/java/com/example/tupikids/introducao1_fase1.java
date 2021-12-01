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
                fala.setText("Vamos ingressar nessa aventura pela Floresta Amazônica juntos!");
                break;
            case 2:
                fala.setText("Nosso objetivo é ajudar os animais resolvendo os problemas que estão acontecendo na floresta, então vamos nessa!");
                break;
            case 3:
                Intent i = new Intent(this, introducao2_fase1.class);
                startActivity(i);
                finish();
                break;
            default:
                fala.setText("");
                break;
        }
    }
}
