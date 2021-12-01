package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class agradecimento_fase2 extends AppCompatActivity {
    int qntd_cliques = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agradecimento_fase2);

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
        ImageView tartaruga = (ImageView) findViewById(R.id.tartaruga);
        ImageView balaoFala_tartaruga = (ImageView) findViewById(R.id.balao_fala1);
        ImageView balaoFala_tupi = (ImageView) findViewById(R.id.balao_fala2);
        TextView fala_tartaruga = (TextView) findViewById(R.id.fala1);
        TextView fala_tupi = (TextView) findViewById(R.id.fala2);

        qntd_cliques++;
        switch(qntd_cliques){
            case 1:
                fala_tartaruga.setTextSize(14);
                fala_tartaruga.setText("Agora posso viver tranquilamente não tendo que me preocupar com todos esses canudos!");
                break;
            case 2:
                tartaruga.setVisibility(View.INVISIBLE);
                balaoFala_tartaruga.setVisibility(View.INVISIBLE);
                fala_tartaruga.setVisibility(View.INVISIBLE);

                tupi.setVisibility(View.VISIBLE);
                balaoFala_tupi.setVisibility(View.VISIBLE);
                fala_tupi.setVisibility(View.VISIBLE);
                break;
            case 3:
                fala_tupi.setTextSize(14);
                fala_tupi.setText("Pietra está muito agradecida, e agora pode nadar tranquilamente pelos mares!");
                break;
            case 4:
                fala_tupi.setTextSize(20);
                fala_tupi.setText("Porém, ainda temos mais uma missão...");
                break;
            case 5:
                Intent i = new Intent(this, introducao1_fase3.class);
                startActivity(i);
                finish();
                break;
            default:
                fala_tartaruga.setText("");
                fala_tupi.setText("");
                break;
        }
    }
}
