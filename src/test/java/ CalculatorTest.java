import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Feature("Calculator")
class CalculatorTest {

    @Test
    @Description("Test addition operation")
    @Story("Addition")
    public void testAddition() throws Exception {
        assertEquals("3", Calculator.calculate("1 + 2"));
        assertEquals("10", Calculator.calculate("5 + 5"));
    }

    @Test
    @Description("Test subtraction operation")
    @Story("Subtraction")
    public void testSubtraction() throws Exception {
        assertEquals("1", Calculator.calculate("2 - 1"));
        assertEquals("5", Calculator.calculate("10 - 5"));
    }

    @Test
    @Description("Test multiplication operation")
    @Story("Multiplication")
    public void testMultiplication() throws Exception {
        assertEquals("6", Calculator.calculate("2 * 3"));
        assertEquals("10", Calculator.calculate("2 * 5"));
    }

    @Test
    @Description("Test division operation")
    @Story("Division")
    public void testDivision() throws Exception {
        assertEquals("2", Calculator.calculate("6 / 3"));
        assertEquals("2", Calculator.calculate("10 / 5"));
    }

    @Test
    @Description("Test invalid input")
    @Story("Invalid Input")
    public void testInvalidInput() {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.calculate("1 + 2 1");
        });
        assertNotNull(exception);
    }

    @Test
    @Description("Test invalid operation")
    @Story("Invalid Operation")
    public void testInvalidOperation() {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.calculate("1 % 2");
        });
        assertNotNull(exception);
    }

    @Test
    @Description("Test out of range input")
    @Story("Out of Range")
    public void testOutOfRange() {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.calculate("11 + 2");
        });
        assertNotNull(exception);
    }

    @Test
    @Description("Test division by zero")
    @Story("Division by Zero")
    public void testDivisionByZero() {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.calculate("1 / 0");
        });
        assertNotNull(exception);
    }
}
