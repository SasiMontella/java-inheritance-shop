package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {
    private  int codiceIMEI;
    private int memoria;

    public Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.memoria = memoria;
        codiceIMEI = randomCodice();
    }

    public int getCodiceIMEI() {
        return codiceIMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    private int randomCodice(){
        Random random = new Random();
        return random.nextInt(10000, 100000);
    }
    @Override
    public String toString(){
        return "Descrizione prodotto: " + getCodice() +  " " + getNome() + "\n" + getDescrizione() + "\n" + getPrezzo() + "€" + "\n" + getIva() + "\n" + "prezzo con iva: " + getPrezzoIva() + "€" +  "\n" + "codice IMEI: " + codiceIMEI + "\n" + "RAM: " + memoria;
    }
}
