package training.maven.library.example;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Jason on 3/18/2017.
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        Integer sum = calc.add(2, 2);
        assertTrue(sum == 4);
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        Integer sum = calc.subtract(6, 2);
        assertTrue(sum == 4);
    }

}
