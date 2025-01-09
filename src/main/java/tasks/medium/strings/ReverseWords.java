package tasks.medium.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseWords {

    /**
     * Runtime: 8 ms;
     * Memory: 43.20 MB;
     */
    public String reverseWords(String s) {
        List<String> l = List.of(s.replaceAll("\\s+", " ").split(" "));
        return String.join(" ", l.reversed()).trim();
    }

    /**
     * Runtime: 8 ms (44,00% Beats);
     * Memory: 42.67 MB (92,74% Beats);
     */
    public String reverseWords2(String s) {
        String[] l = s.split("\\s+");

        int a = 0;
        int b = l.length - 1;

        while (a < b) {
            String c = l[a];
            l[a] = l[b];
            l[b] = c;

            a++;
            b--;
        }

        return String.join(" ", l).trim();
    }

    /**
     * Самое оптимальное и сбалансированное решение по скорости и памяти
     * Runtime: 6 ms (86,09% Beats;
     * Memory: 42.67 MB (76,72% Beats);
     */
    public String reverseWords3(String s) {
        String[] l = s.split("\\s+");

        int a = 0;
        int b = l.length - 1;

        while (a < b) {
            String c = l[a];
            l[a] = l[b];
            l[b] = c;

            a++;
            b--;
        }

        StringBuilder str = new StringBuilder();

        for (String elem: l) {
            str.append(elem).append(" ");
        }

        return str.toString().trim();
    }
}
