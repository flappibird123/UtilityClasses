package mathUtilTests;

import Utils.mathUtil.StatsChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsCheckerTest {

    // ===== TESTS FOR mean() =====
    @Test
    void testMeanWithNormalNumbers() {
        assertEquals(3.0, StatsChecker.mean(1, 2, 3, 4, 5));
        assertEquals(2.5, StatsChecker.mean(1, 4));
        assertEquals(0.0, StatsChecker.mean(0, 0, 0));
    }

    @Test
    void testMeanWithSingleNumber() {
        assertEquals(7.0, StatsChecker.mean(7));
    }

    @Test
    void testMeanWithNegativeNumbers() {
        assertEquals(-2.0, StatsChecker.mean(-1, -2, -3));
    }

    @Test
    void testMeanWithEmptyArray() {
        Exception exception = assertThrows(RuntimeException.class, () -> StatsChecker.mean());
        assertEquals("Length cannot be zero", exception.getMessage());
    }

    // ===== TESTS FOR mode() =====
    @Test
    void testModeWithNormalNumbers() {
        assertEquals(2, StatsChecker.mode(1, 2, 2, 3, 4));
        assertEquals(5, StatsChecker.mode(5, 5, 5, 1, 2));
    }

    @Test
    void testModeWithMultipleModes() {
        // In case of tie, method returns first highest occurrence it finds
        assertEquals(1, StatsChecker.mode(1, 1, 2, 2));
    }

    @Test
    void testModeWithSingleNumber() {
        assertEquals(7, StatsChecker.mode(7));
    }

    @Test
    void testModeWithEmptyArray() {
        Exception exception = assertThrows(RuntimeException.class, () -> StatsChecker.mode());
        assertEquals("Length cannot be zero", exception.getMessage());
    }

    // ===== TESTS FOR median() =====
    @Test
    void testMedianWithOddNumberOfElements() {
        assertEquals(3, StatsChecker.median(1, 3, 5));
        assertEquals(5, StatsChecker.median(7, 5, 9));
    }

    @Test
    void testMedianWithEvenNumberOfElements() {
        assertEquals(3, StatsChecker.median(1, 2, 3, 4));
        assertEquals(5, StatsChecker.median(1, 5, 5, 9));
    }

    @Test
    void testMedianWithSingleNumber() {
        assertEquals(7, StatsChecker.median(7));
    }

    @Test
    void testMedianWithEmptyArray() {
        Exception exception = assertThrows(RuntimeException.class, () -> StatsChecker.median());
        assertEquals("Length cannot be zero", exception.getMessage());
    }
}
