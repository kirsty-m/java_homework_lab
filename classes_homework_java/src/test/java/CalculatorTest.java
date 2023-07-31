import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(3,7);
    }

    @Test
    public void canAdd(){
       assertEquals(10, calculator.add());
    }

    @Test
    public void canSubtract(){
        assertEquals(-4, calculator.subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(21, calculator.multiply());
    }

    @Test
    public void canDivide(){
        assertEquals(0.42857142857142855, calculator.divide(), 0.0);
    }
}
