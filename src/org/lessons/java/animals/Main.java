package org.lessons.java.animals;

import java.math.BigDecimal;

import interfaces.Nuota;
import interfaces.Vola;

public class Main {
    public static void faiVolare(Vola animale) {
        animale.vola();
    }

    public static void faiNuotare(Nuota animale) {
        animale.nuota();
    }
    public static void main(String[] args) {
        Cane nuovoCane = new Cane("Maya", new BigDecimal("40"), "Bianco", "Dogo Argentino");
        Aquila aquila = new Aquila("Reale", new BigDecimal("10"), "Marrone", 5f);

        faiVolare(aquila);

        nuovoCane.dormi();
        nuovoCane.verso();
        nuovoCane.mangia();


    }
}
