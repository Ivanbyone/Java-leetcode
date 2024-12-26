package medium.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tasks.medium.strings.SortCharsByFrequency;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSortCharsByFrequency {
    private static SortCharsByFrequency testClass;

    @BeforeAll
    public static void init() {
        testClass = new SortCharsByFrequency();
    }

    @Test
    public void test1() {
        String s = "tree";
        String expectedResult = "eert";
        String result = testClass.frequencySort(s);
        assertEquals(expectedResult, result);
    }

    @Test
    public void test2() {
        String s = "Aabb";
        String expectedResult = "bbAa";
        String result = testClass.frequencySort(s);
        assertEquals(expectedResult, result);
    }

    @Test
    public void test3() {
        String s = "cccaaa";
        String expectedResult = "aaaccc";
        String result = testClass.frequencySort(s);
        assertEquals(expectedResult, result);
    }
}
