package org.lessons.java.inheritance;

import java.math.BigInteger;

public class Carrello {

    private Smartphone[] smartphone;
    private Televisori[] televisori;
    private Cuffie[] cuffie;

    private boolean hasCard;

    // constructor
    public Carrello() {
        this.smartphone = new Smartphone[0];
        this.televisori = new Televisori[0];
        this.cuffie = new Cuffie[0];
        this.hasCard = false; // default value, can be set later
    }

    // getters
    public Smartphone[] getSmartphone() {
        return smartphone;
    }

    public Televisori[] getTelevisori() {
        return televisori;
    }

    public Cuffie[] getCuffie() {
        return cuffie;
    }

    public boolean isHasCard() {
        return hasCard;
    }

    // setters
    public void setSmartphone(Smartphone[] smartphone) {
        this.smartphone = smartphone;
    }

    public void setTelevisori(Televisori[] televisori) {
        this.televisori = televisori;
    }

    public void setCuffie(Cuffie[] cuffie) {
        this.cuffie = cuffie;
    }

    public void setHasCard(boolean hasCard) {
        this.hasCard = hasCard;
    }

    // add smartphone
    public void addSmartphone(Smartphone newSmartphone) {
        Smartphone[] updatedSmartphones = new Smartphone[smartphone.length + 1];
        for (int i = 0; i < smartphone.length; i++) {
            updatedSmartphones[i] = smartphone[i];
        }
        updatedSmartphones[smartphone.length] = newSmartphone;
        this.smartphone = updatedSmartphones;
    }

    // add televisori
    public void addTelevisori(Televisori newTelevisore) {
        Televisori[] updatedTelevisori = new Televisori[televisori.length + 1];
        for (int i = 0; i < televisori.length; i++) {
            updatedTelevisori[i] = televisori[i];
        }
        updatedTelevisori[televisori.length] = newTelevisore;
        this.televisori = updatedTelevisori;
    }

    // add cuffie
    public void addCuffie(Cuffie newCuffia) {
        Cuffie[] updatedCuffie = new Cuffie[cuffie.length + 1];
        for (int i = 0; i < cuffie.length; i++) {
            updatedCuffie[i] = cuffie[i];
        }
        updatedCuffie[cuffie.length] = newCuffia;
        this.cuffie = updatedCuffie;
    }

    // toString method for displaying the cart contents
    @Override
    public String toString() {
        int smartphoneCount = smartphone != null ? smartphone.length : 0;
        int televisoriCount = televisori != null ? televisori.length : 0;
        int cuffieCount = cuffie != null ? cuffie.length : 0;

        String result = "Carrello:\n";

        for (int i = 0; i < smartphoneCount; i++) {
            result += "Smartphone " + (i + 1) + ": " + smartphone[i].getNome() + ", Marca: " + smartphone[i].getMarca()
                    + ", prezzo:" + smartphone[i].getPrezzo() + "prezzo scontato: " + smartphone[i].discountedPrice()
                    + "\n";
        }
        for (int i = 0; i < televisoriCount; i++) {
            result += "Televisore " + (i + 1) + ": " + televisori[i].getNome() + ", Marca: " + televisori[i].getMarca()
                    + ", prezzo:" + televisori[i].getPrezzo() + "prezzo scontato: " + televisori[i].discountedPrice()
                    + "\n";
        }
        for (int i = 0; i < cuffieCount; i++) {
            result += "Cuffie " + (i + 1) + ": " + cuffie[i].getNome() + ", Marca: " + cuffie[i].getMarca()
                    + ", prezzo:" + cuffie[i].getPrezzo() + "prezzo scontato: " + cuffie[i].discountedPrice() + "\n";
        }

        return result;
    }

    // get prices
    public BigInteger getTotalPrice() {
        BigInteger total = BigInteger.ZERO;

        for (int i = 0; i < smartphone.length; i++) {
            if (hasCard) {
                total = total.add(smartphone[i].discountedPrice());
            } else {
                total = total.add(smartphone[i].getPrezzo());
            }
        }
        for (int i = 0; i < televisori.length; i++) {
            if (hasCard) {
                total = total.add(televisori[i].discountedPrice());
            } else {
                total = total.add(televisori[i].getPrezzo());
            }
        }
        for (int i = 0; i < cuffie.length; i++) {
            if (hasCard) {
                total = total.add(cuffie[i].discountedPrice());
            } else {
                total = total.add(cuffie[i].getPrezzo());
            }
        }

        return total;
    }

}
