package org.example.exeption;

public class GiocoEsistente extends RuntimeException {
    public GiocoEsistente(String message) {
        super(message);
    }
}
