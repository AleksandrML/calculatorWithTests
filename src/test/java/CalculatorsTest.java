import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorsTest {

    @Test
    public void testPlus() {
        // given:
        int a = 1, b = 2, expected = 3;
        // when:
        int result = Calculator.plus(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMinus() {
        // given:
        int a = 1, b = 2, expected = -1;
        // when:
        int result = Calculator.minus(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
        // given:
        int a = 1, b = 0, expected = 0;
        // when:
        int result = Calculator.multiply(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

}
