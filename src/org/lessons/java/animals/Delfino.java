package org.lessons.java.animals;

import java.math.BigDecimal;

import interfaces.Nuota;

public class Delfino extends Animale implements Nuota {
    private float lunghezza;

    public Delfino(String nome, BigDecimal peso, String colore, float lunghezza) {
        super(nome, peso, colore);
        this.lunghezza = lunghezza;
    }

    public float getlunghezza() {
        return this.lunghezza;
    }

    public void setLunghezza(float lunghezza) {
        if(lunghezza > 0) {
            this.lunghezza = lunghezza;
        }
    }

    @Override
    public void verso() {
        System.out.println("Fischia");
    }

    @Override
    public void mangia() {
        System.out.println("Pesci");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando");
    }
}
