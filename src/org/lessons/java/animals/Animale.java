package org.lessons.java.animals;

import java.math.BigDecimal;

public abstract class Animale {
    // Attributi
    protected String nome;
    protected BigDecimal peso;
    protected String colore;

    // Metodi
    public Animale(String nome, BigDecimal peso, String colore) {
        this.nome = nome;
        this.peso = peso;
        this.colore = colore;
    }

    // Dormire uguale per tutti
    public void dormi() {
        System.out.println("Zzz");
    }

    // Verso diverso
    public abstract void verso();

    // Cosa mangia
    public abstract void mangia();
}
