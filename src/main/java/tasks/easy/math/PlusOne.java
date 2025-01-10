package tasks.easy.math;

import java.util.Arrays;

public class PlusOne {

    /**
     * Runtime: 0 ms (100,00% Beats);
     * Memory: 41.72 MB (73,05% Beats);
     */
    public int[] plusOne(int[] digits) {
        int a = digits[digits.length - 1];

        if (a != 9) {
            a++;
            digits[digits.length - 1] = a;
        } else {
            int counter = digits.length - 1;

            while (digits[counter] == 9) {
                a = 0;
                digits[counter] = a;

                if (counter == 0) {
                    int[] d = new int[digits.length + 1];

                    for (int i = 1; i < digits.length; i++) {
                        d[i] = digits[i];
                    }

                    d[0] = 1;
                    return d;
                }
                counter--;
            }
        }

        return digits;
    }
}
