package org.lessons.java.inheritance;

import java.math.BigInteger;

public class Smartphone extends Prodotto {
    private long IMEI;
    private int memoria;

    // constructor
    public Smartphone(int codice, String nome, String marca, BigInteger prezzo, BigInteger iva, long IMEI,
            int memoria) {
        super(codice, nome, marca, prezzo, iva);
        this.IMEI = IMEI;
        this.memoria = memoria;
    }

    // getters
    public long getIMEI() {
        return IMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    // setters
    public void setIMEI(long IMEI) {
        this.IMEI = IMEI;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
