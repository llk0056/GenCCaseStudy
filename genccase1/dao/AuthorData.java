package dao;

import dto.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AuthorData {
    private static Book ihtsbih = new Book("I hope they serve beer in hell", 277, "978-0-8065-2728-4", "Non-fiction");
    private static Book aff = new Book("Assholes finish first", 416, "1-4169-3874-5", "Non-Fiction");
    private static Book asoiaf = new Book("A song of ice and fire", 694, "978-0553103540", "Epic Fantasy");
    private static Book agot = new Book("A game of thrones", 694, "0-553-10354-7", "political novel, epic fantasy");
    private static Book oomc = new Book("Origins of Marvel Comics",240, "978-0785105510", "comic" );
    private static Book etalosl = new Book("Excelsior! The Amazing Life of Stan Lee", 256, "978-0684873053", "comic");


    public static HashMap<Author, ArrayList<Book>> getListData() {
        HashMap <Author, ArrayList<Book>> AuthorBookData = new HashMap<Author, ArrayList<Book>>();
        ArrayList<Book> tucker = new ArrayList<Book>();
        tucker.add(ihtsbih);
        tucker.add(aff);
        ArrayList<Book> george = new ArrayList<Book>();
        george.add(asoiaf);
        george.add(agot);
        ArrayList<Book> stan = new ArrayList<Book>();
        stan.add(oomc);
        stan.add(etalosl);
        Author auth = new Author("Tucker Max");
        Author auth1 = new Author("George R. R. Martin");
        Author auth2 = new Author("Stan Lee");
        AuthorBookData.put(auth, tucker);
        AuthorBookData.put(auth1, george);
        AuthorBookData.put(auth2, stan);

        return AuthorBookData;
    }


}
