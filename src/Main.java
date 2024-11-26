import java.math.BigInteger;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static BigInteger[] cache;

    public static void main(String[] args) {
        int n = 100;

        cache = new BigInteger[n + 1];

        System.out.println(Arrays.toString(cache));
        System.out.println(fibonacci(n));
    }

    public static BigInteger fibonacci(int n) {
        //changed to bigInteger zero and one because why not
        if (n == 0)
            return BigInteger.ZERO;
        else if (n == 1)
            return BigInteger.ONE;

        //changed from 0 to null because BigInteger Array initialised with null values
        if (cache[n] != null) {
            return cache[n];
        }
        //removed fibonacci variable because its stored in current cache[n]
        cache[n] = fibonacci(n - 1).add(fibonacci(n - 2));
        return cache[n];
    }
}