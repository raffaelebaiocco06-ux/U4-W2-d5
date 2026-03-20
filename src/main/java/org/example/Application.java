package org.example;

import org.example.esercizio.Collezione;
import org.example.esercizio.DaTavolo;
import org.example.esercizio.Genere;
import org.example.esercizio.Videogiochi;

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






    }
}
