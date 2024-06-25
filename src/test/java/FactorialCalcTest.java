import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialCalcTest {

    @Test
    public void factorialTestOne() {
        FactorialCalc factorialCalc = new FactorialCalc();
        assertEquals(BigInteger.valueOf(1), factorialCalc.calculate(0));
    }

    @Test
    public void factorialTestTwo() {
        FactorialCalc factorialCalc = new FactorialCalc();
        assertEquals(BigInteger.valueOf(1), factorialCalc.calculate(1));
    }

    @Test
    public void factorialTestThree() {
        FactorialCalc factorialCalc = new FactorialCalc();
        assertEquals(BigInteger.valueOf(2), factorialCalc.calculate(2));
    }

    @Test
    public void factorialTestFour() {
        FactorialCalc factorialCalc = new FactorialCalc();
        assertEquals(BigInteger.valueOf(5040), factorialCalc.calculate(7));
    }

    @Test
    public void factorialTestFive() {
        FactorialCalc factorialCalc = new FactorialCalc();
        assertThrows(FactorialDataException.class, () -> factorialCalc.calculate(-3));
    }
}