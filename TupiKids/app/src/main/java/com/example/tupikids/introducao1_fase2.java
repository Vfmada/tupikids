package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class introducao1_fase2 extends AppCompatActivity {
    int qntd_cliques = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducao1_fase2);

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
        TextView fala = (TextView) findViewById(R.id.fala);
        
        qntd_cliques++;
        switch(qntd_cliques){
            case 1:
                fala.setText("Precisamos ajudá-la para que ela não confunda sua preciosa comida com todo esse lixo.");
                break;
            case 2:
                Intent i = new Intent(this, SegundaFase.class);
                startActivity(i);
                finish();
                break;
            default:
                fala.setText("");
                break;
        }
    }
}
