package tasks.medium.math;

import java.util.Arrays;

public class CountPrimes {

    /**
     * Решение не проходит при n = 499979 (Time Limit Exceeded)
     */
    public int countPrimesTimeLimit(int n) {
        int c = 0;

        for (int i = 0; i < n; i++) {
            c++;
            for (int k = 2; k < i / 2 + 1; k++) {
                if (i % k == 0) {
                    c--;
                    break;
                }
            }
        }

        return c;
    }

    /**
     * Решение через решето Эратосфена
     * Runtime: 92 ms (87,14% Beats);
     * Memory: 49.04 MB (74,03% Beats);
     */
    public int countPrimes(int n) {
        if (n <= 1) { return 0; }

        boolean[] a = new boolean[n];
        Arrays.fill(a, true);

        for (int i = 2; i * i < a.length; i++) {
            if (a[i]) {
                for (int j = i * i; j <= n - 1; j += i) {
                    a[j] = false;
                }
            }
        }

        int c = 0;

        for (boolean b : a) {
            if (b) c++;
        }

        return c - 2;
    }
}
