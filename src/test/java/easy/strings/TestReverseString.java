package easy.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tasks.easy.strings.ReverseString;

import static org.junit.jupiter.api.Assertions.*;

public class TestReverseString {
    private static ReverseString testClass;

    @BeforeAll
    public static void init() {
        testClass = new ReverseString();
    }

    @Test
    public void test1() {
        char[] s = {'h','e','l','l','o'};
        testClass.reverseString(s);
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        assertArrayEquals(expected, s);
    }

    @Test
    public void test2() {
        char[] s = {'H','a','n','n','a', 'h'};
        testClass.reverseString(s);
        char[] expected = {'h','a','n','n','a', 'H'};
        assertArrayEquals(expected, s);
    }
}
