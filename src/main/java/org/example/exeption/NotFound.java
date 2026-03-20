package org.example.exeption;

public class NotFound extends RuntimeException {
    public NotFound(String message) {
        super(message);
    }
}
