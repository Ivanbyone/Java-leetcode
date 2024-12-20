package tasks.easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        String openedSigns = "([{";
        String closedSigns = ")]}";
        HashMap<Character, Character> dictionary = new HashMap<>();

        for (int i = 0; i < closedSigns.length(); i++) {
            dictionary.put(closedSigns.charAt(i), openedSigns.charAt(i));
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (dictionary.get(s.charAt(i)) == null) {
                stack.push(s.charAt(i));
            } else {
                stack.push(s.charAt(i));
                if (stack.size() > 1) {
                    char previous = stack.get(stack.size() - 2);
                    if (previous == dictionary.get(s.charAt(i))) {
                        stack.pop();
                        stack.pop();
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }

        return stack.isEmpty();
    }
}
