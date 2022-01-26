package com.example;

import java.util.ArrayList;
import java.util.List;

public class root {
    int annoDiInizio;
    aula aula=new aula();
    String classe;
    int numeroFinestre;
    String specializzazione;
    List<studenti>studenti=new ArrayList<>();

    public root() {
    }


    public int getAnnoDiInizio() {
        return this.annoDiInizio;
    }

    public void setAnnoDiInizio(int annoDiInizio) {
        this.annoDiInizio = annoDiInizio;
    }

    public aula getAula() {
        return this.aula;
    }

    public void setAula(aula aula) {
        this.aula = aula;
    }

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNumeroFinestre() {
        return this.numeroFinestre;
    }

    public void setNumeroFinestre(int numeroFinestre) {
        this.numeroFinestre = numeroFinestre;
    }

    public String getSpecializzazione() {
        return this.specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public List<studenti> getStudenti() {
        return this.studenti;
    }

    public void setStudenti(List<studenti> studenti) {
        this.studenti = studenti;
    }
}
