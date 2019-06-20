package service;

import dao.AuthorDao;
import dto.Author;
import dto.Book;

import java.util.*;


public class AuthorService {
    AuthorDao dao;

    public AuthorService(AuthorDao dao) {
        this.dao = dao;
    }

    public Author remAuthor(Author a) {
        if (a == null) throw new NullPointerException(a + " is not recognized by this system.");
        else {
            dao.removeListItem(a);
        }
        return a;
    }
    public Set<Author> getAllAuthors(){
        return dao.getAllAuthors();
    }
    public Collection<ArrayList<Book>> getAllBooks() {
        return dao.getAllBooks();
    }
    public HashMap<Author, ArrayList<Book>> getAuthorWBooks(){
        return dao.getAuthorWBooks();
    }
    public HashMap<Author, ArrayList<Book>> addEntry(String name, String t, int p, String i, String g){
        if(name == null) throw new InvalidEntry(name + " is not recognized by this system.");
        else if(t == null) throw new InvalidEntry(t + " is not recognized by this system.");
       //else if(p == nl) throw new InputMismatchException(p + " is not recognized by this system.");
        else if(i == null) throw new InvalidEntry(i + " is not recognized by this system.");
        else if(g == null) throw new InvalidEntry(g + " is not recognized by this system.");
        else{
            dao.addEntry(name,t,p,i,g);
        }
            return dao.getAuthorWBooks();

    }
}
