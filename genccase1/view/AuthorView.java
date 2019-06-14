package view;

import controller.AuthorController;

import java.util.ArrayList;
import java.util.Scanner;

public class AuthorView implements Runner {
    AuthorController controller;

    public void run(AuthorController c){
        while(true) {
            int choice;
            System.out.println("Enter 1 to list all authors" + "\nEnter 2 to list all books" + "\nEnter 3 to list all authors with books" + "\n Enter 4 to add entry" + "\nEnter 5 to remove an author" + "\nEnter 6 to Exit");
            Scanner option = new Scanner(System.in);
            choice = option.nextInt();
            if (choice == 5) {

            }
            switch (choice) {
                case 1:
                    System.out.println(c.getAllAuthors());
                    break;
                case 2:
                    System.out.println(c.getAllBooks());
                    break;
                case 3:
                    System.out.println(c.getAuthorWBooks());
                    break;
                case 4:
                    String nm, title, genre, isbn;
                    int pagenum;
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter the Author's name");
                    nm = scan.next();
                    System.out.println("Enter the Book Title");
                    title = scan.next();
                    System.out.println("Enter the number of pages in the book");
                    pagenum = scan.nextInt();
                    System.out.println("Enter the book's ISBN number");
                    isbn = scan.next();
                    System.out.println("Enter the book's genre");
                    genre = scan.next();
                    c.addEntry(nm, title, pagenum, isbn, genre);
                    break;
                case 5:
                    break;
                case 6:
                    System.out.printf("Goodbye");
                    System.exit(0);
                    break;
            }
        }

    }

}
