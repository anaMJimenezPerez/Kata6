import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testSum(){
        int result = calculator.sum(8, 5);
        assertEquals(result, 13);
    }
    @Test
    public void testSub(){
        int result = calculator.substraction(8, 5);
        assertEquals(result, 3);
    }
    @Test
    public void testMultiplication(){
        int result = calculator.multiplication(8, 5);
        assertEquals(result, 40);
    }

    @Test
    public void testDivision(){
        double result = calculator.division(10, 5);
        assertEquals(result, 2.0, 1);
    }

    @Test
    public void testDivisionByZero(){
        assertThrows(IllegalArgumentException.class, () -> calculator.division(10,0));
    }

}
