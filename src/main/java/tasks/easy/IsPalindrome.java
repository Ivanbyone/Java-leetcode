package tasks.easy;

public class IsPalindrome {

    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] symbols = str.toCharArray();

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] != symbols[symbols.length - 1 - i]) { return false; }
        }

        return true;
    }

    public boolean isPalindromeSecond(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] symbols = str.toCharArray();

        int indexOne = 0;
        int indexSecond = symbols.length - 1;

        if (symbols.length == 0) {
            return true;
        }

        while (indexOne <= indexSecond) {
            if (symbols[indexOne] != symbols[indexSecond]) {
                return false;
            }

            indexOne++;
            indexSecond--;
        }

        return true;
    }
}
