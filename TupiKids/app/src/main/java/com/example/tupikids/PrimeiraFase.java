package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class PrimeiraFase extends AppCompatActivity {
    ToggleButton img1;
    ToggleButton img2;
    ToggleButton img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_fase);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
    }

    public int verificaCaptcha(){
        if(img1.isChecked() && !img2.isChecked() && !img3.isChecked()){
            return 0;
        }
        else if(!img1.isChecked() && !img2.isChecked() && !img3.isChecked()){
            return 1;
        }
        else {
            return 2;
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
                Intent i = new Intent(this, agradecimento_fase1.class);
                startActivity(i);
                break;
            case 1:
                toastAviso.show();
                break;
            case 2:
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