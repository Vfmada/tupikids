package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class agradecimento_fase3 extends AppCompatActivity {
    int qntd_cliques = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agradecimento_fase3);

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
        ImageView onca = (ImageView) findViewById(R.id.onca);
        ImageView balaoFala_onca = (ImageView) findViewById(R.id.balao_fala1);
        ImageView balaoFala_tupi = (ImageView) findViewById(R.id.balao_fala2);
        TextView fala_onca = (TextView) findViewById(R.id.fala1);
        TextView fala_tupi = (TextView) findViewById(R.id.fala2);

        qntd_cliques++;
        switch(qntd_cliques){
            case 1:
                onca.setVisibility(View.INVISIBLE);
                balaoFala_onca.setVisibility(View.INVISIBLE);
                fala_onca.setVisibility(View.INVISIBLE);

                tupi.setVisibility(View.VISIBLE);
                balaoFala_tupi.setVisibility(View.VISIBLE);
                fala_tupi.setVisibility(View.VISIBLE);
                break;
            case 2:
                fala_tupi.setTextSize(14);
                fala_tupi.setText("Valéria está muito satisfeita pela sua ajuda! Agora ela pode desfrutar da selva sem nenhum problema!");
                break;
            case 3:
                Intent i = new Intent(this, Final.class);
                startActivity(i);
                finish();
                break;
            default:
                fala_onca.setText("");
                fala_tupi.setText("");
                break;
        }
    }
}
