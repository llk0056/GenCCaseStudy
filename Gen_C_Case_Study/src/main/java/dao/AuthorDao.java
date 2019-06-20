package dao;

import dto.Author;
import dto.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public interface AuthorDao {
    public HashMap<Author, ArrayList<Book>> getAuthorWBooks();
    public HashMap<Author, ArrayList<Book>> removeListItem(Author a);
    public HashMap<Author, ArrayList<Book>> addEntry(String name, String t, int pages, String isbn, String g);
    public Author getAuthorByName(String name);
    //public getAuthorFromBook(Book b);
    public Set<Author> getAllAuthors();
    public Collection<ArrayList<Book>> getAllBooks();
    //public void addNewAuthor(Author a);
}
