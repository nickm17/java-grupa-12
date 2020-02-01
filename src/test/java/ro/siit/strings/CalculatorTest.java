package ro.siit.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitPlatform.class)
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testCalculator(){

        int sum = calculator.evaluate("1+2+3+4+5");
        assertEquals(15, sum);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1+2+3+4", "3+3+4", "1+2+1+1+5"})
    public void testCalculator2(String expression){

        int sum = calculator.evaluate(expression);
        assertEquals(10, sum);
    }

    @Test
    public void testCalculator3(){

        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}
