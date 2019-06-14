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

    public Author removAuthor(Author a){return service.remAuthor(a);}
    public HashMap<Author, ArrayList<Book>> getAuthorWBooks(){
        return service.getAuthorWBooks();
    }
    public Set<Author> getAllAuthors(){
        return service.getAllAuthors();
    }
    public Collection<ArrayList<Book>> getAllBooks() {
        return service.getAllBooks();
    }
    public HashMap<Author, ArrayList<Book>> addEntry(String name, String t, int pages, String isbn, String g){
        return service.addEntry(name, t, pages, isbn, g);
    }
}
