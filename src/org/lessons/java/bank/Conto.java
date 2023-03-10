package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

//Nel progetto java-oop-1, org.lessons.java.bank, creare la classe Conto caratterizzata da:
//        - numero di conto
//        - nome del proprietario
//        - saldo
//        Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “servizio” per fare in modo che:
//        - alla creazione di un nuovo conto il saldo sia 0€
//        - Il codice conto sia accessibile solo in lettura, il proprietario sia accessibile in lettura e in scrittura e il saldo sia accessibile solo in lettura
//        - siano presenti un metodo per versare una somma di denaro sul conto e uno per prelevare una somma di denaro dal conto (attenzione: il saldo non può mai diventare negativo)
//        - altri metodi per ritornare le informazioni del conto e il saldo formattato
//        Aggiungere una classe Bank con metodo main, dove chiediamo all’utente il suo nome e generiamo un Conto intestato all’utente con un numero di conto random (da 1 a 1000)
//        Poi chiediamo all’utente cosa vuole fare dando 3 opzioni: versare una somma o prelevare una somma di denaro, oppure uscire. Dopo la scelta dell’utente chiediamo quanti soldi vuole versare o prelevare e proviamo ad effettuare l’operazione sul conto. Se l’operazione non è valida mostriamo un messaggio di errore. Se l’operazione va a buon fine mostriamo il saldo attuale del conto. Il menu continua ad apparire fino a che l’utente sceglie di uscire.

public class Conto {

    private final int numeroDiConto;
    private String nome;
    private String cognome;
    private double saldo;

    //costruttore
    public Conto(String nome, String cognome) {
        this.numeroDiConto = new Random().nextInt(1000) + 1;
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = 0.0;
    }

    //getter e setter

    //numero conto
//    public int getNumeroDiConto() {
//        return numeroDiConto;
//    }

//    public String getNome() {
//        return nome;
//    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public String getCognome() {
//        return cognome;
//    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

//    public double getSaldo() {
//        return saldo;
//    }

    public void versa(double importo) {
        saldo += importo;
    }

    public boolean preleva(double importo) {
        if (saldo - importo >= 0) {
            saldo -= importo;
            return true;
        } else {
            return false;
        }
    }

    public String getInformazioniConto() {
        return "Conto numero: " + numeroDiConto + " Proprietario: " + nome + " " + cognome + " Saldo: " + getSaldoFormattato();
    }

    public String getSaldoFormattato() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(saldo);
    }


}
