package dto;


public class Author {
    private String name;

    public Author(){
        super();
    }

    public Author(String name) {
        super();
        this.name = name;
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
