package com.example.tupikids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    public void mostrarCreditos(View view){
        LayoutInflater inflaterInfo = getLayoutInflater();
        View layoutInfo = inflaterInfo.inflate(R.layout.toast_infocreditos, (ViewGroup) findViewById(R.id.toast_infocreditos));
        final Toast toastInfo = new Toast(getApplicationContext());
        toastInfo.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toastInfo.setDuration(Toast.LENGTH_LONG);
        toastInfo.setView(layoutInfo);

        toastInfo.show();
    }

    public void jogar(View view){
        Intent i = new Intent(this, introducao1_fase1.class);
        startActivity(i);
        finish();
    }
}
