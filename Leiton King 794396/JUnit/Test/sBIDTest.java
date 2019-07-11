import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;


class sBIDTest {
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
            check.checkTitle(driver, "http://localhost:8080/GENC_SERVLETS_war_exploded/sBID", "Search Book By ID");
        }
        @Test
        void linksTest(){
            check.checkLinks(baseUrl, driver);
        }
        @Test
        void correctInputOneTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/sBID", "bid", "This Book Right Here!", "1");
        }
        @Test
        void correctInputTwoTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/sBID", "bid", "Decimation", "2");
        }
        @Test
        void correctInputFourTest(){
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/sBID", "bid", "Annihilation", "4");
        }

    @Test
        void failInputZeroTest(){//fail expected
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/sBID", "bid", "This Book Right Here!", "0");//crashes
        }
    @Test
        void failInputTwoTest() {//fail expected
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/sBID", "bid", "This Book Right Here!", "2");

        }
    @Test
        void failInputNegOneTest() {//fail expected
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/sBID", "bid", "This Book Right Here!", "-1");

        }
    @Test
        void failInputLetterMTest(){//fail expected
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/sBID", "bid", "This Book Right Here!", "m");
        }
    @Test
        void failInputAtSymbolTest(){//fail expected
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/sBID", "bid", "This Book Right Here!", "@");
        }
    @Test
        void failSqlInjectionTest(){//fail expected
            check.checkInputValue(driver,"http://localhost:8080/GENC_SERVLETS_war_exploded/sBID", "bid", "This Book Right Here!", "DELETE FROM book WHERE BID = 1;SELECT * FROM book;1;");

        }
        @Test
        void navbarTest(){
            check.checkNavbar(baseUrl, driver);

        }

    }
