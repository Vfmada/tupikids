package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    int qntd_cliques = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

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
        ImageView tupi = (ImageView) findViewById(R.id.tupi);
        ImageView balaoFala = (ImageView) findViewById(R.id.balao_fala1);
        TextView fala = (TextView) findViewById(R.id.fala1);
        TextView fim = (TextView) findViewById(R.id.fim);
        TextView fim_contorno = (TextView) findViewById(R.id.fim_contorno);
        TextView obrigado = (TextView) findViewById(R.id.obrigado);
        TextView obrigado_contorno = (TextView) findViewById(R.id.obrigado_contorno);

        qntd_cliques++;
        switch(qntd_cliques){
            case 1:
                fala.setText("Muito obrigado por jogar o TupiKids, a natureza agradece!");
                break;
            case 2:
                fala.setText("Agora, a próxima etapa é fora do celular! Faça a sua parte não poluindo o meio ambiente!");
                break;
            case 3:
                tupi.setVisibility(View.GONE);
                balaoFala.setVisibility(View.GONE);
                fala.setVisibility(View.GONE);

                fim.setVisibility(View.VISIBLE);
                fim_contorno.setVisibility(View.VISIBLE);
                obrigado.setVisibility(View.VISIBLE);
                obrigado_contorno.setVisibility(View.VISIBLE);
                break;
            case 4:
                finishAffinity();
                break;
            default:
                break;
        }
    }
}
