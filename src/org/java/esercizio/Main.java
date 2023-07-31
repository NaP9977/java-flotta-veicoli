//Si vuole progettare un’applicazione in grado di gestire una flotta di veicoli. :macchina::moto_da_corsa:
//Descrizione:
//Hai ricevuto l’incarico di sviluppare un’applicazione Java per la gestione di una flotta di veicoli.
//Ogni veicolo nella flotta può essere di due tipi: automobile o motocicletta.
//Ogni veicolo ha un numero di targa univoco e un anno di immatricolazione.
//Le automobili hanno un campo per indicare il numero di porte, mentre le
// motociclette hanno un campo per indicare se sono dotate di cavalletto o meno.
//Deve essere possibile visualizzare tutte le informazioni di ciascun tipo di veicolo.
//Creare la gerarchia di classi necessarie e una classe GestoreFlotta che conterrà una lista di veicoli.
//La classe GestoreFlotta deve permettere di:
//aggiungere nuovi veicoli alla flotta
//contare quanti veicoli ci sono di un determinato tipo (automobile o motocicletta)
//trovare un veicolo specifico tramite il numero di targa
//Aggiungere un’altra classe Main, con il metodo main nel quale viene creata un’istanza di
// GestoreFlotta e ne vengono testati tutti i metodi. Può essere fatto implementando un menu
// interattivo usando lo Scanner oppure impostando direttamente nel codice i dati con cui costruire i vari
// oggetti.


package org.java.esercizio;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Scrivi il numero di targa");
        String numeroTarga = scan.nextLine();

        System.out.println("Scrivi la data di immatricolazione(AAAA-MM-DD)");
        LocalDate dataImmatricolazione = LocalDate.parse(scan.nextLine());
        System.out.println("Scrivi quante porte ha");
        int numeroPorte = scan.nextInt();
        Automobile automobile = new Automobile(numeroTarga, dataImmatricolazione, numeroPorte);
        System.out.print("la motocicletta ha il cavalletto?");
        boolean risposta = scan.nextBoolean();
        Motocicletta motocicletta = new Motocicletta(numeroTarga, dataImmatricolazione, risposta);
        GestoreFlotta gestoreFlotta = new GestoreFlotta();
        gestoreFlotta.CreazioneLista(automobile);
        gestoreFlotta.CreazioneLista(motocicletta);

        int numAuto = gestoreFlotta.contaVeicolo(Automobile.class);
        int numMoto = gestoreFlotta.contaVeicolo(Motocicletta.class);
        System.out.println("Le auto sono " + numAuto);
        System.out.println("Le moto sono " + numMoto);

        System.out.println("inserisci la targa da ricercare");
        String TargaDaCercare = scan.nextLine();
        Veicoli veicolo = gestoreFlotta.TrovaVeicolo(TargaDaCercare);

        if (veicolo != null) {
            System.out.print("Il veicolo è" + gestoreFlotta.getClass().getSimpleName());
        } else {
            System.out.println("Veicolo non trovato");
        }




    }
}