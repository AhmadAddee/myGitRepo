package company.com;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrintingTest {
    private CalculateMethods calculateMethods;

    @BeforeEach
    public void initTest(){
        calculateMethods = new CalculateMethods();
    }

    @Test
    public void testDivide(){
        // or Assertions.
        assertEquals(10, calculateMethods.divide(100, 10));
    }

    @Test
    public void testDivideByZero(){
        assertThrows(ArithmeticException.class, () -> calculateMethods.divide(100, 0));
    }
}
