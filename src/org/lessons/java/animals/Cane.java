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
    
    // Razza
    public String getRazza() {
        return this.razza;
    }

    public void setRazza(String razza) {
        if(razza != null) {
            this.razza = razza;
        }
    }


    @Override
    public void verso() {
        System.out.println("Abbaia");
    }

    @Override
    public void mangia() {
        System.out.println("Di tutto");
    }
}
