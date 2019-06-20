package dto;


public class Author {
    private String name;
    private Book book;

    public Author(){
        super();
    }

    public Author(String name) {
        super();
        this.name = name;
    }

    public Author(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
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
