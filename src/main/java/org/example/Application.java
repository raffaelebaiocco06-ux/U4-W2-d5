package org.example;

import org.example.esercizio.*;

import java.util.*;


public class Application {

    public static void main(String[] args) {

        Collezione collezione =new Collezione();
        //---------------------------------
        Videogiochi v1 = new Videogiochi(1, "FIFA 24", 2024, 59.99, "PS5", 40, Genere.SPORT);
        Videogiochi v2 = new Videogiochi(2, "Elden Ring", 2022, 69.99, "PC", 80, Genere.RPG);
        DaTavolo d1 = new DaTavolo(3, "Monopoly", 1935, 29.99, 4, 90);
        DaTavolo d2 = new DaTavolo(4, "Risiko", 1957, 34.99, 6, 120);
        //---------------------------------
        collezione.aggiungiG(v1);
        collezione.aggiungiG(v2);
        collezione.aggiungiG(d1);
        collezione.aggiungiG(d2);
        //--------------------------------- da qua vado con l utente

                   Scanner scanner=new Scanner(System.in);
                   int scelta;
                   do{
                       System.out.println(" MENU COLLEZIONE GIOCHI ");
                       System.out.println("1. Aggiungi videogioco");
                       System.out.println("2. Aggiungi gioco da tavolo");
                       System.out.println("3. Cerca per ID");
                       System.out.println("4. Cerca per prezzo");
                       System.out.println("5. Cerca per numero giocatori");
                       System.out.println("6. Rimuovi per ID");
                       System.out.println("7. Aggiorna gioco");
                       System.out.println("8. Stampa statistiche");
                       System.out.println("0. Esci");
                       System.out.print("Scelta: ");

                       scelta = Integer.parseInt(scanner.nextLine());
                       switch (scelta) {
                           case 1:
                               try{
                                   System.out.print("ID: ");
                                   int id = Integer.parseInt(scanner.nextLine());

                                   System.out.print("Titolo: ");
                                   String titolo = scanner.nextLine();

                                   System.out.print("Anno pubblicazione: ");
                                   int anno = Integer.parseInt(scanner.nextLine());

                                   System.out.print("Prezzo: ");
                                   double prezzo = Double.parseDouble(scanner.nextLine());

                                   System.out.print("Piattaforma: ");
                                   String piattaforma = scanner.nextLine();

                                   System.out.print("Durata gioco (ore): ");
                                   int durata = Integer.parseInt(scanner.nextLine());

                                   System.out.println("Scegli genere:");
                                   for (Genere g : Genere.values()) {
                                       System.out.println("  " + g);
                                   }
                                   System.out.print("Genere: ");
                                   Genere genere = Genere.valueOf(scanner.nextLine().toUpperCase());

                                   Videogiochi v = new Videogiochi(id, titolo, anno, prezzo, piattaforma, durata, genere);

                                   if (collezione.aggiungiG(v)) {
                                       System.out.println("Videogioco aggiunto.");
                                   } else {
                                       System.out.println("Errore: ID già presente.");
                                   }


                               }catch(Exception e){
                                   System.out.println("Errore: " + e.getMessage());
                               }
                               break;
                           case 2:
                               try{

                                   System.out.print("ID: ");
                                   int id = Integer.parseInt(scanner.nextLine());

                                   System.out.print("Titolo: ");
                                   String titolo = scanner.nextLine();

                                   System.out.print("Anno pubblicazione: ");
                                   int anno = Integer.parseInt(scanner.nextLine());

                                   System.out.print("Prezzo: ");
                                   double prezzo = Double.parseDouble(scanner.nextLine());

                                   System.out.print("Numero di giocatori: ");
                                   int numeroGiocatori = Integer.parseInt(scanner.nextLine());

                                   System.out.print("Durata media di una partita: ");
                                   int durataMedia = Integer.parseInt(scanner.nextLine());
                                   DaTavolo d = new DaTavolo(id, titolo, anno, prezzo, numeroGiocatori, durataMedia);
                                   if(collezione.aggiungiG(d)){
                                       System.out.println("Videogioco aggiunto.");
                                   } else {
                                       System.out.println("Errore: ID già presente.");
                                   }

                               }catch(Exception e){
                                   System.out.println("Errore: " + e.getMessage());
                               }
                               break;
                           case 3:
                               try{ System.out.print("Inserisci ID da cercare: ");
                                   int id = Integer.parseInt(scanner.nextLine());
                                   Gioco eccolo = collezione.ricercaperid(id);
                                   if(eccolo != null){
                                       System.out.println("Gioco trovato:");
                                       System.out.println(eccolo);
                                   }else {
                                       System.out.println("Nessun gioco trovato ");

                                   }
                               } catch(Exception e){
                                   System.out.println("Errore: " + e.getMessage());
                               }
                               break;
                           case 4:
                               try{System.out.print("Inserisci prezzo massimo: ");
                                   double prezzo = Double.parseDouble(scanner.nextLine());

                                   List<Gioco> listaPrezzo = collezione.ricercaperprezzo(prezzo);

                                   if (listaPrezzo.isEmpty()) {
                                       System.out.println("Nessun gioco trovato.");
                                   } else {
                                       listaPrezzo.forEach(System.out::println);
                                   }}catch(Exception e){
                                   System.out.println("Errore: " + e.getMessage());
                               }
                               break;
                           case 5:
                               try{ System.out.print("Inserisci numero giocatori: ");
                                   int n = Integer.parseInt(scanner.nextLine());

                                   List<DaTavolo> listaGiocatori = collezione.ricercaperNgiocatori(n);

                                   if (listaGiocatori.isEmpty()) {
                                       System.out.println("Nessun gioco da tavolo trovato.");
                                   } else {
                                       listaGiocatori.forEach(System.out::println);
                                   }}catch(Exception e){
                                   System.out.println("Errore: " + e.getMessage());
                               }
                               break;
                           case 6:
                               try{ System.out.print("Inserisci ID da rimuovere: ");
                                   int id = Integer.parseInt(scanner.nextLine());
                                   boolean eccolo = collezione.rimuoviperid(id);
                                   if(eccolo){
                                       System.out.println("Gioco rimosso");

                                   }else {
                                       System.out.println("Nessun gioco trovato ");

                                   }

                               }catch(Exception e){
                                   System.out.println("Errore: " + e.getMessage());
                               }
                               break;
                           case 7:
                               try{
                                   System.out.print("Inserisci ID del gioco da aggiornare: ");
                                   int idVecchio = Integer.parseInt(scanner.nextLine());

                                   System.out.println("Che tipo di gioco vuoi inserire al posto del vecchio?");
                                   System.out.println("1. Videogioco");
                                   System.out.println("2. Gioco da tavolo");
                                   System.out.print("Scelta: ");
                                   int tipo = Integer.parseInt(scanner.nextLine());

                                   Gioco nuovoGioco = null;

                                   if (tipo == 1) {
                                       System.out.print("Nuovo ID: ");
                                       int id = Integer.parseInt(scanner.nextLine());

                                       System.out.print("Titolo: ");
                                       String titolo = scanner.nextLine();

                                       System.out.print("Anno pubblicazione: ");
                                       int anno = Integer.parseInt(scanner.nextLine());

                                       System.out.print("Prezzo: ");
                                       double prezzo = Double.parseDouble(scanner.nextLine());

                                       System.out.print("Piattaforma: ");
                                       String piattaforma = scanner.nextLine();

                                       System.out.print("Durata gioco (ore): ");
                                       int durata = Integer.parseInt(scanner.nextLine());

                                       System.out.println("Scegli genere:");
                                       for (Genere g : Genere.values()) {
                                           System.out.println("- " + g);
                                       }
                                       System.out.print("Genere: ");
                                       Genere genere = Genere.valueOf(scanner.nextLine().toUpperCase());

                                       nuovoGioco = new Videogiochi(id, titolo, anno, prezzo, piattaforma, durata, genere);

                                   } else if (tipo == 2) {
                                       System.out.print("Nuovo ID: ");
                                       int id = Integer.parseInt(scanner.nextLine());

                                       System.out.print("Titolo: ");
                                       String titolo = scanner.nextLine();

                                       System.out.print("Anno pubblicazione: ");
                                       int anno = Integer.parseInt(scanner.nextLine());

                                       System.out.print("Prezzo: ");
                                       double prezzo = Double.parseDouble(scanner.nextLine());

                                       System.out.print("Numero giocatori: ");
                                       int numeroGiocatori = Integer.parseInt(scanner.nextLine());

                                       System.out.print("Durata media partita (minuti): ");
                                       int durataMedia = Integer.parseInt(scanner.nextLine());

                                       nuovoGioco = new DaTavolo(id, titolo, anno, prezzo, numeroGiocatori, durataMedia);
                                   }

                                   if (nuovoGioco != null && collezione.aggiornaid(idVecchio, nuovoGioco)) {
                                       System.out.println("Gioco aggiornato.");
                                   } else {
                                       System.out.println("Aggiornamento non riuscito.");
                                   }

                               }catch(Exception e){
                                   System.out.println("Errore: " + e.getMessage());
                               }
                               break;
                           case 8:
                               collezione.stampastatistiche();
                               break;
                           default:
                               System.out.println("scelta < 0 o scelta > 8");
                       }

                   }while(scelta!=0);
                 scanner.close();



    }
}
