import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class findTest {
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
            check.checkTitle(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/find", "Find Books By Author");
        }
    @Test
        void linksTest(){
            check.checkLinks(baseUrl, driver);
        }
    @Test
        void correctInputOneTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/find", "aName", "This Book Right Here!", "Leroy");
        }
    @Test
    void correctInputTwoTest(){
        check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/find", "aName", "Decimation", "Isa");
    }
    @Test
    void correctInputThreeTest(){
        check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/find", "aName", "Annihilation", "Alfred");
    }
    @Test
        void failInputZeroTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/find", "aName", "", "0");//crashes
        }
    @Test
        void failInputTwoTest() {
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/find", "aName", "Decimation", "Isa");

        }
    @Test
        void failInputNegOneTest() {
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/find", "aName", "", "-1");

        }
    @Test
        void failInputLetterMTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/find", "aName", "", "m");
        }
    @Test
        void failInputAtSymbolTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/find", "aName", "", "@");
        }
    @Test
        void failSqlInjectionTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/find", "aName", "", "DELETE FROM book WHERE BID = 1;SELECT * FROM book;1;");

        }
        @Test
        void navbarTest(){
            check.checkNavbar(baseUrl, driver);

        }

    }
