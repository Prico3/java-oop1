package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci il tuo cognome: ");
        String cognome = scanner.nextLine();

        Conto conto = new Conto( nome, cognome);

        System.out.println("Benvenuto " + nome + " ! Il tuo cc è stato creato.");
        System.out.println(conto.getInformazioniConto());

        int scelta;
        do {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Versare una somma di denaro");
            System.out.println("2. Prelevare una somma di denaro");
            System.out.println("3. Cambiare dati conto");
            System.out.println("4. Uscire");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();

            if (scelta == 1) {
                System.out.print("Inserisci l'importo da versare: ");
                double importo = scanner.nextDouble();
                conto.versa(importo);
                System.out.println("Operazione eseguita con successo! Il saldo attuale del conto è " + conto.getSaldoFormattato() + "€.");
            } else if (scelta == 2) {
                System.out.print("Inserisci l'importo da prelevare: ");
                double importo = scanner.nextDouble();
                boolean esito = conto.preleva(importo);
                if (esito) {
                    System.out.println("Operazione eseguita con successo! Il saldo attuale del conto è " + conto.getSaldoFormattato() + "€.");
                } else {
                    System.out.println("Operazione non consentita. Il saldo attuale del conto è " + conto.getSaldoFormattato() + "€.");
                }

            } else if (scelta == 3){
                System.out.println("Stai per cambiare i tuoi dati anagrafici del conto");
                System.out.println(conto.getInformazioniConto());
                System.out.print("Inserisci il nuovo nome: ");
                scanner.nextLine();
                String newName = scanner.nextLine();
                conto.setNome(newName);
                System.out.print("Inserisci il nuovo cognome: ");
                String newCognome = scanner.nextLine();
                conto.setCognome(newCognome);
                System.out.println("Dati cambiato correttamente. Grazie ed ecco i nuovi dati: " + conto.getInformazioniConto());

            }

        } while (scelta != 4);

        System.out.println("Arrivederci");
    }
}
