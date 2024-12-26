import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Проверка операции сложения ")
    public void testAddition() throws Exception {
        assertEquals("3", Calculator.calculate("1 + 2"));
        assertEquals("10", Calculator.calculate("5 + 5"));
    }

    @Test
    @DisplayName("Проверка операции вычитания ")
    public void testSubtraction() throws Exception {
        assertEquals("1", Calculator.calculate("2 - 1"));
        assertEquals("5", Calculator.calculate("10 - 5"));
    }

    @DisplayName("Проверка операции умножения ")
    @Test
    public void testMultiplication() throws Exception {
        assertEquals("6", Calculator.calculate("2 * 3"));
        assertEquals("10", Calculator.calculate("2 * 5"));
    }

    @Test
    public void testDivision() throws Exception {
        assertEquals("2", Calculator.calculate("6 / 3"));
        assertEquals("2", Calculator.calculate("10 / 5"));
    }

    @Test
    @DisplayName("Проверка операции вычитания ")
    public void testInvalidInput() {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.calculate("1 + 2 1");
        });
        assertNotNull(exception);
    }

    @Test
    public void testInvalidOperation() {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.calculate("1 % 2");
        });
        assertNotNull(exception);
    }

    @Test
    public void testOutOfRange() {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.calculate("11 + 2");
        });
        assertNotNull(exception);
    }

    @Test
    @DisplayName("Проверка операции деления на 0 ")

    public void testDivisionByZero() {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.calculate("1 / 0");
        });
        assertNotNull(exception);
    }
}
