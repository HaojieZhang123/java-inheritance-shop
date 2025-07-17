package org.lessons.java.inheritance;

import java.math.BigInteger;
import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private BigInteger prezzo;
    private BigInteger iva;

    // constructor
    public Prodotto(String nome, String marca, BigInteger prezzo, BigInteger iva) {
        this.codice = new Random().nextInt(100000); // generate a random codice
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
        return prezzo.multiply(iva.add(BigInteger.valueOf(100))).divide(BigInteger.valueOf(100));
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

    // apply discount
    public BigInteger discountedPrice() {
        return (prezzo.multiply(iva.add(BigInteger.valueOf(100)))).divide(BigInteger.valueOf(10000))
                .multiply(BigInteger.valueOf(98));
    }

    // toString method
    @Override
    public String toString() {
        return "Prodotto{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                '}';
    }

}
