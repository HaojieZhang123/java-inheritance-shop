package org.lessons.java.inheritance;

import java.math.BigInteger;

public class Televisori extends Prodotto {
    private int dimensione;
    private boolean smartTv;

    // constructor
    public Televisori(int codice, String nome, String marca, BigInteger prezzo, BigInteger iva, int dimensione,
            boolean smartTv) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensione = dimensione;
        this.smartTv = smartTv;
    }

    // getters
    public int getDimensione() {
        return dimensione;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    // setters
    public void setDimensione(int dimensione) {
        this.dimensione = dimensione;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

}
