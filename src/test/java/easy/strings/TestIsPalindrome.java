package easy.strings;

import tasks.easy.strings.IsPalindrome;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestIsPalindrome {
    private static IsPalindrome testClass;

    @BeforeAll
    public static void init() {
        testClass = new IsPalindrome();
    }

    @Test
    public void test1() {
        String s = "A man, a plan, a canal: Panama";
        boolean result = testClass.isPalindrome(s);
        assertTrue(result);
    }

    @Test
    public void test2() {
        String s = "A man, a plan, a canal: Panama";
        boolean result = testClass.isPalindromeSecond(s);
        assertTrue(result);
    }

    @Test
    public void test3() {
        String s = " ";
        boolean result = testClass.isPalindrome(s);
        assertTrue(result);
    }

    @Test
    public void test4() {
        String s = " ";
        boolean result = testClass.isPalindromeSecond(s);
        assertTrue(result);
    }

    @Test
    public void test5() {
        String s = "race a car";
        boolean result = testClass.isPalindrome(s);
        assertFalse(result);
    }

    @Test
    public void test6() {
        String s = "race a car";
        boolean result = testClass.isPalindromeSecond(s);
        assertFalse(result);
    }
}
