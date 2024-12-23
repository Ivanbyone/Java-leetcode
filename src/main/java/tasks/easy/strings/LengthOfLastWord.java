package tasks.easy.strings;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        return array[array.length - 1].length();
    }
}
