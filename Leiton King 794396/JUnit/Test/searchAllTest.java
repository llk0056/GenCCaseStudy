import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class searchAllTest {
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
            check.checkTitle(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAll", "List All");
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
        check.checkListValueByName(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAll", "name", "Leroy Ellis", 2);
        check.checkListValueByTitle(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAll", "title", "This Book Right Here!", 2);
        check.checkListValueByPageNum(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAll", "num_of_pages", "350", 2);
        check.checkListValueByIsbn(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAll", "isbn", "9988776665522", 2);
        check.checkListValueByGenre(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAll", "genre", "comedy", 2);
        }
        @Test
        void rowSixTest(){
            check.checkListValueByName(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAll", "name", "Alfred", 6);
            check.checkListValueByTitle(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAll", "title", "Annihilation", 6);
            check.checkListValueByPageNum(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAll", "num_of_pages", "350", 6);
            check.checkListValueByIsbn(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAll", "isbn", "12314324", 6);
            check.checkListValueByGenre(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/searchAll", "genre", "horror", 6);
        }


}
