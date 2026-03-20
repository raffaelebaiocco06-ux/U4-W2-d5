package org.example.esercizio;

import java.util.*;
import org.example.exeption.GiocoEsistente;
import org.example.exeption.NotFound;

public class Collezione {
  private List<Gioco> giochi;

    public Collezione() {
        giochi = new ArrayList<>();
    }
    //vedo se ce gia
    public boolean aggiungiG(Gioco gioco){
        boolean presente= giochi.stream().anyMatch(g-> g.getId() == gioco.getId());
        if(presente){
            throw new GiocoEsistente("Errore: Il gioco con ID " + gioco.getId() + " è presente ");
        }else{

            return giochi.add(gioco);
        }
    }
    public Gioco ricercaperid(int id){
        return giochi.stream().filter(g-> g.getId() == id).findAny().orElseThrow(()-> new NotFound("Gioco con ID " + id + " non trovato"));
    }
    public List ricercaperprezzo(double prezzoinserito){
        return giochi.stream().filter(g-> g.getPrezzo() < prezzoinserito).toList();
    }
    public List ricercaperNgiocatori(int numerogiocatori){
        //mettere errore
        return giochi.stream().filter(g-> g instanceof DaTavolo).filter(t-> ((DaTavolo) t).getNumeroGiocatori()== numerogiocatori).toList();
    }
    public boolean rimuoviperid(int id){
        if(giochi.removeIf(g-> g.getId() == id)) {
            throw new NotFound("Impossibile rimuovere: gioco con ID " + id + " non trovato");
        }
        return true;
    }

    public boolean aggiornaid(int id, Gioco ng){
        for (int i = 0; i < giochi.size(); i++) {
            if (giochi.get(i).getId() == id) {
                giochi.set(i, ng);
                return true;
            }
        }
        throw new NotFound("Impossibile aggiornare: gioco con ID " + id + " non trovato");

    }


    //stampa tutto
    public int contaVideogiochi() {
        return (int) giochi.stream()
                .filter(g -> g instanceof Videogiochi)
                .count();
    }


    public int contaGiochiDaTavolo() {
        return (int) giochi.stream()
                .filter(g -> g instanceof DaTavolo)
                .count();
    }


    //da rifare
    public Gioco prezzomassimo() {
        return giochi.stream()
                .max((g1, g2) -> Double.compare(g1.getPrezzo(), g2.getPrezzo()))
                .orElse(null);
    }

    public double mediaprezzi() {
        return giochi.stream()
                .mapToDouble(Gioco::getPrezzo)
                .average()
                .orElse(0.0);
    }
    public void stampastatistiche(){

        System.out.println("Numero videogiochi: " + contaVideogiochi());
        System.out.println("Numero giochi da tavolo: " + contaGiochiDaTavolo());
        System.out.println("Gioco con prezzo più alto: " + prezzomassimo());
        System.out.println("Media prezzi: " + mediaprezzi());

    }


}
