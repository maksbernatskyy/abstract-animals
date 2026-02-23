package org.lessons.java.animals;

import java.lang.invoke.MethodHandleInfo;
import java.math.BigDecimal;

public class Cane extends Animale {
    // Attributi
    private String razza;

    // Metodi
    public Cane(String nome, BigDecimal peso, String colore, String razza) {
        super(nome, peso, colore);
        this.razza = razza;
    }

    
}
