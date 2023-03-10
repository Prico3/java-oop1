package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

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
