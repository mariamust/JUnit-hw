import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestCalculator {

    @BeforeEach
    void start() {
        System.out.println("Test starting");
    }

    @AfterEach
    void complet() {
        System.out.println("Test completed");
    }

    @org.junit.jupiter.api.Test
    public void testadd() {
        Calculator calc1 = new Calculator();
        int a = 5, b = 6, expected = 11;

        int result = calc1.sum(5, 6);

        Assertions.assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    public void testsub() {
        Calculator calc2 = new Calculator();
        int a = 5, b = 6, expected = -1;

        int result = calc2.sub(5, 6);

        Assertions.assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    public void testdiv() {
        Calculator calc3 = new Calculator();
        double a = 5, b = 6, expected = 0.8333333333333334;

        double result = calc3.div(5, 6);

        Assertions.assertEquals(result, expected);
    }
}
