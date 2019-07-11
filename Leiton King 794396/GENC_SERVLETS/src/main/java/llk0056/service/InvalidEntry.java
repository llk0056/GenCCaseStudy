package service;

public class InvalidEntry extends RuntimeException{
    public InvalidEntry(String message) {
        super(message);
    }

    public InvalidEntry(String message, Throwable cause) {
        super(message, cause);
    }
}
