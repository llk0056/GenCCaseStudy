package llk0056.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import llk0056.dto.Book;
import llk0056.dto.Author;

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
    public void addAuthor(String name);
    public void remAuthor(String name);



}
