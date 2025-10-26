package mathUtilTests;

import Utils.mathUtil.PrimeChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    @Test
    void testNegativeNumbers() {
        assertFalse(PrimeChecker.isPrime(-10), "-10 should not be prime");
        assertFalse(PrimeChecker.isPrime(-1), "-1 should not be prime");
    }

    @Test
    void testZeroAndOne() {
        assertFalse(PrimeChecker.isPrime(0), "0 should not be prime");
        assertFalse(PrimeChecker.isPrime(1), "1 should not be prime");
    }

    @Test
    void testSmallPrimes() {
        assertTrue(PrimeChecker.isPrime(2), "2 should be prime");
        assertTrue(PrimeChecker.isPrime(3), "3 should be prime");
        assertTrue(PrimeChecker.isPrime(5), "5 should be prime");
        assertTrue(PrimeChecker.isPrime(7), "7 should be prime");
    }

    @Test
    void testSmallNonPrimes() {
        assertFalse(PrimeChecker.isPrime(4), "4 should not be prime");
        assertFalse(PrimeChecker.isPrime(6), "6 should not be prime");
        assertFalse(PrimeChecker.isPrime(9), "9 should not be prime");
    }

    @Test
    void testLargePrimes() {
        assertTrue(PrimeChecker.isPrime(7919), "7919 should be prime"); // known prime
    }

    @Test
    void testLargeNonPrimes() {
        assertFalse(PrimeChecker.isPrime(8000), "8000 should not be prime");
        assertFalse(PrimeChecker.isPrime(10000), "10000 should not be prime");
    }

    @Test
    void testEvenNumbersGreaterThanTwo() {
        for (int i = 4; i <= 20; i += 2) {
            assertFalse(PrimeChecker.isPrime(i), i + " should not be prime");
        }
    }
}
