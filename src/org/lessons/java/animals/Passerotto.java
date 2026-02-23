package org.lessons.java.animals;

import java.math.BigDecimal;

import interfaces.Vola;

public class Passerotto extends Animale implements Vola {
    private float aperturaAlare;

    public Passerotto(String nome, BigDecimal peso, String colore, float aperturaAlare) {
        super(nome, peso, colore);
        this.aperturaAlare = aperturaAlare;
    }

    public float getAperturaAlare() {
        return this.aperturaAlare;
    }

    public void setAparturaAlare(float aperturaAlare) {
        if(aperturaAlare > 0) {
            this.aperturaAlare = aperturaAlare;
        }
    }

    public void verso() {
        System.out.println("Cinguetta");
    }

    public void mangia() {
        System.out.println("Vermi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando");
    }
}
