package org.java.esercizio;

import java.time.LocalDate;

public abstract class Veicoli {
    String numeroDiTarga;
    LocalDate dataImmatricolazione;

  public Veicoli(String numeroDiTarga, LocalDate dataImmatricolazione){
    this.dataImmatricolazione = dataImmatricolazione;
    this.numeroDiTarga = this.numeroDiTarga;
  }

    public String getNumeroDiTarga() {
        return numeroDiTarga;
    }

    public LocalDate getDataImmatricolazione() {
        return dataImmatricolazione;
    }



}
