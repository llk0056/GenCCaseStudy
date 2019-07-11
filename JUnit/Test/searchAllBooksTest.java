import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class searchAllBooksTest {
    private static String baseUrl = "http://localhost:8080/GENC_SERVLETS_war_exploded/";
    private static WebDriver driver;
    private static checkSystem check;

    @BeforeAll
    static void setUpBeforeClass() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        check = new checkSystem();
    }
    @AfterAll
    static void tearDownAfterClass() throws Exception{
        driver.close();
    }
    @BeforeEach
    void setUp() throws Exception{

    }
    @AfterEach
    void tearDown() throws Exception{

    }

        @Test
        void mathTest() {
            int expected = 10;
            int actual = (int)Math.pow(100,.5);
            assertEquals(expected, actual);
            //fail("Not yet implemented");
        }
        @Test
        void navTitleTest(){
        check.checkNavTitle(baseUrl, driver);
        }
        @Test
        void titleTest(){
            check.checkTitle(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAllBooks", "searchAllBooks");
        }
        @Test
        void linksTest(){
            check.checkLinks(baseUrl, driver);
        }

        @Test
        void navbarTest(){
            check.checkNavbar(baseUrl, driver);

        }
        @Test
        void rowOneTest(){
            check.checkListValueByTitle(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAllBooks", "title", "This Book Right Here!", 2, 1);
            check.checkListValueByPageNum(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAllBooks", "num_of_pages", "350", 2, 2);
            check.checkListValueByIsbn(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAllBooks", "name", "9988776665522", 2, 3);
            check.checkListValueByGenre(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAllBooks", "name", "comedy", 2, 4);
        }
        @Test
        void rowSixTest(){
            check.checkListValueByTitle(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAllBooks", "title", "Annihilation", 6, 1);
            check.checkListValueByPageNum(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAllBooks", "num_of_pages", "350", 6, 2);
            check.checkListValueByIsbn(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAllBooks", "isbn", "12314324", 6, 3);
            check.checkListValueByGenre(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAllBooks", "genre", "horror", 6, 4);
        }

    }
