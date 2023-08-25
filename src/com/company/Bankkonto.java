package com.company;

public class Bankkonto {
    private double kontostand;
    public void veraendereKontostand(double betrag){
        kontostand += betrag;
        kontostand = ((int)(kontostand * 10))/10;
    }

    public double getKontostand() {
        return kontostand;
    }
}
