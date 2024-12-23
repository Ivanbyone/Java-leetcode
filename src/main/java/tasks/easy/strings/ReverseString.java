package tasks.easy.strings;

public class ReverseString {

    /**
     * O(1) extra memory algorithm in-place reversing string
     * Runtime: 0 ms
     * Memory: 45.64 MB
     * @param s char array
     */
    public void reverseString(char[] s) {
        int a = 0;
        int b = s.length - 1;

        while (a < b) {
            char c = s[a];
            s[a] = s[b];
            s[b] = c;

            a++;
            b--;
        }
    }

    /**
     * Using StringBuilder for reversing string
     * Runtime: 2 ms
     * Memory: 49.29 MB
     * @param s char array
     */
    public void reverseString2(char[] s) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(s);
        buffer.reverse();

        for (int i = 0; i < s.length; i++) {
            s[i] = buffer.charAt(i);
        }
    }
}
