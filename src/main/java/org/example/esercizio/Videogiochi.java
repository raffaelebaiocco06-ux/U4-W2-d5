package org.example.esercizio;

public class Videogiochi extends Gioco{
    private String piattaforma;
    private int durataGioco; // in ore
    private Genere genere;

    public Videogiochi(int id, String titolo, int annoPubblicazione, double prezzo,
                      String piattaforma, int durataGioco, Genere genere) {
        super(id, titolo, annoPubblicazione, prezzo);
        this.piattaforma = piattaforma;
        this.durataGioco = durataGioco;
        this.genere = genere;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public int getDurataGioco() {
        return durataGioco;
    }
    public Genere getGenere() {
        return genere;
    }


    //  devo mettere il messaggio di errore
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
