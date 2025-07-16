package org.lessons.java.inheritance;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Prodotto p = new Prodotto(0000, "Prodotto Generico", "Marca Generica", BigInteger.valueOf(100),
                BigInteger.valueOf(22));

        Smartphone iPhone16Pro = new Smartphone(0001, "iPhone 16 Pro", "Apple", BigInteger.valueOf(1200),
                BigInteger.valueOf(22), 123456789012345L, 256);
        Smartphone samsungGalaxyS25Ultra = new Smartphone(0002, "Samsung Galaxy S25 Ultra", "Samsung",
                BigInteger.valueOf(1300), BigInteger.valueOf(22), 987654321098765L, 512);

        Televisori samsungQLED = new Televisori(0003, "Samsung QLED 55\"", "Samsung", BigInteger.valueOf(800),
                BigInteger.valueOf(22), 55, true);
        Televisori lgC3 = new Televisori(0004, "LG C3 OLED 65\"", "LG", BigInteger.valueOf(1500),
                BigInteger.valueOf(22), 65, true);

        Cuffie sonyWH1000XM5 = new Cuffie(0005, "Sony WH-1000XM5", "Sony", BigInteger.valueOf(350),
                BigInteger.valueOf(22), "Nero", true);
        Cuffie appleAirPodsPro = new Cuffie(0006, "Apple AirPods Pro", "Apple", BigInteger.valueOf(250),
                BigInteger.valueOf(22), "Bianco", true);

        System.out.println(String.format("Prodotto: %s, Marca: %s, Prezzo: %s, IVA: %s", p.getNome(), p.getMarca(),
                p.getPrezzo(), p.getIva()));

        System.out.println(String.format("Smartphone: %s, Marca: %s, IMEI: %d, Memoria: %dGB", iPhone16Pro.getNome(),
                iPhone16Pro.getMarca(), iPhone16Pro.getIMEI(), iPhone16Pro.getMemoria()));
        System.out.println(String.format("Smartphone: %s, Marca: %s, IMEI: %d, Memoria: %dGB",
                samsungGalaxyS25Ultra.getNome(), samsungGalaxyS25Ultra.getMarca(), samsungGalaxyS25Ultra.getIMEI(),
                samsungGalaxyS25Ultra.getMemoria()));

        System.out.println(String.format("Televisore: %s, Marca: %s, Dimensione: %d\", Smart TV: %b",
                samsungQLED.getNome(), samsungQLED.getMarca(), samsungQLED.getDimensione(), samsungQLED.isSmartTv()));
        System.out.println(String.format("Televisore: %s, Marca: %s, Dimensione: %d\", Smart TV: %b", lgC3.getNome(),
                lgC3.getMarca(), lgC3.getDimensione(), lgC3.isSmartTv()));

        System.out.println(String.format("Cuffie: %s, Marca: %s, Colore: %s, Wireless: %b", sonyWH1000XM5.getNome(),
                sonyWH1000XM5.getMarca(), sonyWH1000XM5.getColore(), sonyWH1000XM5.isWireless()));
        System.out.println(String.format("Cuffie: %s, Marca: %s, Colore: %s, Wireless: %b", appleAirPodsPro.getNome(),
                appleAirPodsPro.getMarca(), appleAirPodsPro.getColore(), appleAirPodsPro.isWireless()));

        // Example of setting new values
        iPhone16Pro.setMemoria(512);
        samsungQLED.setSmartTv(false);

        System.out.println(String.format("Updated Smartphone: %s, Memoria: %dGB", iPhone16Pro.getNome(),
                iPhone16Pro.getMemoria()));
        System.out.println(String.format("Updated Televisore: %s, Smart TV: %b", samsungQLED.getNome(),
                samsungQLED.isSmartTv()));
    }
}
