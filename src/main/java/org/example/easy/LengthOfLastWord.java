package org.example.easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        return array[array.length - 1].length();
    }
}
