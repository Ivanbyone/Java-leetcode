package easy.strings;

import tasks.easy.strings.ValidAnagram;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestValidAnagram {
    private static ValidAnagram testClass;

    @BeforeAll
    public static void init() {
        testClass = new ValidAnagram();
    }

    @Test
    public void test1() {
        String testcase1 = "anagram";
        String testcase2 = "nagaram";
        boolean result = testClass.isAnagram(testcase1, testcase2);
        assertTrue(result);
    }
}
