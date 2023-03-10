package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("Iphone", "Grosso", 1000, 22);
        System.out.println("Codice prodotto: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo senza iva: " + prodotto.getPrezzo());
        System.out.println("Iva: " + prodotto.getIva());
        System.out.println("Prezzo con iva: " + prodotto.calcoloIva());
    }
}
