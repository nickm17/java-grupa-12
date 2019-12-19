package ro.siit.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testCalculator(){

        int sum = calculator.evaluate("1+2+3+4");
        assertEquals(10, sum);
    }

    @Test
    public void testCalculator2(){

        int sum = calculator.evaluate("1+2+3+4");
        assertEquals(10, sum);
    }

    @Test
    public void testCalculator3(){

        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}
