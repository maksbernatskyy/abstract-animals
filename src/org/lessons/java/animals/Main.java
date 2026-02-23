package org.lessons.java.animals;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Animale nuovoCane = new Cane("Maya", new BigDecimal("40"), "Bianco", "Dogo Argentino");

        nuovoCane.dormi();
        nuovoCane.verso();
        nuovoCane.mangia();
    }
}
