package org.lessons.java.inheritance;

import java.math.BigInteger;

public class Cuffie extends Prodotto {

    private String colore;
    private boolean wireless;

    // constructor
    public Cuffie(int codice, String nome, String marca, BigInteger prezzo, BigInteger iva, String colore,
            boolean wireless) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    // getters
    public String getColore() {
        return colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    // setters
    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    // apply discount
    @Override
    public BigInteger discountedPrice() {
        if (!this.wireless) {
            return (getPrezzo().multiply(getIva().add(BigInteger.valueOf(100)))).divide(BigInteger.valueOf(10000))
                    .multiply(BigInteger.valueOf(93));
        }
        return (getPrezzo().multiply(getIva().add(BigInteger.valueOf(100)))).divide(BigInteger.valueOf(10000))
                .multiply(BigInteger.valueOf(98));
    }

}
