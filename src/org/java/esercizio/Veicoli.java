package org.java.esercizio;

import java.time.LocalDate;

public abstract class Veicoli {
   private  String numeroDiTarga;
    private LocalDate dataImmatricolazione;

  public Veicoli(String numeroDiTarga, LocalDate dataImmatricolazione){
    this.dataImmatricolazione = dataImmatricolazione;
  if(numeroDiTarga.length() > 7){
      throw new  ExceptionInInitializerError ("La targa è troppo lunga");
  }
    this.numeroDiTarga = numeroDiTarga;
  }

    public String getNumeroDiTarga() {
        return numeroDiTarga;
    }

    public LocalDate getDataImmatricolazione() {
        return dataImmatricolazione;
    }



}
