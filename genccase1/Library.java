import dao.*;
import controller.*;
import service.AuthorService;
import view.AuthorView;
import view.Runner;

import java.util.Scanner;


public class Library {
    public static void main(String[] args) {
        AuthorDao dao = new AuthorDaoInMemory(AuthorData.getListData());
        Runner view = new AuthorView();
        AuthorService service = new AuthorService(dao);
        AuthorController c = new AuthorController(view, service);
        }
}
