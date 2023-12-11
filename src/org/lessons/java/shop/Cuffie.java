package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String colore;
    private String filo;
    public Cuffie(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String colore, String filo) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.filo = filo;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }


    @Override
    public String toString(){
      return "Descrizione prodotto: " + getCodice() + getNome() + "\n" + getDescrizione() + "\n" + getPrezzo() + "€" + "\n" + getIva() + "\n" + "prezzo con iva: " + getPrezzoIva() + "€" + "\n" + "Colore: " + colore + "\n" + "hanno il filo: " + filo;
    }
}
