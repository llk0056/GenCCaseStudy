package dao;

import dto.Author;
import dto.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.util.Set;

public class AuthorDaoInMemory implements AuthorDao {
    private HashMap<Author, ArrayList<Book>> authw;

    public AuthorDaoInMemory(HashMap<Author, ArrayList<Book>> auth43) {
        super();
        this.authw = auth43;
    }

    public HashMap<Author, ArrayList<Book>> getAuthorWBooks(){
        return new HashMap<Author, ArrayList<Book>>(authw);
    }

    public HashMap<Author, ArrayList<Book>> removeListItem(Author a){
        authw.remove(a.getName());
        return new HashMap<Author, ArrayList<Book>>(authw);
    }

    public HashMap<Author, ArrayList<Book>> addEntry(String name, String t, int pages, String isbn, String g){
            Author a = new Author(name);
            Book book = new Book(t, pages, isbn, g);
            ArrayList<Book> b = new ArrayList<Book>();
            b.add(book);
            authw.put(a, b);
            return authw;
    }


    public Set<Author> getAllAuthors(){
        return authw.keySet();
    }

    public Collection<ArrayList<Book>> getAllBooks() {
        return authw.values();
    }

    /*public void addNewAuthor(Author a){
        if(authw.keySet().contains(a.getName())) {
        }
        else{

        }
    }*/
   /* public getAuthorFromBook(Book b){
        if(authw.containsValue(b.getTitle()) {
            authw.get();
        }
        else {

        }

    }*/
}
