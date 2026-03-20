package org.example.esercizio;

public class DaTavolo extends Gioco{
    private int numeroGiocatori; // da 2 a 10
    private int durataMediaPartita; // in minuti

    public DaTavolo(int id, String titolo, int annoPubblicazione, double prezzo, int numeroGiocatori, int durataMediaPartita) {
        super(id, titolo, annoPubblicazione, prezzo);
        this.numeroGiocatori=numeroGiocatori;
        this.durataMediaPartita=durataMediaPartita;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }
    public int getDurataMediaPartita() {
        return durataMediaPartita;
    }



    //  devo mettere il messaggio di errore
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
