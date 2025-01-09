package medium.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tasks.medium.strings.ReverseWords;

import static org.junit.jupiter.api.Assertions.*;

public class TestReverseWords {
    private static ReverseWords testClass;

    @BeforeAll
    public static void init() {
        testClass = new ReverseWords();
    }

    @Test
    public void test1() {
        String s = "the sky is blue";
        String expectedOutput = "blue is sky the";
        String result = testClass.reverseWords(s);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void test2() {
        String s = "  hello world  ";
        String expectedOutput = "world hello";
        String result = testClass.reverseWords2(s);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void test3() {
        String s = "a good   example";
        String expectedOutput = "example good a";
        String result = testClass.reverseWords3(s);
        assertEquals(expectedOutput, result);
    }
}
