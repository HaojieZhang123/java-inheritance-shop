package org.lessons.java.inheritance;

import java.math.BigInteger;

public class Prodotto {
    protected int codice;
    protected String nome;
    protected String marca;
    protected BigInteger prezzo;
    protected BigInteger iva;

    // constructor
    public Prodotto(int codice, String nome, String marca, BigInteger prezzo, BigInteger iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // getters
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public BigInteger getPrezzo() {
        return prezzo;
    }

    public BigInteger getIva() {
        return iva;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrezzo(BigInteger prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(BigInteger iva) {
        this.iva = iva;
    }

}
