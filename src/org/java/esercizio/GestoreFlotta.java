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
//BONUS 1: non deve essere possibile aggiungere 2 veicoli con la stessa targa; in questo caso il sistema deve restituire un messaggio di errore
//BONUS 2: ragionare sulla classe veicolo: è necessario e ha senso che venga istanziata oppure potrebbe essere astratta?


package org.java.esercizio;

import java.util.ArrayList;

public class GestoreFlotta {
    private ArrayList <Veicoli> veicoli;

    public GestoreFlotta(){
        this.veicoli = new ArrayList<Veicoli>();
    }

    void CreazioneLista(Veicoli veicolo){
        veicoli.add(veicolo);
    }

    public int contaVeicolo( Class < ? extends Veicoli> tipologiaVeicoli ){
       int contatore = 0;

        for(Veicoli veicolo : veicoli) {
            if (tipologiaVeicoli.isInstance(veicolo))
        contatore++;
        }
        return contatore;
    }


    public Veicoli TrovaVeicolo(String numeroDiTarga) {
        for (Veicoli veicolo : veicoli) {
            if (veicolo.getNumeroDiTarga().equals(numeroDiTarga)) {
                return veicolo;
            }
        }

            return null;

    }
}




