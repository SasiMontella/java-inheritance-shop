package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori  extends Prodotto{

    private int pollici;
    private String smart;
    public Televisori(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, int pollici, String smart) {
        super(nome, descrizione, prezzo, iva);
        this.pollici = pollici;
        this.smart = smart;
    }

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public String getSmart() {
        return smart;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    @Override
    public String toString(){
        return "Descrizione prodotto: " + getCodice() + getNome() + "\n" + getDescrizione() + "\n" + getPrezzo() + "€" + "\n" + getIva() + "\n" + "prezzo con iva: " + getPrezzoIva() + "€" + "\n" + "Grandezza in pollici: " + pollici + "\"" + "\n" + smart;
}
}
