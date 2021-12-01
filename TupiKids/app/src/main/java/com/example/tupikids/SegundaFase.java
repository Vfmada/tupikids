package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SegundaFase extends AppCompatActivity {
    ToggleButton img1;
    ToggleButton img2;
    ToggleButton img3;
    ToggleButton img4;
    ToggleButton img5;
    ToggleButton img6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_fase);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);

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

    public int verificaCaptcha(){
        if(!img1.isChecked() && !img2.isChecked() && img3.isChecked() && img4.isChecked() && img5.isChecked() && !img6.isChecked()){
            return 0;
            //CERTO
        }
        else if(!img1.isChecked() && !img2.isChecked() && !img3.isChecked() && !img4.isChecked() && !img5.isChecked() && !img6.isChecked()){
            return 1;
            //NÃO SELECIONADO
        }
        else {
            return 2;
            //ERROU
        }
    }

    public void continua(View view){
        LayoutInflater inflaterAviso = getLayoutInflater();
        View layoutAviso = inflaterAviso.inflate(R.layout.toast_aviso, (ViewGroup) findViewById(R.id.toast_aviso));
        final Toast toastAviso = new Toast(getApplicationContext());
        toastAviso.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toastAviso.setDuration(Toast.LENGTH_LONG);
        toastAviso.setView(layoutAviso);

        LayoutInflater inflaterErro = getLayoutInflater();
        View layoutErro = inflaterErro.inflate(R.layout.toast_erro, (ViewGroup) findViewById(R.id.toast_erro));
        final Toast toastErro = new Toast(getApplicationContext());
        toastErro.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toastErro.setDuration(Toast.LENGTH_LONG);
        toastErro.setView(layoutErro);

        switch (verificaCaptcha()){
            case 0:
                Intent i = new Intent(this, agradecimento_fase2.class);
                startActivity(i);
                finish();
                break;
            case 1:
                toastAviso.show();
                break;
            case 2:
                img1.setChecked(false);
                img2.setChecked(false);
                img3.setChecked(false);
                img4.setChecked(false);
                img5.setChecked(false);
                img6.setChecked(false);
                toastErro.show();
                break;
            default:
                mostraTutorial(view);
                break;
        }
    }

    public void mostraTutorial(View view){
        LayoutInflater inflaterTutorialCaptcha = getLayoutInflater();
        View layoutTutorialCaptcha = inflaterTutorialCaptcha.inflate(R.layout.toast_tutorialcaptcha, (ViewGroup) findViewById(R.id.toast_tutorialcaptcha));
        final Toast toastTutorialCaptcha = new Toast(getApplicationContext());
        toastTutorialCaptcha.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toastTutorialCaptcha.setDuration(Toast.LENGTH_LONG);
        toastTutorialCaptcha.setView(layoutTutorialCaptcha);

        toastTutorialCaptcha.show();
    }
}
