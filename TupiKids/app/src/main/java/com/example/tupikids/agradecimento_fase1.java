package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class agradecimento_fase1 extends AppCompatActivity {
    int qntd_cliques = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agradecimento_fase1);

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
        ImageView boto = (ImageView) findViewById(R.id.boto);
        ImageView tupi = (ImageView) findViewById(R.id.tupi);
        ImageView balaoFala_boto = (ImageView) findViewById(R.id.balao_fala1);
        ImageView balaoFala_tupi = (ImageView) findViewById(R.id.balao_fala2);
        TextView fala_boto = (TextView) findViewById(R.id.fala1);
        TextView fala_tupi = (TextView) findViewById(R.id.fala2);

        qntd_cliques++;
        switch(qntd_cliques){
            case 1:
                fala_boto.setTextSize(14);
                fala_boto.setText("Por conta do descarte errado de lixo, tem sido cada vez mais difícil nadar livremente pelos rios");
                break;
            case 2:
                boto.setVisibility(View.GONE);
                balaoFala_boto.setVisibility(View.GONE);
                fala_boto.setVisibility(View.GONE);

                tupi.setVisibility(View.VISIBLE);
                balaoFala_tupi.setVisibility(View.VISIBLE);
                fala_tupi.setVisibility(View.VISIBLE);
                break;
            case 3:
                fala_tupi.setTextSize(14);
                fala_tupi.setText("Obrigado por ajudar o meu amigo Bob! Agora o rio está limpinho!");
                break;
            case 4:
                fala_tupi.setTextSize(22);
                fala_tupi.setText("Mas, temos mais um problema… ");
                break;
            case 5:
                Intent i = new Intent(this, introducao1_fase2.class);
                startActivity(i);
                finish();
                break;
            default:
                fala_boto.setText("");
                fala_tupi.setText("");
                break;
        }
    }
}
