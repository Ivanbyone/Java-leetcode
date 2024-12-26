package easy.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tasks.easy.strings.FirstUniqueCharacter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFirstUniqueCharacter {
    private static FirstUniqueCharacter testClass;

    @BeforeAll
    public static void init() {
        testClass = new FirstUniqueCharacter();
    }

    @Test
    public void test1() {
        String s = "leetcode";
        int expectedResult = 0;
        int result = testClass.firstUniqueChar(s);
        assertEquals(expectedResult, result);
    }

    @Test
    public void test2() {
        String s = "loveleetcode";
        int expectedResult = 2;
        int result = testClass.firstUniqueChar(s);
        assertEquals(expectedResult, result);
    }

    @Test
    public void test3() {
        String s = "aabb";
        int expectedResult = -1;
        int result = testClass.firstUniqueChar(s);
        assertEquals(expectedResult, result);
    }
}
