import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class findBBTTest {
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
        void titleTest(){
            check.checkTitle(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/findBBT", "Search Book By ID");
        }
    @Test
        void linksTest(){
            check.checkLinks(baseUrl, driver);
        }
    @Test
        void correctInputOneTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/findBBT", "bookTitle", "This Book Right Here!", "book");
        }
    @Test
        void failInputZeroTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/findBBT", "bookTitle", "", "0");//crashes
        }
    @Test
        void failInputTwoTest() {
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/findBBT", "bookTitle", "Decimation", "deci");

        }
    @Test
        void failInputNegOneTest() {
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/findBBT", "bookTitle", "", "-1");

        }
    @Test
        void failInputLetterMTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/findBBT", "bookTitle", "", "m");
        }
    @Test
        void failInputAtSymbolTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/findBBT", "bookTitle", "", "@");
        }
    @Test
        void failSqlInjectionTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/findBBT", "bookTitle", "", "DELETE FROM book WHERE BID = 1;SELECT * FROM book;1;");

        }
        @Test
        void navbarTest(){
            check.checkNavbar(baseUrl, driver);

        }

    }
