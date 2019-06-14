package dto;

public class Book {
    private String title;
    private int num_of_pages;
    private String isbn;
    private String genres;

    public Book(){
        super();
    }

    public Book(String title, int num_of_pages, String isbn, String genres) {
        super();
        this.title = title;
        this.num_of_pages = num_of_pages;
        this.isbn = isbn;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNum_of_pages() {
        return num_of_pages;
    }

    public void setNum_of_pages(int num_of_pages) {
        this.num_of_pages = num_of_pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", num_of_pages=" + num_of_pages +
                ", isbn='" + isbn + '\'' +
                ", genres='" + genres + '\'' +
                '}';
    }
}
