

import com.gfg32.MyCalc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCalcTest {

    MyCalc calc = new MyCalc();

    @Test
    void testSum() {
        assertEquals(17, calc.sum(10, 7));
    }

    @Test
    void testDiff() {
        assertEquals(3, calc.diff(10, 7));
    }

    @Test
    void testMul() {
        assertEquals(70, calc.mul(10, 7));
    }

    @Test
    void testDiv() {
        assertEquals(2, calc.div(10, 5));
    }

    @Test
    void testMod() {
        assertEquals(0, calc.mod(10, 5));
    }

    @Test
    void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> calc.div(10, 0));
    }

    @Test
    void testModByZero() {
        assertThrows(ArithmeticException.class, () -> calc.mod(10, 0));
    }
}
