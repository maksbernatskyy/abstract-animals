package org.lessons.java.animals;

import java.math.BigDecimal;

import interfaces.Vola;

public class Aquila extends Animale implements Vola {
    private float altezza;

    public Aquila(String nome, BigDecimal peso, String colore, float altezza) {
        super(nome, peso, colore);
        this.altezza = altezza;
    }

    public float getAltezza() {
        return this.altezza;
    }

    public void setAltezza(float altezza) {
        if(altezza > 0) {
            this.altezza = altezza;
        }
    }

    @Override
    public void verso() {
        System.out.println("Stridio");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }
}
