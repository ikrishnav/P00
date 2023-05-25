import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        int a = 4321;
        int b = 1234;

        Calculator cal = new Calculator();
        int actual = cal.add(a, b);

        int expected = 5555;
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int a = 5000;
        int b = 2000;

        Calculator cal = new Calculator();
        int actual = cal.subtract(a, b);

        int expected = 3000;
        assertEquals(expected, actual);
    }

    @Test 
    public void testMultiply() {
        int a = 5;
        int b = 10;

        Calculator cal = new Calculator();
        int actual = cal.multiply(a, b);

        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int a = 20;
        int b = 5;

        Calculator cal = new Calculator();
        double actual = cal.divide(a, b);

        double expected = 4.0;
        assertEquals(expected, actual, 0.001);
    }


}
