package org.lessons.java.animals;

import java.math.BigDecimal;

public abstract class Animale {
    protected String nome;
    protected BigDecimal peso;
    protected String colore;

    public Animale(String nome, BigDecimal peso, String colore) {
        this.nome = nome;
        this.peso = peso;
        this.colore = colore;
    }
}
