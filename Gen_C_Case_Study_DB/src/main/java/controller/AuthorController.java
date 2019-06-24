package controller;

import dto.Author;
import dto.Book;
import service.AuthorService;
import view.Runner;

import java.util.*;

public class AuthorController {
    private Runner frontEnd;
    private AuthorService service;

    public AuthorController(Runner frontEnd, AuthorService service) {
        super();
        this.frontEnd = frontEnd;
        this.service = service;
        frontEnd.run(this);
    }

    public List<Book> findBook() {
        return service.findBook();
    }

    public Author getAuthorById(int id) {
        return service.getAuthorById(id);
    }

    public List<Author> findAll() {
        return service.findAll();
    }

    public List<Author> findAuthor() {
        return service.findAuthor();
    }

    public List<Book> getBookById(int id) {
        return service.getBookById(id);
    }

    public List<Book> findBooksByAuthor(String name) {
        return service.findBooksByAuthor(name);
    }

    public List<Book> findBooksByTitle(String title) {
        return service.findBooksByTitle(title);
    }

    public List<Book> findBooksByGenre(String genre) {
        return service.findBooksByGenre(genre);
    }

    public List<Author> findNumBook(String name) { return service.findNumBook(name); }
}
