package org.lessons.java.shop;

import java.util.Random;

//Nel ProGet java-oop-1, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop.
//        Un prodotto è caratterizzato da:
//        - codice (numero intero)
//        - nome
//        - descrizione
//        - prezzo
//        - iva
//        Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “servizio” per fare in modo che:
//        alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
//        Il codice prodotto sia accessibile solo in lettura
//        Gli altri attributi siano accessibili sia in lettura che in scrittura
//        Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
//        Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
//        Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto
public class Prodotto {

    //campi
    private final int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    //costruttori
    public Prodotto(String nome, String descrizione, double prezzo, int iva){
        this.codice = randomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    //getter setter
    public int getCodice(){
        return this.codice;
    }

    public String getNome() {
        return nome;
    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }
    public String getDescrizione() {
        return descrizione;
    }

//    public void setDescrizione(String descrizione) {
//        this.descrizione = descrizione;
//    }

    public double getPrezzo() {
        return prezzo;
    }

//    public void setPrezzo(double prezzo) {
//        this.prezzo = prezzo;
//    }
    public double getIva() {
        return this.iva;
    }

//    public void setIva(int iva) {
//        this.iva = iva;
//    }


    //METODI

    //genero numero random
    public int randomCode(){
        Random random = new Random();
        return random.nextInt(99999999);

    }

    //calcolo il prezzo con iva

    public double calcoloIva(){
        double prezzoConIva = this.prezzo + (this.prezzo * this.iva / 100);
        return prezzoConIva;
    }

















}
