package org.example.esercizio;

import org.example.exeption.ValoreNONvalido;

public class DaTavolo extends Gioco {
    private int numeroGiocatori;
    private int durataMediaPartita;

    public DaTavolo(int id, String titolo, int annoPubblicazione, double prezzo,
                    int numeroGiocatori, int durataMediaPartita) {
        super(id, titolo, annoPubblicazione, prezzo);
        setNumeroGiocatori(numeroGiocatori);
        setDurataMediaPartita(durataMediaPartita);
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public void setNumeroGiocatori(int numeroGiocatori) {
        if (numeroGiocatori < 2 || numeroGiocatori > 10) {
            throw new ValoreNONvalido("Numero giocatori non valido (2-10)");
        }
        this.numeroGiocatori = numeroGiocatori;
    }

    public int getDurataMediaPartita() {
        return durataMediaPartita;
    }

    public void setDurataMediaPartita(int durataMediaPartita) {
        if (durataMediaPartita <= 0) {
            throw new ValoreNONvalido("Durata partita non valida");
        }
        this.durataMediaPartita = durataMediaPartita;
    }

    @Override
    public String toString() {
        return "GiocoDaTavolo{" +
                "id=" + getId() +
                ", titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getAnnoPubblicazione() +
                ", prezzo=" + getPrezzo() +
                ", numeroGiocatori=" + numeroGiocatori +
                ", durataMediaPartita=" + durataMediaPartita +
                '}';
    }
}
