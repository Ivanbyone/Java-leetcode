package easy.strings;

import tasks.easy.strings.ValidParentheses;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestValidParentheses {
    private static ValidParentheses testClass;

    @BeforeAll
    public static void init() {
        testClass = new ValidParentheses();
    }

    @Test
    public void testValidParentheses1() {
        String s = "()";
        assertTrue(testClass.isValid(s));
    }

    @Test
    public void testValidParentheses2() {
        String s = "(]";
        assertFalse(testClass.isValid(s));
    }

    @Test
    public void testValidParentheses3() {
        String s = "()[]{}";
        assertTrue(testClass.isValid(s));
    }

    @Test
    public void testValidParentheses4() {
        String s = "([])";
        assertTrue(testClass.isValid(s));
    }
}
