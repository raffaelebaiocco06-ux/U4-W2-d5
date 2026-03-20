package org.example.esercizio;

import org.example.exeption.ValoreNONvalido;

public abstract class Gioco {
    private int id;
    private String titolo;
    private int annoPubblicazione;
    private double prezzo;

    public Gioco(int id, String titolo, int annoPubblicazione, double prezzo) {
        setId(id);
        setTitolo(titolo);
        setAnnoPubblicazione(annoPubblicazione);
        setPrezzo(prezzo);
    }
//prof ho deciso di cambiare il costruttore perche ho visto che dopo devo usare i setter...cosi non devo riscrivere i controlli due volte
    // l'ho rifatto anche nelle altre classi che cosi mi veniva meglio...era meglio C++ hahaha
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new ValoreNONvalido("ID non valido: deve essere maggiore di 0");
        }
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        if (titolo == null) {
            throw new ValoreNONvalido("Titolo non valido: non può essere vuoto");
        }
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        if (annoPubblicazione <= 0) {
            throw new ValoreNONvalido("Anno di pubblicazione non valido");
        }
        this.annoPubblicazione = annoPubblicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo < 0) {
            throw new ValoreNONvalido("Prezzo non valido: non può essere negativo");
        }
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Gioco{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo +
                '}';
    }
}
