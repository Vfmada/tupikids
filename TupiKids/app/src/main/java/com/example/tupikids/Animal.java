package com.example.tupikids;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Animal {
    private String nome;
    private ArrayList<String> falas = new ArrayList<String>();

    public Animal(String nome){
        this.nome = nome;
    }

    public void addFala(String fala){
        falas.add(fala);
    }

    public void mostraFalas(){ // ?
        for (String a : falas){
            //Mostra "a"
        }

    }
}
