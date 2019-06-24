package dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import dto.Author;
import dto.Book;

public interface AuthorDao {

    public Author getAuthorById(int id);
    public List<Author> findAll();
    public List<Author> findAuthor();
    public List<Book> findBook();
    public List<Book> getBookById(int id);
    public List<Book> findBooksByAuthor(String name);
    public List<Book> findBooksByTitle(String title);
    public List<Book> findBooksByGenre(String genre);
    public List<Author> findNumBook(String name);



}
