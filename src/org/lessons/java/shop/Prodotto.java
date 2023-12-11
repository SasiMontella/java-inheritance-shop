package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    //ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;
    //COSTRUTTORI

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        codice = codiceRandom();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    //GETTER E SETTER

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
    //METODI
    public BigDecimal getPrezzoIva(){
        BigDecimal prezzoIva = prezzo.multiply(iva);
        return prezzo.add(prezzoIva).setScale(2, RoundingMode.HALF_EVEN);
    }
    private int codiceRandom(){
        Random random = new Random();
        return random.nextInt(10000, 1000000);
    }

    @Override
    public String toString() {
        return "Descrizione prodotto: " + codice + nome + "\n" + descrizione + "\n" + prezzo + "€" + "\n" + iva + "\n" + "prezzo con iva: " + getPrezzoIva() + "€";
    }
}
