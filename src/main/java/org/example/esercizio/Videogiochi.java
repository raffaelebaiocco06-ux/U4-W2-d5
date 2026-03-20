package org.example.esercizio;

import org.example.exeption.ValoreNONvalido;

public class Videogiochi extends Gioco {
    private String piattaforma;
    private int durataGioco;
    private Genere genere;

    public Videogiochi(int id, String titolo, int annoPubblicazione, double prezzo,
                       String piattaforma, int durataGioco, Genere genere) {
        super(id, titolo, annoPubblicazione, prezzo);
        setPiattaforma(piattaforma);
        setDurataGioco(durataGioco);
        setGenere(genere);
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        if (piattaforma == null || piattaforma.isBlank()) {
            throw new ValoreNONvalido("Piattaforma non valida");
        }
        this.piattaforma = piattaforma;
    }

    public int getDurataGioco() {
        return durataGioco;
    }

    public void setDurataGioco(int durataGioco) {
        if (durataGioco < 0) {
            throw new ValoreNONvalido("Durata gioco non valida");
        }
        this.durataGioco = durataGioco;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        if (genere == null) {
            throw new ValoreNONvalido("Genere non valido");
        }
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Videogioco{" +
                "id=" + getId() +
                ", titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getAnnoPubblicazione() +
                ", prezzo=" + getPrezzo() +
                ", piattaforma='" + piattaforma + '\'' +
                ", durataGioco=" + durataGioco +
                ", genere=" + genere +
                '}';
    }
}
