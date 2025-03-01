package Lektion1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Enhetstest {

    @Test
    void testAddition() {
        // Arrange
        Calculator calc = new Calculator(4, 3);
        int expected = 7;

        // Act
        int actual = calc.add();

        // Assert
        assertEquals(expected, actual, "4 + 3 should be 7");
    }
}



