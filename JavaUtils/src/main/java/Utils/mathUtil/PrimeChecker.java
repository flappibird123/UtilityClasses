package Utils.mathUtil;

public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;       // 0 and 1 are not prime
        if (n <= 3) return true;        // 2 and 3 are prime
        if (n % 2 == 0 || n % 3 == 0) return false; // divisible by 2 or 3

        // Check numbers of the form 6k ± 1 up to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
