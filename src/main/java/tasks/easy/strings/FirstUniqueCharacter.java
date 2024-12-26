package tasks.easy.strings;

public class FirstUniqueCharacter {

    /**
     * Runtime: 24 ms;
     * Memory: 45.34 MB;
     * @param s String
     * @return Integer (index of char)
     */
    public int firstUniqueChar(String s) {
        char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i++) {
            if (s.indexOf(str[i]) == s.lastIndexOf(str[i])) { return i; }
        }

        return -1;
    }

    /**
     * Runtime: 27 ms;
     * Memory: 45.30 MB;
     * @param s String
     * @return Integer (index of char)
     */
    public int firstUniqueChar2(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) { return i; }
        }

        return -1;
    }
}
