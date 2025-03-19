package algoTest;

import org.junit.jupiter.api.BeforeAll;
import alghorithms.BinPow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinPow {
    private static BinPow testClass;

    @BeforeAll
    public static void init() {
        testClass = new BinPow();
    }

    @Test
    public void test1() {
        int base = 2;
        int target = 3;
        int expectedOutput = 8;
        int res = testClass.binPow(base, target);
        assertEquals(expectedOutput, res);
    }

    @Test
    public void test2() {
        int base = 2;
        int target = 20;
        int expectedOutput = 1048576;
        int res = testClass.binPow(base, target);
        assertEquals(expectedOutput, res);
    }
}
