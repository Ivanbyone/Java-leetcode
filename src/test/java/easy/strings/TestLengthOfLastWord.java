package easy.strings;

import tasks.easy.strings.LengthOfLastWord;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestLengthOfLastWord {
    private static LengthOfLastWord testingClass;

    @BeforeAll
    public static void init() {
        testingClass = new LengthOfLastWord();
    }

    @Test
    public void test1() {
        String testCase = "Hello World";
        int result = testingClass.lengthOfLastWord(testCase);
        int expectedResult = 5;
        assertEquals(expectedResult, result);
    }

    @Test
    public void test2() {
        String testCase = "   fly me   to   the moon  ";
        int result = testingClass.lengthOfLastWord(testCase);
        int expectedResult = 4;
        assertEquals(expectedResult, result);
    }

    @Test
    public void test3() {
        String testCase = "luffy is still joyboy";
        int result = testingClass.lengthOfLastWord(testCase);
        int expectedResult = 6;
        assertEquals(expectedResult, result);
    }
}
