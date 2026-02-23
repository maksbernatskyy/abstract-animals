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

    // Nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    // Peso
    public BigDecimal getPeso() {
        return this.peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    // Colore
    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        if (colore != null) {
            this.colore = colore;
        }
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
