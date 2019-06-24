package view;

import controller.AuthorController;
import service.InvalidEntry;

import java.util.ArrayList;
import java.util.Scanner;

public class AuthorView implements Runner {
    AuthorController controller;

    public void run(AuthorController c){
        controller = c;
        while(true) {
            int choice;
            System.out.println("Enter 1 to list all authors" +
                    "\nEnter 2 to list all books" +
                    "\nEnter 3 to list all authors with books" +
                    "\n Enter 4 to find Author by ID" +
                    "\nEnter 5 to find Book by ID" +
                    "\nEnter 6 to find Books By Author" +
                    "\nEnter 7 to find Books By Title" +
                    "\nEnter 8 to find Books By Genre" +
                    "\nEnter 9 to Add Author" +
                    "\nEnter 10 to Remove Author" +
                    "\nEnter 11 to Exit");

                Scanner option = new Scanner(System.in);
                while(!option.hasNextInt()) {
                    System.out.println("Invalid Input\nEnter a valid numerical value");
                    option.next();
                }
                choice = option.nextInt();

            Scanner scan = new Scanner(System.in);
            switch (choice) {
                case 1:
                    System.out.println(c.findAuthor());
                    break;
                case 2:
                    System.out.println(c.findBook());
                    break;
                case 3:
                    System.out.println(c.findAll());
                    break;
                case 4:
                    int ID;
                    System.out.println("Enter The Author's ID");
                        ID = scan.nextInt();
                        System.out.println(c.getAuthorById(ID));
                    break;
                case 5:
                    int BID;
                    System.out.println("Enter The Book's ID");
                    BID = scan.nextInt();
                    System.out.println(c.getBookById(BID));
                    break;
                case 6:
                    String author;
                    System.out.println("Enter The Author's name");
                    author = scan.next();
                    System.out.println(c.findBooksByAuthor(author));
                    break;
                case 7:
                    String title;
                    System.out.println("Enter the title of the book");
                    title = scan.next();
                    System.out.println(c.findBooksByTitle(title));
                    break;
                case 8:
                    String genre;
                    System.out.println("Enter the desired genre");
                    genre = scan.next();
                    System.out.println(c.findBooksByGenre(genre));
                    break;
                case 9:
                    String name;
                    System.out.println("Enter the Author's name");
                    name = scan.next();
                    c.addAuthor(name);
                    System.out.println(c.findAuthor());
                    break;
                case 10:
                    String name1;
                    System.out.println("Enter the Author's name");
                    name1 = scan.next();
                    c.remAuthor(name1);
                    System.out.println(c.findAuthor());
                    break;
                case 11:
                    System.out.printf("Goodbye");
                    System.exit(0);
            }
        }

    }

}
