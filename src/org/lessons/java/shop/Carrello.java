package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Scanner;


public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Prodotto> cart = new HashSet<>();
        boolean sino = false;
        while(!sino) {
            System.out.println("Vuoi aggiungere un prodotto al carrello? (y/n)");
            String sceltaUtente = scan.nextLine().toLowerCase();

            if (sceltaUtente.equals("y")) {
                System.out.println("Che tipo di prodotto vuoi inserire? 1.Smartphone, 2.Televisore, 3.Cuffie");
                String tipoProdotto = scan.nextLine();
                if (tipoProdotto.equals("1")) {
                    System.out.println("Inserisci il nome del prodotto: ");
                    String smartName = scan.nextLine();
                    System.out.println("Inserisci la descrizione: ");
                    String smartDesc = scan.nextLine();
                    System.out.println("Inserisci il prezzo: ");
                    BigDecimal smartPrezzo = scan.nextBigDecimal();
                    System.out.println("Inserisci l'IVA: ");
                    BigDecimal smartIva = scan.nextBigDecimal();
                    System.out.println("Inserisci la RAM dello smartphone: ");
                    int smartRam = scan.nextInt();
                    Smartphone prodottoScelto = new Smartphone(smartName, smartDesc, smartPrezzo, smartIva, smartRam);
                    cart.add(prodottoScelto);
                } else if (tipoProdotto.equals("2")) {
                    System.out.println("Inserisci il nome del prodotto: ");
                    String tvName = scan.nextLine();
                    System.out.println("Inserisci la descrizione: ");
                    String tvDesc = scan.nextLine();
                    System.out.println("Inserisci il prezzo: ");
                    BigDecimal tvPrezzo = scan.nextBigDecimal();
                    System.out.println("Inserisci l'IVA: ");
                    BigDecimal tvIva = scan.nextBigDecimal();
                    System.out.println("Qaunti pollici è la tv? ");
                    int tvPollici = scan.nextInt();
                    System.out.println("La tv è smart? (y/n)");
                    String tvSmart = scan.nextLine();
                    if (tvSmart.equals("y")) {
                        tvSmart = "è smart";
                    } else {
                        tvSmart = "non è smart";
                    }
                    Televisori prodottoTvScelto = new Televisori(tvName, tvDesc, tvPrezzo, tvIva, tvPollici, tvSmart);
                    cart.add(prodottoTvScelto);
                } else if (tipoProdotto.equals("3")) {
                    System.out.println("Inserisci il nome del prodotto: ");
                    String cuffieName = scan.nextLine();
                    System.out.println("Inserisci la descrizione: ");
                    String cuffieDesc = scan.nextLine();
                    System.out.println("Inserisci il prezzo: ");
                    BigDecimal cuffiePrezzo = scan.nextBigDecimal();
                    System.out.println("Inserisci l'IVA: ");
                    BigDecimal cuffieIva = scan.nextBigDecimal();
                    System.out.println("Che colore sono le cuffie? ");
                    String cuffieColore = scan.nextLine();
                    System.out.println("Le cuffie sono cablate? (y/n)");
                    String cuffieCavo = scan.nextLine();
                    if (cuffieCavo.equals("y")) {
                        cuffieCavo = "sono cablate";
                    } else {
                        cuffieCavo = "sono wireless";
                    }
                    Cuffie prodottoCuffieScelto = new Cuffie(cuffieName, cuffieDesc, cuffiePrezzo, cuffieIva, cuffieColore, cuffieCavo);
                    cart.add(prodottoCuffieScelto);
                }
            } else if (sceltaUtente.equals("n")) {
                System.out.println("Okay!");
                sino = true;
            }
        }
        System.out.println("Bene, ecco la tua lista:");
       for (Prodotto prodotto: cart){
           System.out.println(prodotto);
       }

        scan.close();
    }
}
