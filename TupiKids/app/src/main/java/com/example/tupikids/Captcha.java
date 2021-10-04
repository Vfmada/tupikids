package com.example.tupikids;

import android.graphics.Paint;

import java.util.ArrayList;

public class Captcha {
    private ArrayList<String> imagensCertas = new ArrayList<String>(); //"links?" das imagens corretas que devem ser marcadas pelo usuário
    private ArrayList<String> imagensErradas = new ArrayList<String>(); //"links?" das imagens incorretas que não devem ser marcadas pelo usuário
    private ArrayList<String> imagensMarcadas = new ArrayList<String>(); //"links?" das imagens que foram marcadas pelo usuário
    private int qntd_imagensErradas = 0;
    private int qntd_imagensCertas = 0;

    public Captcha(){

    }

    public boolean verificaCaptcha(){ //retornou true = usuario acertou todas, retornou false = usuario errou
        for(String a : imagensMarcadas){
            if(imagensErradas.contains(a)){
                this.qntd_imagensErradas++;
            }
            if(imagensCertas.contains(a)){
                this.qntd_imagensCertas++;
            }
        }
        if(qntd_imagensErradas > 0){
            return false;
        }
        else{
            return true;
        }
    }

    public void marcarImagem(String imagem){
        imagensMarcadas.add(imagem);
    }

    public void add_imagensCertas(String... imagens){
        for(String a : imagens){
            imagensCertas.add(a);
        }
    }

    public void add_imagensErradas(String... imagens){
        for(String a : imagens){
            imagensErradas.add(a);
        }
    }
}

