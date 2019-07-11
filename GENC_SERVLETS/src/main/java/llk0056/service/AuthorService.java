package llk0056.service;

import llk0056.dao.AuthorDao;
import llk0056.dto.Author;
import llk0056.dto.Book;

import javax.inject.Inject;
import java.util.*;


public class AuthorService {
    AuthorDao dao;

    @Inject
    public void setDao(AuthorDao dao) {
        this.dao = dao;
    }

    public Author getAuthorById(int id) {
        return dao.getAuthorById(id);
    }

    public List<Author> findAll() {
        return dao.findAll();
    }

    public List<Author> findAuthor() {
        return dao.findAuthor();
    }

    public List<Book> getBookById(int id) {
        return dao.getBookById(id);
    }

    public List<Book> findBooksByAuthor(String name) {
        return dao.findBooksByAuthor(name);
    }

    public List<Book> findBooksByTitle(String title) {
        return dao.findBooksByTitle(title);
    }

    public List<Book> findBooksByGenre(String genre) {
        return dao.findBooksByGenre(genre);
    }

    public List<Book> findBook() {
        return dao.findBook();
    }

    public List<Author> findNumBook(String name) {
        return dao.findNumBook(name);
    }

    public void addAuthor(String name) { dao.addAuthor(name); }

   /* public void remAuthor(String name) {
        dao.remAuthor(name);
    }*/
}
