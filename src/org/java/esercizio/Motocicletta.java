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

public class Motocicletta extends Veicoli {
    private boolean cavalletto;

    public Motocicletta(String numeroDiTarga, LocalDate dataImmatricolazione) {
        super(numeroDiTarga, dataImmatricolazione);
        this.cavalletto = cavalletto;
    }

    @Override
    public String toString() {
        if (cavalletto)
            return "si";

        else {
            return "no";
        }
    }
}
