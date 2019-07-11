package llk0056.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import llk0056.dto.Author;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Inject;

public class AuthorDaoDatabase implements llk0056.dao.AuthorDao {

    JdbcTemplate jdbcTemplate;

    public AuthorDaoDatabase() {

    }

    @Inject
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
    private static String ADD_NEW_AUTHOR
            = "INSERT INTO author (Name) " +
            "VALUES (?)";

    private static String FIND_ALL
            = "SELECT Name, AID "
            + "FROM author";

    private static String FIND_BOOKS_BY_AUTHOR
            = "SELECT Title, Pages, ISBN, Genre " +
            "FROM book " +
            "JOIN author ON AID=BID " +
            "WHERE name LIKE ?";
    private static String FIND_BOOKS_BY_GENRE
            = "SELECT Title, Pages, ISBN, Genre " +
            "FROM book " +
            "WHERE Genre LIKE ?";

    private static String FIND_BOOKS_BY_TITLE
            = "SELECT Title, Pages, ISBN, Genre " +
            "FROM book " +
            "WHERE Title LIKE ?";
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

    /*private static String REMOVE_AUTHOR
            = "DELETE FROM author " +
            "WHERE name = ?";*/
    /* public void remAuthor(String name){
        int p = jdbcTemplate.update(REMOVE_AUTHOR, name);
    }*/

    public llk0056.dto.Author getAuthorById(int id) {
        llk0056.dto.Author p = jdbcTemplate.queryForObject(GET_AUTHOR_BY_ID, new AuthorMapper(), id);
        return p;
    }
    public List<llk0056.dto.Book> findBooksByAuthor(String name) {
        List<llk0056.dto.Book> b = jdbcTemplate.query(FIND_BOOKS_BY_AUTHOR, new BookMapper(), '%' + name + '%');
        return b;
    }
    public List<llk0056.dto.Author> findAll() {//solution for multiple returns
        List<llk0056.dto.Author> p = jdbcTemplate.query(FIND_ALL, new AuthorMapper());
        return p;
    }
    public List<llk0056.dto.Book> findBook() {
        List<llk0056.dto.Book> b = jdbcTemplate.query(FIND_ALL_BOOKS, new BookMapper());
        return b;
    }
    public List<llk0056.dto.Book> getBookById(int id) {
        List<llk0056.dto.Book> b = jdbcTemplate.query(GET_BOOK_BY_ID,  new BookMapper(), id);
        return b;
    }
    public List<llk0056.dto.Book> findBooksByTitle(String title) {
        List<llk0056.dto.Book> b = jdbcTemplate.query(FIND_BOOKS_BY_TITLE,  new BookMapper(), '%' + title + '%');
        return b;
    }
    public List<llk0056.dto.Book> findBooksByGenre(String genre) {
        List<llk0056.dto.Book> b = jdbcTemplate.query(FIND_BOOKS_BY_GENRE,  new BookMapper(), '%' + genre + '%');
        return b;
    }
    public List<llk0056.dto.Author> findAuthor() {
        List<llk0056.dto.Author> p = jdbcTemplate.query(FIND_ALL_AUTHORS, new AuthorMapper());
        return p;
    }
    public List<llk0056.dto.Author> findNumBook(String name){
        List<llk0056.dto.Author> p = jdbcTemplate.query(FIND_NUM_BOOKS,  new AuthorMapper());
        return p;
    }

    public void addAuthor(String name){
        jdbcTemplate.update(ADD_NEW_AUTHOR, name);

    }



    private class AuthorMapper implements RowMapper<llk0056.dto.Author> {

        @Override
        public llk0056.dto.Author mapRow(ResultSet rs, int rowNum) throws SQLException {
            llk0056.dto.Author p = new llk0056.dto.Author();
            p.setName(rs.getString("Name"));
            int bookId = rs.getInt("AID");
            List<llk0056.dto.Book> b = getBookById(bookId);
            p.setBook(b);
            return p;
        }

    }
    private class BookMapper implements RowMapper<llk0056.dto.Book> {

        @Override
        public llk0056.dto.Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            llk0056.dto.Book b = new llk0056.dto.Book();
            b.setTitle(rs.getString("Title"));
            b.setNum_of_pages(rs.getInt("Pages"));
            b.setIsbn(rs.getString("ISBN"));
            b.setGenres(rs.getString("Genre"));
            return b;
        }
    }



}

