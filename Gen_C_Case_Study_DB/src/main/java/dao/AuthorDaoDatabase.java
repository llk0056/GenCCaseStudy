package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.*;

public class AuthorDaoDatabase implements AuthorDao {

    JdbcTemplate jdbcTemplate;

    public AuthorDaoDatabase() {

    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //PREPARED STATEMENTS
    private static String GET_AUTHOR_BY_ID
            = "SELECT * FROM author WHERE AID = ? ";

    private static String GET_BOOK_BY_ID
            = "SELECT * "
            + "FROM book "
            + "WHERE BID = ? ";

    private static String FIND_ALL
            = "SELECT Name, Title, Pages, ISBN, Genre "
            + "FROM author "
            + "JOIN book ON AID=BID";

    private static String FIND_BOOKS_BY_AUTHOR
            = "SELECT Title, Pages, ISBN, Genre " +
            "FROM book " +
            "JOIN author ON AID=BID " +
            "WHERE name LIKE '%' || ? || '%' ";
    private static String FIND_BOOKS_BY_GENRE
            = "SELECT Title, Pages, ISBN, Genre " +
            "FROM book " +
            "WHERE Genre LIKE '%' || ? || '%' ";

    private static String FIND_BOOKS_BY_TITLE
            = "SELECT Title, Pages, ISBN, Genre " +
            "FROM book " +
            "WHERE Title LIKE '%' || ? || '%' ";
    private static String FIND_ALL_AUTHORS
            = "SELECT name FROM author";
    private static String FIND_ALL_BOOKS
            = "SELECT Title, Pages, ISBN, Genre FROM book";
    private static String FIND_NUM_BOOKS
            = "SELECT name, COUNT(Title) AS 'number_of_books'" +
            "FROM book " +
            "JOIN author ON AID = BID " +
            "WHERE name LIKE '%' || ? || '%' " +
            "ORDER BY name";
    private static String ADD_NEW_AUTHOR
            = "INSERT INTO author(name)" +
            "VALUES (?,?)";

    public Author getAuthorById(int id) {
        Author p = jdbcTemplate.queryForObject(GET_AUTHOR_BY_ID, new AuthorMapper(), id);
        return p;
    }
    public List<Book> findBooksByAuthor(String name) {
        List<Book> b = jdbcTemplate.query(FIND_BOOKS_BY_AUTHOR, new BookMapper(), name);
        return b;
    }
    public List<Author> findAll() {//solution for multiple returns
        List<Author> p = jdbcTemplate.query(FIND_ALL, new AuthorMapper());
        return p;
    }
    public List<Book> findBook() {
        List<Book> b = jdbcTemplate.query(FIND_ALL_BOOKS, new BookMapper());
        return b;
    }
    public List<Book> getBookById(int id) {
        List<Book> b = jdbcTemplate.query(GET_BOOK_BY_ID,  new BookMapper(), id);
        return b;
    }
    public List<Book> findBooksByTitle(String title) {
        List<Book> b = jdbcTemplate.query(FIND_BOOKS_BY_TITLE,  new BookMapper(), title);
        return b;
    }
    public List<Book> findBooksByGenre(String genre) {
        List<Book> b = jdbcTemplate.query(FIND_BOOKS_BY_GENRE,  new BookMapper(), genre);
        return b;
    }
    public List<Author> findAuthor() {
        List<Author> p = jdbcTemplate.query(FIND_ALL_AUTHORS, new AuthorMapper());
        return p;
    }
    public List<Author> findNumBook(String name){
        List<Author> p = jdbcTemplate.query(FIND_NUM_BOOKS,  new AuthorMapper(), name);
        return p;
    }

    public List<Author> addAuthor(String name){
        List<Author> p = jdbcTemplate.query(ADD_NEW_AUTHOR,  new AuthorMapper(), name);
        return p;
    }

    private class AuthorMapper implements RowMapper<Author> {

        @Override
        public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
            Author p = new Author();
            p.setName(rs.getString("Name"));
            //int bookId = rs.getInt("AID");

            /*Book b = getBookById(bookId);
            p.setBook(b);*/
            return p;
        }

    }
    private class BookMapper implements RowMapper<Book> {

        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            Book b = new Book();
            b.setTitle(rs.getString("Title"));
            b.setNum_of_pages(rs.getInt("Pages"));
            b.setIsbn(rs.getString("ISBN"));
            b.setGenres(rs.getString("Genre"));
            return b;
        }
    }



}

