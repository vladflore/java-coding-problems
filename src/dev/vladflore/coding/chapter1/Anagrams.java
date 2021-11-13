package dev.vladflore.coding.chapter1;

import dev.vladflore.coding.Problem;

public class Anagrams implements Problem {

    private final String str1;
    private final String str2;

    public Anagrams(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public static void main(String[] args) {
        Anagrams problem = new Anagrams("flore", "lerof");
        String multiline = """
                This is a multiline string,
                added in Java 13, before
                it was dropped in Java 12
                """;
        System.out.println(multiline);
        problem.solve(problem::solution1);
    }

    private void solution1() {
        int[] charCounts = new int[256];
        char[] chars1 = str1.replaceAll("\\s", "").toCharArray();
        char[] chars2 = str2.replaceAll("\\s", "").toCharArray();
        if (chars1.length != chars2.length) {
            System.out.println(false);
            return;
        }
        for (int i = 0; i < chars1.length; i++) {
            charCounts[chars1[i]]++;
            charCounts[chars2[i]]--;
        }
        for (int charCount : charCounts) {
            if (charCount != 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
