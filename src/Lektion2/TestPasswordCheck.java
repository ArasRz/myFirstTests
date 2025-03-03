package Lektion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPasswordCheck {
    @Test
    void moreThan8Chars() {
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;
        boolean actual = pass.check("passwordd"); // Too short
        assertEquals(expected, actual);
    }

    @Test
    void testAtLeast8Characters() {
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;
        boolean actual = pass.check("pass"); // Long enough
        assertEquals(expected, actual);
    }

    @Test
    void atLeastOneNum() {
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;
        boolean actual = pass.check("passwor"); // Contains a number
        assertEquals(expected, actual);
    }

}
