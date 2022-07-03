
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {
    @Test
    void checkAdd(){
        MyCalculator c = new MyCalculator();
        double result = c.add(4, 10);
        assertEquals(14, result);
    }

    @Test
    void checkMult(){
        MyCalculator c = new MyCalculator();
        assertEquals(15, c.mult(3, 5));
        assertEquals(4.6, c.mult(2.3, 2));
    }

    @Test
    void checkSub(){
        MyCalculator c = new MyCalculator();
        assertEquals(-15, c.sub(8, 23));
    }

    @Test
    void checkDiv1() throws Exception {
        MyCalculator c = new MyCalculator();
        assertEquals(8, c.div(16, 2));
    }

    @Test
    void checkDiv2() throws Exception {
        MyCalculator c = new MyCalculator();
        assertThrows(Exception.class , () -> c.div(5, 0));
    }


}