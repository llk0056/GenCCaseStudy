import org.junit.jupiter.api.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
public class exampleParameterizedTest {
        @BeforeAll
        static void setUpBeforeClass() throws Exception{

        }
        @AfterAll
        static void tearDownAfterClass() throws Exception{

        }
        @BeforeEach
        void setUp() throws Exception{

        }
        @AfterEach
        void tearDown() throws Exception{

        }
        @Test
        void test() {
            int expected = 10;
            int actual = (int)Math.pow(100,.5);
            assertEquals(expected, actual);
            //fail("Not yet implemented");
        }
//        @exampleParameterizedTest
//        @ValueSource(strings = {"Red", "Green", "Penk"})
//        void testHasE(String val){
//                assertTrue(val.contains("e"));
//        }
//        @exampleParameterizedTest
//        @CsvSource({ "2,4","-3,9", "4,16" })
//        void testPow2(int base, int result) {
//                assertEquals(Math.pow(base, 2), result);
//        }

}
