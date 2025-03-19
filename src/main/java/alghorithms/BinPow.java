package alghorithms;

public class BinPow {

    /**
     * Алгоритм бинарного возведения в степень
     * Предполагается возведение в степень за O(log n) вместо n умножений при обычном подходе.
     * @param a основание
     * @param n показатель степени
     * @return результат возведения в степень
     */
    public int binPow(int a, int n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 1) {
            return binPow(a, n - 1) * a;
        }

        int b = binPow(a, n / 2);
        return b * b;
    }
}
