package llk0056.dto;


import javax.validation.constraints.Min;
import java.util.List;

public class Author {
    private String name;
    private List<Book> book;
    @Min(value = 1, message = "ID number must be greater than 1")
    private int id;

    public Author(){
        super();
    }

    public Author(String name) {
        super();
        this.name = name;
    }

    public Author(String name, List<Book> book, int id) {
        this.name = name;
        this.book = book;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nAuthor{" +
                "name='" + name + '\'' +
                '}';
    }
}
